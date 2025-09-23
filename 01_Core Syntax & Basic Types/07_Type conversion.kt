fun main() {
    // ===========================================
    // 1️⃣ What is Type Conversion?
    // Type conversion is the process of converting a variable from one type to another.
    // In Kotlin, explicit conversion functions are used because implicit conversion is not allowed.
    // Examples: toInt(), toDouble(), toFloat(), toLong(), toString(), etc.
    // ===========================================

    // ===========================================
    // 2️⃣ Converting Double to Int
    // Using toInt() converts a decimal number to an integer by truncating the fractional part.
    // It does NOT round the number, it simply removes the decimal part.
    // ===========================================
    val pi: Double = 3.14159
    val piAsInt: Int = pi.toInt() // 3
    println("Double to Int: $pi -> $piAsInt")

    // ===========================================
    // 3️⃣ Converting Int to Double
    // Using toDouble() converts an integer to a decimal number (Double).
    // This is useful when performing calculations that require floating-point precision.
    // ===========================================
    val age: Int = 25
    val ageAsDouble: Double = age.toDouble()
    println("Int to Double: $age -> $ageAsDouble")

    // ===========================================
    // 4️⃣ Converting String to Int/Double
    // You can convert a numeric string to Int or Double using toInt() or toDouble().
    // Be careful: the string must represent a valid number, otherwise it throws an exception.
    // ===========================================
    val strNumber = "123"
    val numberInt = strNumber.toInt()
    val numberDouble = strNumber.toDouble()
    println("String to Int: $strNumber -> $numberInt")
    println("String to Double: $strNumber -> $numberDouble")

    // ===========================================
    // 5️⃣ Converting Int/Double to String
    // You can convert numeric types to String using toString().
    // ===========================================
    val score: Int = 95
    val scoreStr: String = score.toString()
    println("Int to String: $score -> \"$scoreStr\"")

    val piStr: String = pi.toString()
    println("Double to String: $pi -> \"$piStr\"")

    // ===========================================
    // 6️⃣ Summary
    // - Kotlin does NOT allow implicit conversions.
    // - Use explicit functions like toInt(), toDouble(), toFloat(), toLong(), toString()
    // - Useful for calculations, parsing input, and formatting output.
    // ===========================================
}
