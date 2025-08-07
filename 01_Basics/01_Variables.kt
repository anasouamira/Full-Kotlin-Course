fun main() {
    // 🔸 In Kotlin, variables are used to store data such as numbers, text, or objects.

    // 🔹 'val' is used to declare a read-only (immutable) variable.
    // Once assigned, its value cannot be changed.
    val name: String = "Alice"  // name is a String and its value is "Alice"
    println("Name: $name")

    // 🔹 'var' is used to declare a mutable variable.
    // You can change its value later in the code.
    var age: Int = 25  // age is an Integer and its value is 25
    println("Age: $age")

    // 🔄 Changing the value of a 'var' variable:
    age = 26
    println("Updated Age: $age")

    // ❗ Trying to change the value of a 'val' variable will cause an error:
    // name = "Bob"  // ❌ This line would cause a compilation error

    // 🔹 Type inference: Kotlin can automatically detect the type, so you can skip writing it.
    val city = "Paris"  // Kotlin infers this is a String
    var score = 90      // Kotlin infers this is an Int
    println("City: $city | Score: $score")

    // ✅ Variables can be of different types: String, Int, Double, Boolean, etc.
    val isActive: Boolean = true
    val height: Double = 1.75

    println("Is Active: $isActive")
    println("Height: $height meters")
}
