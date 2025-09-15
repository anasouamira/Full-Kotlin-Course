fun main() {
    // 🔹 Arithmetic operators are used to perform mathematical operations.

    // Let's create some variables to use in our examples
    val a: Int = 10
    val b: Int = 3

    // ➕ Addition (+) : Adds two values
    val sum = a + b
    println("Addition: $a + $b = $sum") // Output: 10 + 3 = 13

    // ➖ Subtraction (-) : Subtracts the second value from the first
    val difference = a - b
    println("Subtraction: $a - $b = $difference") // Output: 10 - 3 = 7

    // ✖ Multiplication (*) : Multiplies two values
    val product = a * b
    println("Multiplication: $a * $b = $product") // Output: 10 * 3 = 30

    // ➗ Division (/) : Divides the first value by the second
    val quotient = a / b
    println("Division: $a / $b = $quotient") // Output: 10 / 3 = 3 (integer division)

    // 🔹 Note: If you want decimal results, use Double or Float types
    val decimalQuotient = a.toDouble() / b
    println("Division with decimal: $a / $b = $decimalQuotient") // Output: 3.333...

    // ➰ Modulus (%) : Returns the remainder of a division
    val remainder = a % b
    println("Modulus: $a % $b = $remainder") // Output: 10 % 3 = 1

    // 🔄 We can also use variables of other numeric types like Double, Float, Long
    val x: Double = 5.5
    val y: Double = 2.0
    println("Example with Doubles: ${x + y}") // Output: 7.5
}
