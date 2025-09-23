/**
 * Detailed walkthrough of Nullability & null-safe operators in Kotlin.
 * Each block shows a concept with a safe example and an explanation comment.
 *
 * Save this file and run `main()` to see printed outputs for the safe demonstrations.
 */

data class Address(val city: String?, val country: String?)
data class Person(val name: String?, val address: Address?)

fun main() {
    // -------------------------------
    // 1) Non-nullable vs Nullable types
    // -------------------------------
    // `String` (without ?) cannot hold null. Compiler enforces this.
    val nonNullable: String = "Hello"
    println("nonNullable: $nonNullable")

    // `String?` (with ?) is nullable — it can hold a String or null.
    val nullable: String? = null
    println("nullable initial: $nullable") // prints "null"

    // -------------------------------
    // 2) Safe call operator `?.`
    // -------------------------------
    // Safe call: `receiver?.member` returns `member` if receiver != null, otherwise returns null.
    // The result type becomes nullable (e.g., Int?).
    val lengthOrNull: Int? = nullable?.length
    // Since `nullable` is null, `nullable?.length` evaluates to null (no exception).
    println("lengthOrNull (nullable?.length): $lengthOrNull") // prints "null"

    // -------------------------------
    // 3) Elvis operator `?:`
    // -------------------------------
    // Elvis: `a ?: b` — if `a` is not null use `a`, otherwise evaluate to `b`.
    // Commonly used to provide a default value when left side is null.
    val lengthOrZero: Int = nullable?.length ?: 0
    println("lengthOrZero (nullable?.length ?: 0): $lengthOrZero") // prints "0"

    // Elvis can be used to throw an exception if value is missing:
    // val lengthOrThrow: Int = nullable?.length ?: throw IllegalStateException("Name was null")
    // The above line will throw at runtime when `nullable` is null. We show a safe demo using try/catch:
    try {
        val l = nullable?.length ?: throw IllegalStateException("Elvis: name was null")
        println("This won't print because an exception was thrown: $l")
    } catch (e: Exception) {
        println("Elvis with throw produced: ${e.message}") // we catch and print the message
    }

    // -------------------------------
    // 4) Not-null assertion `!!`
    // -------------------------------
    // `value!!` tells compiler: "I guarantee this is not null" — but if it *is* null, you'll get an exception.
    // Avoid `!!` unless you are absolutely certain the value cannot be null at runtime.
    try {
        // This will throw KotlinNullPointerException (a kind of NPE)
        val forced = nullable!!.length
        println("forced length: $forced") // won't run
    } catch (e: Exception) {
        println("Using !! on a null value throws: ${e::class.simpleName} — ${e.message}")
    }

    // -------------------------------
    // 5) `let` with safe call `?.let { ... }`
    // -------------------------------
    // `x?.let { ... }` executes the lambda only if x is not null.
    // Inside the lambda, `it` (or a named parameter) is *non-null* and the compiler smart-casts it.
    val name: String? = "Kotlin"
    name?.let {
        // Inside here `it` is a non-null String. No need for `!!`.
        println("Inside let: name is '$it' and length ${it.length}")
    }

    // If `name` were null, the let-block would be skipped entirely.

    // -------------------------------
    // 6) Chaining safe calls (useful for nested objects)
    // -------------------------------
    // Safe call chains short-circuit: evaluation stops at the first null.
    val p1 = Person("Alice", Address("Paris", "France"))
    val p2 = Person("Bob", null)
    val p3 = Person(null, null)

    // Access nested country length safely: person.address?.country?.length
    // - If person.address is null -> whole expression becomes null.
    // - If address.country is null -> expression becomes null.
    println("p1 country length: ${p1.address?.country?.length ?: "unknown"}") // prints number
    println("p2 country length: ${p2.address?.country?.length ?: "unknown"}") // prints "unknown"
    println("p3 country length: ${p3.address?.country?.length ?: "unknown"}") // prints "unknown"

    // This pattern avoids many explicit null checks like:
    // if (person != null && person.address != null && person.address.country != null) ...

    // -------------------------------
    // 7) Smart cast after explicit null check
    // -------------------------------
    val maybe: String? = "smart"
    if (maybe != null) {
        // Inside this if-block the compiler knows `maybe` is non-null and will let you access `.length`
        println("Smart-cast: maybe.length = ${maybe.length}")
    } else {
        println("maybe is null")
    }

    // -------------------------------
    // 8) Common usage patterns and guidance
    // -------------------------------
    // - Prefer `?.` + `?:` to give defaults and avoid crashes:
    //      val safe = possiblyNull?.doSomething() ?: defaultValue
    // - Use `?.let { ... }` when you want to run side-effects only when value exists:
    //      user?.let { sendWelcomeEmail(it) }
    // - Avoid `!!` as it defeats compiler null-safety (it converts a null-safety compile-time check into a runtime crash).
    // - When dealing with Java code (platform types), treat returned values as potentially null and be defensive.
    //
    // Quick summary table (examples):
    // - `x?.prop`  -> returns prop or null (safe)
    // - `x?.method()` -> calls method only if x != null
    // - `x ?: default` -> fallback value if x is null
    // - `x!!` -> force; throws if x is null
    // - `x?.let { }` -> run block only if x != null, with `it` non-null inside block

    // -------------------------------
    // 9) Small extra examples: converting input safely
    // -------------------------------
    val input: String? = "123"
    // toIntOrNull() returns Int? (null if parsing fails)
    val parsed: Int? = input?.toIntOrNull()
    println("parsed: $parsed (type Int?)")

    // Combine with Elvis to provide default:
    val parsedOrZero: Int = input?.toIntOrNull() ?: 0
    println("parsedOrZero: $parsedOrZero (safe default)")
}

/*
 OUTPUT (expected when running):
 nonNullable: Hello
 nullable initial: null
 lengthOrNull (nullable?.length): null
 lengthOrZero (nullable?.length ?: 0): 0
 Elvis with throw produced: Elvis: name was null
 Using !! on a null value throws: KotlinNullPointerException — null
 Inside let: name is 'Kotlin' and length 6
 p1 country length: 6
 p2 country length: unknown
 p3 country length: unknown
 Smart-cast: maybe.length = 5
 parsed: 123 (type Int?)
 parsedOrZero: 123 (safe default)
*/
