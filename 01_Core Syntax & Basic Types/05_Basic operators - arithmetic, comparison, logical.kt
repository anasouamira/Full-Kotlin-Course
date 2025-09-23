fun main() {
    // ===========================================
    // 1️⃣ Arithmetic Operators
    // Used to perform basic mathematical operations like addition, subtraction, multiplication, division, and modulus.
    // ===========================================
    val a = 10
    val b = 3

    val sum = a + b       // addition (+)
    val difference = a - b // subtraction (-)
    val product = a * b   // multiplication (*)
    val quotient = a / b  // division (/) -> integer division for Int
    val remainder = a % b // modulus (%) -> remainder after division

    println("Arithmetic Operators:")
    println("a + b = $sum")
    println("a - b = $difference")
    println("a * b = $product")
    println("a / b = $quotient")
    println("a % b = $remainder")

    // ===========================================
    // 2️⃣ Comparison Operators
    // Used to compare values. They return Boolean (true/false).
    // Common operators: ==, !=, >, <, >=, <=
    // ===========================================
    println("\nComparison Operators:")
    println("a == b: ${a == b}")   // equals
    println("a != b: ${a != b}")   // not equals
    println("a > b: ${a > b}")     // greater than
    println("a < b: ${a < b}")     // less than
    println("a >= b: ${a >= b}")   // greater than or equal
    println("a <= b: ${a <= b}")   // less than or equal

    // ===========================================
    // 3️⃣ Logical Operators
    // Used to combine Boolean expressions.
    // Common operators: && (AND), || (OR), ! (NOT)
    // ===========================================
    val isAdult = true
    val hasID = false

    println("\nLogical Operators:")
    println("isAdult && hasID: ${isAdult && hasID}") // AND: true only if both are true
    println("isAdult || hasID: ${isAdult || hasID}") // OR: true if at least one is true
    println("!isAdult: ${!isAdult}")                // NOT: inverts the boolean value

    // ===========================================
    // 4️⃣ Summary
    // Arithmetic operators: +, -, *, /, %
    // Comparison operators: ==, !=, >, <, >=, <=
    // Logical operators: &&, ||, !
    // These operators are essential for calculations, comparisons, and decision-making in code.
    // ===========================================
}
