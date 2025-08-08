fun main() {
    // 🔹 Comparison operators are used to compare two values.
    // They always return a Boolean value: true or false.

    val a = 10
    val b = 5

    // ==  Equal to: returns true if both values are the same
    println("$a == $b : ${a == b}") // false

    // !=  Not equal to: returns true if values are different
    println("$a != $b : ${a != b}") // true

    // >  Greater than: returns true if the first value is bigger
    println("$a > $b : ${a > b}") // true

    // <  Less than: returns true if the first value is smaller
    println("$a < $b : ${a < b}") // false

    // >=  Greater than or equal to: true if first is bigger OR equal
    println("$a >= $b : ${a >= b}") // true

    // <=  Less than or equal to: true if first is smaller OR equal
    println("$a <= $b : ${a <= b}") // false

    // 🔄 Example with equal numbers
    val x = 7
    val y = 7
    println("$x == $y : ${x == y}")  // true
    println("$x >= $y : ${x >= y}")  // true
    println("$x <= $y : ${x <= y}")  // true
}
