fun main() {
    // 🔹 Nullable String
    val name: String? = null

    // 1️⃣ Safe call (?.)
    // Returns the length if name is not null, otherwise returns null
    val length: Int? = name?.length
    println("Length (safe call): $length") // Output: null

    // 2️⃣ Elvis operator (?:)
    // Provides a default value if the left side is null
    val safeLength: Int = name?.length ?: 0
    println("Length with default: $safeLength") // Output: 0

    // 3️⃣ Not-null assertion (!!)
    // Forces access — will throw NullPointerException if name is null
    // val crash = name!!.length // ❌ Avoid unless you're absolutely sure it's not null

    // 4️⃣ let{} with safe call
    name?.let { 
        println("Name is $it and length is ${it.length}")
    } // Block won't run because name is null

    // ✅ Example with a real value
    val nickname: String? = "Kotlin"
    val nickLength = nickname?.length ?: 0
    println("Nickname length: $nickLength") // Output: 6
}
