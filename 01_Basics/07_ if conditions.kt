fun main() {
    val age = 20

    // 🔹 Simple if
    if (age >= 18) {
        println("You are an adult.")
    }

    // 🔹 if…else
    if (age < 18) {
        println("You are a minor.")
    } else {
        println("You are 18 or older.")
    }

    // 🔹 if…else if…else chain
    val grade = 85
    if (grade >= 90) {
        println("Grade: A")
    } else if (grade >= 75) {
        println("Grade: B")
    } else {
        println("Grade: C or below")
    }

    // 🔹 Using if as an expression to assign a value
    val number = -5
    val result = if (number > 0) "Positive" else "Negative or Zero"
    println("Number is: $result")
}
