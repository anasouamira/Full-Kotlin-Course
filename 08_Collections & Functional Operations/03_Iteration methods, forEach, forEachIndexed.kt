// ============================================================================
// Iteration Methods in Kotlin: forEach & forEachIndexed
// ============================================================================
// forEach        -> iterates through each element in a collection
// forEachIndexed -> iterates through each element AND provides its index
// These methods are commonly used instead of a traditional 'for' loop
// They are functional-style iteration methods, often used with lambdas
// ============================================================================

fun main() {

    // A list of strings that we will iterate through
    val fruits = listOf("Apple", "Banana", "Orange", "Mango")

    // ------------------------------------------------------------------------
    // 1️⃣ forEach method
    // ------------------------------------------------------------------------
    // forEach runs a block of code for EVERY element in the collection
    // "it" is the implicit lambda parameter representing the current item
    println("Using forEach:")
    fruits.forEach { fruit ->       // We explicitly name the parameter "fruit"
        println("Fruit item: $fruit")
    }

    // The same example but using the implicit "it" parameter
    println("\nUsing forEach with 'it':")
    fruits.forEach {
        println("Current fruit: $it")   // "it" = current value
    }


    // ------------------------------------------------------------------------
    // 2️⃣ forEachIndexed method
    // ------------------------------------------------------------------------
    // forEachIndexed provides TWO arguments:
    // index -> position of the element
    // value -> actual value at that index
    println("\nUsing forEachIndexed:")
    fruits.forEachIndexed { index, value ->     // destructuring (index, value)
        println("Index: $index | Fruit: $value")
    }


    // ------------------------------------------------------------------------
    // 3️⃣ Practical Example: Finding a specific element using forEachIndexed
    // ------------------------------------------------------------------------
    val targetFruit = "Orange"
    println("\nSearching for target fruit...")
    fruits.forEachIndexed { index, value ->
        if (value == targetFruit) {
            println("Found '$value' at index $index")
        }
    }
}
