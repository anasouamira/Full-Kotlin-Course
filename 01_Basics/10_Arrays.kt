fun main() {
    // 🔹 1. Simple array using arrayOf()
    val numbers = arrayOf(10, 20, 30, 40)

    // Access elements by index (0-based)
    println("First element: ${numbers[0]}") // 10
    println("Last element: ${numbers[numbers.size - 1]}") // 40

    // Modify an element
    numbers[1] = 25
    println("After modification: ${numbers.joinToString()}") // 10, 25, 30, 40

    // 🔹 2. Array of Strings
    val fruits = arrayOf("Apple", "Banana", "Cherry")
    for (fruit in fruits) {
        println("Fruit: $fruit")
    }

    // 🔹 3. Array with a generator (size = 5, value = index * index)
    val squares = Array(5) { i -> i * i }
    println("Squares: ${squares.joinToString()}") // 0, 1, 4, 9, 16

    // 🔹 4. Primitive arrays (efficient memory)
    val intArr = IntArray(4) { it + 1 } // [1, 2, 3, 4]
    println("IntArray: ${intArr.joinToString()}")

    // 🔹 5. Iterating with indices
    for (index in numbers.indices) {
        println("numbers[$index] = ${numbers[index]}")
    }
}
