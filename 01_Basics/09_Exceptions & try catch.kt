fun main() {
    println("Enter a number: ")
    val input = readLine()

    try {
        // 🔹 This might throw NumberFormatException if input is not a valid Int
        val number = input!!.toInt()
        val result = 100 / number   // Might throw ArithmeticException if number = 0
        println("100 divided by $number = $result")
    }
    // Catch specific exceptions first (more specific -> more general)
    catch (e: NumberFormatException) {
        println("❌ Invalid number format. Please enter digits only.")
    }
    catch (e: ArithmeticException) {
        println("❌ Cannot divide by zero.")
    }
    // Catch any other unexpected exceptions
    catch (e: Exception) {
        println("❌ An unexpected error occurred: ${e.message}")
    }
    finally {
        // ✅ This block always runs
        println("Program finished (finally block).")
    }
}
