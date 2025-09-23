fun main() {
    // ===========================================
    // 1️⃣ Immutable variable using 'val'
    // 'val' declares a variable that cannot be reassigned after its initial assignment.
    // This means the value is read-only. Trying to reassign it will cause a compile-time error.
    // It's similar to 'final' in Java or 'const' in JavaScript.
    // Using 'val' is a good practice when you know the value should not change.
    // ===========================================
    val pi: Double = 3.14159
    println("Value of pi (val, immutable): $pi")

    // Uncommenting the next line will cause a compile error because 'pi' is immutable
    // pi = 3.14 // ❌ Error: Val cannot be reassigned

    // ===========================================
    // 2️⃣ Mutable variable using 'var'
    // 'var' declares a variable that can be reassigned later.
    // This is useful when the value is expected to change during program execution.
    // The type can be explicit (Int, String, etc.) or inferred by Kotlin from the initial value.
    // ===========================================
    var age: Int = 25
    println("Initial age (var, mutable): $age")

    // Reassigning a mutable variable is allowed
    age = 26
    println("Updated age after birthday: $age")

    // ===========================================
    // 3️⃣ Type inference
    // Kotlin can automatically infer the type of a variable from the assigned value.
    // Even without specifying Int explicitly, the compiler knows 'score' is Int.
    // ===========================================
    var score = 100 // Kotlin infers Int
    println("Score (type inferred): $score")

    // Updating the mutable variable
    score += 50
    println("Updated score: $score")

    // ===========================================
    // 4️⃣ Immutable vs mutable summary
    // - val: immutable, cannot be reassigned, safe for constants
    // - var: mutable, can be reassigned, flexible for changing values
    // Using val when possible improves safety and readability of the code.
    // ===========================================
}
