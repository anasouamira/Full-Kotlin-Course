fun main() {
    // 🔹 Console input lets a user type something while the program is running.
    // We use readLine() to read a line of text from the keyboard.

    // 👉 Prompt the user to enter their name
    print("Enter your name: ")       // print() keeps the cursor on the same line
    val name: String? = readLine()   // readLine() returns a nullable String (can be null)

    // 👉 Prompt the user to enter their age
    print("Enter your age: ")
    val ageInput: String? = readLine()

    // 🔄 Convert the input (String) to an Int safely using toIntOrNull()
    // toIntOrNull() returns null if the input is not a valid number.
    val age: Int = ageInput?.toIntOrNull() ?: 0

    // 🖨️ Display the collected information
    println("Hello, $name! You are $age years old.")

    // ✅ Example with a calculation
    println("Next year you will be ${age + 1} years old.")
}
