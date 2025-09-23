fun main() {
    // ===========================================
    // 1️⃣ For loop with ranges
    // 'for' loop can iterate over a range of numbers using '..' operator.
    // You can also specify step and use 'downTo' for reverse iteration.
    // ===========================================
    println("For loop with ranges:")
    for (i in 1..5) {  // 1 to 5 inclusive
        println(i)
    }

    println("For loop with step 2:")
    for (i in 1..10 step 2) { // 1, 3, 5, 7, 9
        println(i)
    }

    println("For loop in reverse using downTo:")
    for (i in 5 downTo 1) { // 5, 4, 3, 2, 1
        println(i)
    }

    // ===========================================
    // 2️⃣ For loop with collections
    // You can iterate over arrays, lists, and other collections.
    // ===========================================
    println("For loop with collections:")
    val fruits = listOf("Apple", "Banana", "Orange")
    for (fruit in fruits) {
        println(fruit)
    }

    // Using indices
    println("For loop using indices:")
    for (index in fruits.indices) {
        println("Fruit at index $index: ${fruits[index]}")
    }

    // ===========================================
    // 3️⃣ While loop
    // Executes a block of code repeatedly while the condition is true.
    // The condition is checked before each iteration.
    // ===========================================
    println("While loop:")
    var count = 1
    while (count <= 5) {
        println(count)
        count++
    }

    // ===========================================
    // 4️⃣ Do-while loop
    // Similar to while loop, but the block executes at least once
    // because the condition is checked after the iteration.
    // ===========================================
    println("Do-while loop:")
    var number = 1
    do {
        println(number)
        number++
    } while (number <= 5)

    // ===========================================
    // 5️⃣ Summary
    // - for loop: iterate over ranges or collections
    // - while loop: condition checked before loop body
    // - do-while loop: condition checked after loop body (executes at least once)
    // ===========================================
}
