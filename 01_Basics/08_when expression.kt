fun main() {
    val day = 3

    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day number")

    }

    val score = 85

    when {
        score >= 90 -> println("Grade: A")
        score in 75..89 -> println("Grade: B")  // range check
        score in 60..74 -> println("Grade: C")
        else -> println("Grade: D or F")
    }

    val number = -5

    // Assign result of when directly to a variable
    val type = when {
        number > 0 -> "Positive"
        number < 0 -> "Negative"
        else -> "Zero"
    }

    println("Number type: $type")
}
