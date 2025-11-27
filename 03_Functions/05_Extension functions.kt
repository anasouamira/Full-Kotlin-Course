// ===========================================
//  Extension Functions in Kotlin
// ===========================================

// 1️⃣ You can add new functions to an existing class
//     - without inheriting from the class
//     - without modifying its original code
//     - Great for adding utilities or helper methods

// Extension function for Int that checks if a number is even
fun Int.isEven(): Boolean {
    return this % 2 == 0  // 'this' refers to the current integer object
}

// Extension function for String that counts words in a sentence
fun String.wordCount(): Int {
    return this.trim().split(" ").size  // Split by space and count elements
}

// Extension function for ArrayList<String> that returns the longest string
fun ArrayList<String>.longest(): String {
    return this.maxByOrNull { it.length } ?: ""  // If list empty return ""
}

// Extension function for Double to convert MAD money to USD
fun Double.toUSD(): Double {
    return this / 10.0  // Example conversion rate: 1 USD ≈ 10 MAD
}

// Extension function for Boolean that returns "Yes" or "No"
fun Boolean.toYesNo(): String {
    return if (this) "Yes" else "No"
}

// Extension function for Array<Int> to calculate the total sum
fun Array<Int>.sumArray(): Int {
    return this.sum()  // Kotlin built-in sum()
}

// Extension function for nullable String to avoid null problems
fun String?.safe(): String {
    return this ?: "Unknown"  // Return default value when null
}

// Here we create an extension function for the String class
fun String.removeSpaces(): String {
    // 'this' refers to the String instance on which the function is called
    return this.replace(" ", "")
}

// Another example: extension for Int to check if it's even
fun Int.isEven(): Boolean {
    return this % 2 == 0
}

// You can also define extension functions for your own classes
data class Rectangle(val width: Int, val height: Int)

// Add an extension function to calculate area
fun Rectangle.area(): Int {
    return this.width * this.height
}

fun main() {

    // Test Int extension
    val number = 12
    println("$number is even? ${number.isEven()}")

    // Test String extension
    val sentence = "Kotlin is very powerful"
    println("Word count: ${sentence.wordCount()}")

    // Test ArrayList extension
    val names = arrayListOf("Anas", "Mohammed", "Sara", "Aya")
    println("Longest name: ${names.longest()}")

    // Test Double extension
    val money = 250.0
    println("$money MAD = ${money.toUSD()} USD")

    // Test Boolean extension
    val parkingIncluded = true
    println("Parking: ${parkingIncluded.toYesNo()}")

    // Test Array<Int> extension
    val scores = arrayOf(5, 2, 8, 3)
    println("Sum of scores = ${scores.sumArray()}")

    // Test nullable String extension
    val username: String? = null
    println("User = ${username.safe()}")
    
    // ===========================================
    // Using String extension
    val phrase = "Kotlin Extension Functions"
    println(phrase.removeSpaces())
    // Output: "KotlinExtensionFunctions"

    // Using Int extension
    val number = 42
    println("Is $number even? ${number.isEven()}")
    // Output: Is 42 even? true

    // Using Rectangle extension
    val rect = Rectangle(5, 10)
    println("Rectangle area = ${rect.area()}")
    // Output: Rectangle area = 50

    // ===========================================
    // Notes:
    // - Extension functions do NOT actually modify the class
    // - They are resolved statically (at compile time)
    // - They are very useful to add helper methods cleanly
    // ===========================================
}
