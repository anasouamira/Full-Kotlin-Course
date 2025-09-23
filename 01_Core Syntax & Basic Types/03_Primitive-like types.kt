fun main() {
    // ===========================================
    // 1️⃣ Int (Integer)
    // Represents a 32-bit signed integer value.
    // Suitable for whole numbers in the range -2,147,483,648 to 2,147,483,647.
    // ===========================================
    val age: Int = 25
    println("Age (Int): $age")

    // ===========================================
    // 2️⃣ Long
    // Represents a 64-bit signed integer value.
    // Useful for very large whole numbers beyond Int range.
    // ===========================================
    val population: Long = 7800000000
    println("World population (Long): $population")

    // ===========================================
    // 3️⃣ Double
    // Represents a 64-bit floating-point number (decimal).
    // Provides high precision for real numbers.
    // ===========================================
    val pi: Double = 3.141592653589793
    println("Pi (Double): $pi")

    // ===========================================
    // 4️⃣ Float
    // Represents a 32-bit floating-point number (decimal).
    // Less precision than Double but uses less memory.
    // 'f' suffix is required for Float literals.
    // ===========================================
    val temperature: Float = 36.6f
    println("Temperature (Float): $temperature")

    // ===========================================
    // 5️⃣ Boolean
    // Represents a true or false value.
    // Commonly used in conditional statements and flags.
    // ===========================================
    val isStudent: Boolean = true
    println("Is student? (Boolean): $isStudent")

    // ===========================================
    // 6️⃣ Char (Character)
    // Represents a single character, e.g., letters, digits, or symbols.
    // Use single quotes to declare Char literals.
    // ===========================================
    val grade: Char = 'A'
    println("Grade (Char): $grade")

    // ===========================================
    // 7️⃣ Summary of primitive-like types
    // - Int, Long: whole numbers (Integers)
    // - Double, Float: decimal numbers (Floating point)
    // - Boolean: true/false values
    // - Char: single character
    // Kotlin uses these types as wrapper classes internally,
    // but they behave like primitives in terms of performance.
    // ===========================================
}
