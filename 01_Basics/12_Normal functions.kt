// 🔹 1️⃣ A simple function with no parameters and no return value
fun greet() {
    println("Hello from a normal function!")
}

// 🔹 2️⃣ Function with parameters and a return value
fun add(a: Int, b: Int): Int {
    // Return the sum of a and b
    return a + b
}

// 🔹 3️⃣ Function with a default parameter
fun sayHello(name: String = "Guest") {
    println("Hello, $name!")
}

// 🔹 4️⃣ Single-expression function (shorthand)
fun square(x: Int): Int = x * x

fun main() {
    // Call functions
    greet()                               // prints "Hello from a normal function!"

    val sum = add(5, 7)                   // 5 + 7 = 12
    println("Sum = $sum")

    sayHello()                            // uses default "Guest"
    sayHello("Anas")                      // uses "Anas"

    println("Square of 4 is ${square(4)}") // prints 16
}
