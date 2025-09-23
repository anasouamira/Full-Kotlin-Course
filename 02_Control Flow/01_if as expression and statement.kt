fun main() {
    // ===========================================
    // 1️⃣ If as a statement
    // In Kotlin, 'if' can be used as a normal control flow statement.
    // It executes a block of code based on a condition but does NOT return a value.
    // ===========================================
    val age = 20

    println("Using if as a statement:")
    if (age >= 18) {
        println("You are an adult.") // executed if condition is true
    } else {
        println("You are not an adult.") // executed if condition is false
    }

    // ===========================================
    // 2️⃣ If as an expression
    // Unlike many other languages, in Kotlin, 'if' can also be used as an expression.
    // This means it returns a value and can be assigned to a variable.
    // Both the 'if' and 'else' branches must return a value if used as an expression.
    // ===========================================
    val category: String = if (age < 13) {
        "Child"
    } else if (age < 20) {
        "Teenager"
    } else {
        "Adult"
    }
    println("Category (if as expression): $category")

    // ===========================================
    // 3️⃣ Using if expression in one line
    // For simple conditions, you can use a single-line 'if' expression.
    // ===========================================
    val canVote = if (age >= 18) true else false
    println("Can vote: $canVote")

    // ===========================================
    // 4️⃣ Summary
    // - if statement: controls flow, does not return a value, used for side effects.
    // - if expression: returns a value, can be assigned to variables or used inside other expressions.
    // - Using if as an expression improves code conciseness and readability.
    // ===========================================
}
