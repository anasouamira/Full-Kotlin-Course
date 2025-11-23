// ======================================================================================
// Functional Operations in Kotlin on Collections
// ======================================================================================
// These are high-order functions that transform or process collections in a functional style.
//
// map      -> transforms each element into a new value (returns a new list)
// filter   -> keeps only elements that satisfy a condition
// flatMap  -> maps each element to a collection and then flattens the result into a single list
// reduce   -> reduces the collection to a single value by accumulating results
// fold     -> same as reduce, but allows an initial value
// groupBy  -> groups elements into a map based on a key selector function
// ======================================================================================

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5)

    // ----------------------------------------------------------------------------------
    // 1️⃣ map: transforms each element and returns a new collection
    // ----------------------------------------------------------------------------------
    val squared = numbers.map { number ->
        number * number              // Multiply each element by itself
    }
    println("Squared numbers: $squared")


    // ----------------------------------------------------------------------------------
    // 2️⃣ filter: keeps only the elements that match the given condition
    // ----------------------------------------------------------------------------------
    val evenNumbers = numbers.filter { it % 2 == 0 }  // Keep only even numbers
    println("Even numbers: $evenNumbers")


    // ----------------------------------------------------------------------------------
    // 3️⃣ flatMap: maps each element to another collection and flattens the result
    // ----------------------------------------------------------------------------------
    val lists = listOf(
        listOf(1, 2),
        listOf(3, 4),
        listOf(5)
    )

    val flattened = lists.flatMap { innerList ->
        innerList.map { it * 10 }     // transform before flattening
    }
    println("FlatMapped list: $flattened")


    // ----------------------------------------------------------------------------------
    // 4️⃣ reduce: accumulates values without an initial value
    // ----------------------------------------------------------------------------------
    val sum = numbers.reduce { accumulator, element ->
        accumulator + element        // accumulator stores running sum
    }
    println("Sum using reduce: $sum")


    // ----------------------------------------------------------------------------------
    // 5️⃣ fold: similar to reduce but starts with an initial value
    // ----------------------------------------------------------------------------------
    val sumWithStart = numbers.fold(10) { accumulator, element ->
        accumulator + element
    }
    println("Sum using fold (start = 10): $sumWithStart")


    // ----------------------------------------------------------------------------------
    // 6️⃣ groupBy: groups elements into categories based on a key selector
    // ----------------------------------------------------------------------------------
    val people = listOf("Ahmed", "Ali", "Sara", "Samir", "Mona")

    val groupedByFirstLetter = people.groupBy { person ->
        person.first()               // group by first character in the string
    }
    println("Grouped people: $groupedByFirstLetter")
}
