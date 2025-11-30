fun main() {

    // Create an Int array with fixed size 5 (all values default = 0)
    val numbers = Array(5) { 0 }

    // Create an array with initial values
    val fruits = arrayOf("Apple", "Banana", "Orange")

    // Access elements by index (index starts at 0)
    println(fruits[0]) // prints: Apple

    // Modify an element
    fruits[1] = "Mango"  // Replace Banana with Mango

    // Print all elements using a loop
    for (fruit in fruits) {
        println(fruit)  // Apple, Mango, Orange
    }

    // Array of integers using intArrayOf
    val scores = intArrayOf(10, 20, 30, 40)

    println("Size: ${scores.size}")     // Size of array
    println("First: ${scores.first()}") // First element
    println("Last: ${scores.last()}")   // Last element

     // -------------------------------------------------------------
    // 1️⃣ Creating Arrays using Array<T> and Primitive Arrays
    // -------------------------------------------------------------
    val names: Array<String> = arrayOf("Ali", "Sara", "Nabil")   // Regular Array with reference type String
    val numbers: IntArray = intArrayOf(5, 2, 8, 1, 3)            // Primitive IntArray (more performance efficient)

    // Printing arrays using joinToString() to format output
    println("Names: ${names.joinToString()}")
    println("Numbers: ${numbers.joinToString()}")

    // -------------------------------------------------------------
    // 2️⃣ Sorting Arrays
    // -------------------------------------------------------------
    numbers.sort()                                            // Sort ascending
    println("Sorted ascending: ${numbers.joinToString()}")

    numbers.sortDescending()                                  // Sort descending
    println("Sorted descending: ${numbers.joinToString()}")

    // -------------------------------------------------------------
    // 3️⃣ Searching inside arrays
    // -------------------------------------------------------------
    println("Does names contain 'Sara'? -> ${"Sara" in names}")     // true
    println("Does names contain 'Omar'? -> ${names.contains("Omar")}") // false

    // -------------------------------------------------------------
    // 4️⃣ Converting Arrays
    // -------------------------------------------------------------
    val namesList = names.toList()                           // Convert array to List
    val namesArrayAgain = namesList.toTypedArray()           // Convert List back to Array

    println("Names as list: $namesList")
    println("Back to array: ${namesArrayAgain.joinToString()}")

    // -------------------------------------------------------------
    // 5️⃣ Initializing array with lambda (automatic computed values)
    // -------------------------------------------------------------
    val squares = Array(6) { index -> index * index }        // fill with index squared
    println("Squares: ${squares.joinToString()}")

    // -------------------------------------------------------------
    // 6️⃣ Iterating arrays
    // -------------------------------------------------------------
    println("Looping with forEach:")
    names.forEach { println("Name: $it") }                   // it = current element

    println("Looping with forEachIndexed:")
    names.forEachIndexed { index, value ->
        println("Index: $index -> Value: $value")
    }

    // -------------------------------------------------------------
    // 7️⃣ Copying arrays
    // -------------------------------------------------------------
    val copyNumbers = numbers.copyOf()
    println("Copy of numbers: ${copyNumbers.joinToString()}")

    val resizedCopy = numbers.copyOf(7)                      // expands to size=7 and fills with 0
    println("Resized copy (size=7): ${resizedCopy.joinToString()}")

    // -------------------------------------------------------------
    // 8️⃣ Multi-Dimensional Arrays (Matrix) 3x3
    // -------------------------------------------------------------
    val matrix = Array(3) { IntArray(3) }                    // create empty 3x3 matrix filled with zeros

    // Fill diagonal with 1 (1 0 0 / 0 1 0 / 0 0 1)
    matrix[0][0] = 1
    matrix[1][1] = 1
    matrix[2][2] = 1

    println("Matrix 3x3:")
    matrix.forEach { row ->
        println(row.joinToString())
    }
}
