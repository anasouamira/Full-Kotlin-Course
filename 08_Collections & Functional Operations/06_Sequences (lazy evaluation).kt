// ======================================================================================
// Sequences in Kotlin (Lazy Evaluation)
// ======================================================================================
// A Sequence is a collection type that processes elements lazily.
// Lazy evaluation means elements are computed only when needed,
// instead of processing the entire collection immediately (eager evaluation).
//
// Useful when working with:
// - Very large collections
// - Performance optimization
// - Long chains of operations (map, filter, etc.)
// ======================================================================================

fun main() {

    // A normal list (eager evaluation)
    val numbersList = listOf(1, 2, 3, 4, 5)

    // ==================================================================================
    // 1️⃣ Example: Eager evaluation (normal collection)
    // ==================================================================================
    val eagerResult = numbersList
        .map { number ->
            println("Eager map: $number")  // Executed for all elements immediately
            number * 2
        }
        .filter { value ->
            println("Eager filter: $value") // Also executed for all values
            value > 5
        }

    println("Result from eager list: $eagerResult\n") // Prints after full processing



    // ==================================================================================
    // 2️⃣ Sequence (Lazy evaluation)
    // ==================================================================================
    val lazySequence = numbersList.asSequence()     // Convert list into Sequence

    val lazyResult = lazySequence
        .map { number ->
            println("Lazy map: $number")   // Executed one item at a time
            number * 2
        }
        .filter { value ->
            println("Lazy filter: $value") // Executed only when needed
            value > 5
        }
        .toList() // terminal operation triggers execution

    println("Result from lazy sequence: $lazyResult\n")



    // ==================================================================================
    // 3️⃣ Demonstrating performance with infinite sequence
    // ==================================================================================
    val infiniteSequence = generateSequence(1) { it + 1 }   // infinite numbers: 1,2,3,4...
    val firstFiveEven = infiniteSequence
        .filter { it % 2 == 0 }     // only even numbers
        .take(5)                    // take only first 5 elements
        .toList()

    println("First five even numbers: $firstFiveEven")
}
