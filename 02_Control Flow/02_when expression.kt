fun main() {
    // ===========================================
    // 1️⃣ Basic value matching using 'when'
    // 'when' is similar to switch-case in other languages.
    // It checks a value against multiple possibilities and executes the matching branch.
    // ===========================================
    val dayOfWeek = 3
    val dayName = when (dayOfWeek) {
        1 -> "Monday"       // if dayOfWeek == 1
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day" // default case
    }
    println("Day of the week: $dayName")

    // ===========================================
    // 2️⃣ Using ranges in 'when'
    // You can check if a value belongs to a range using 'in' keyword.
    // ===========================================
    val score = 85
    val grade = when (score) {
        in 90..100 -> "A"    // 90 <= score <= 100
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"           // below 60
    }
    println("Grade: $grade")

    // ===========================================
    // 3️⃣ Multiple conditions for one branch
    // You can check multiple values in a single branch using commas.
    // ===========================================
    val fruit = "Apple"
    val category = when (fruit) {
        "Apple", "Banana", "Orange" -> "Fruit"
        "Carrot", "Potato" -> "Vegetable"
        else -> "Unknown"
    }
    println("Category: $category")

    // ===========================================
    // 4️⃣ Using 'when' as an expression
    // 'when' can return a value, so it can be assigned to variables.
    // ===========================================
    val number = 7
    val type = when {
        number % 2 == 0 -> "Even"
        number % 2 != 0 -> "Odd"
        else -> "Unknown"
    }
    println("Number type: $type")

    // ===========================================
    // 5️⃣ Summary
    // - Basic value matching: compare exact values
    // - Ranges: use 'in' to check if value is within a range
    // - Multiple conditions: use commas to combine multiple values
    // - 'when' can be used as an expression to return a value
    // ===========================================
}
