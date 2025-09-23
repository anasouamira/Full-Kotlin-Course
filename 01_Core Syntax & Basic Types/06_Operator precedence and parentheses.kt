fun main() {
    // ===========================================
    // 1️⃣ Operator Precedence
    // Operator precedence determines the order in which operations are performed.
    // Operators with higher precedence are evaluated before those with lower precedence.
    // Example:
    // '*' and '/' have higher precedence than '+' and '-'.
    // ===========================================
    val result1 = 10 + 5 * 2
    // Multiplication (*) happens first: 5 * 2 = 10
    // Then addition (+): 10 + 10 = 20
    println("10 + 5 * 2 = $result1")

    val result2 = 10 - 4 / 2
    // Division (/) happens first: 4 / 2 = 2
    // Then subtraction (-): 10 - 2 = 8
    println("10 - 4 / 2 = $result2")

    // ===========================================
    // 2️⃣ Using Parentheses
    // Parentheses '()' can be used to explicitly change the order of evaluation.
    // Expressions inside parentheses are always evaluated first.
    // ===========================================
    val result3 = (10 + 5) * 2
    // Parentheses first: 10 + 5 = 15
    // Then multiplication: 15 * 2 = 30
    println("(10 + 5) * 2 = $result3")

    val result4 = 10 - (4 / 2)
    // Parentheses first: 4 / 2 = 2
    // Then subtraction: 10 - 2 = 8
    println("10 - (4 / 2) = $result4")

    // ===========================================
    // 3️⃣ Complex example combining multiple operators
    val result5 = 10 + 3 * 2 - 4 / 2
    // Step by step using precedence:
    // 1. Multiplication: 3 * 2 = 6
    // 2. Division: 4 / 2 = 2
    // 3. Addition and subtraction left-to-right: 10 + 6 - 2 = 14
    println("10 + 3 * 2 - 4 / 2 = $result5")

    val result6 = (10 + 3) * (2 - 4) / 2
    // Step by step using parentheses first:
    // 1. (10 + 3) = 13
    // 2. (2 - 4) = -2
    // 3. Multiplication: 13 * -2 = -26
    // 4. Division: -26 / 2 = -13
    println("(10 + 3) * (2 - 4) / 2 = $result6")

    // ===========================================
    // 4️⃣ Summary
    // - Operator precedence: *, /, % have higher precedence than +, -
    // - Parentheses can override default precedence and clarify expressions
    // - Use parentheses to make code more readable and avoid mistakes
    // ===========================================
}
