fun main() {
    // ===========================================
    // 1️⃣ Using 'in' operator
    // 'in' checks if a value exists within a range or collection.
    // Returns true if the value is present.
    // ===========================================
    val number = 5
    val range = 1..10
    if (number in range) {
        println("$number is within the range $range")
    }

    val fruits = listOf("Apple", "Banana", "Orange")
    val fruitToCheck = "Banana"
    if (fruitToCheck in fruits) {
        println("$fruitToCheck is in the list of fruits")
    }

    // ===========================================
    // 2️⃣ Using '!in' operator
    // '!in' checks if a value does NOT exist within a range or collection.
    // Returns true if the value is absent.
    // ===========================================
    val invalidNumber = 15
    if (invalidNumber !in range) {
        println("$invalidNumber is not within the range $range")
    }

    val vegetable = "Carrot"
    if (vegetable !in fruits) {
        println("$vegetable is not in the list of fruits")
    }

    // ===========================================
    // 3️⃣ Using 'in' with when expression
    // 'in' can also be used in 'when' branches for range matching.
    // ===========================================
    val score = 87
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "F"
    }
    println("Score $score gets grade $grade")

    // ===========================================
    // 4️⃣ Summary
    // - 'in' : checks if value exists in range/collection
    // - '!in' : checks if value does NOT exist
    // - Useful in conditions, loops, and when expressions
    // ===========================================
}
