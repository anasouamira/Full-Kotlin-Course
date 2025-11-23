// ============================================================================
// Collections in Kotlin: Lists, Sets, Maps (Creation & Manipulation)
// ============================================================================
// LIST  -> ordered collection, allows duplicates, accessed by index
// SET   -> collection with NO duplicates, order NOT guaranteed
// MAP   -> key/value pairs (dictionary-like structure)
// ============================================================================

fun main() {

    // ------------------------------------------------------------------------
    // 1️⃣ LISTS
    // ------------------------------------------------------------------------
    // Immutable List (read-only)
    val numbers = listOf(1, 2, 3, 3)   // Allows duplicates
    println("Numbers list: $numbers")
    println(numbers[0])                // Access by index

    // Mutable List (can modify elements)
    val cities = mutableListOf("Paris", "London", "Tokyo")
    cities.add("Dubai")                // Add element at end
    cities.remove("London")            // Remove by value
    cities[0] = "New York"             // Update by index
    println("Cities list: $cities")


    // ------------------------------------------------------------------------
    // 2️⃣ SETS
    // ------------------------------------------------------------------------
    // Immutable Set (removes duplicates automatically)
    val ids = setOf(1, 2, 2, 3, 3, 4)
    println("IDs set: $ids")           // Output: [1, 2, 3, 4]

    // Mutable Set
    val tags = mutableSetOf("Hot", "Sale", "Popular")
    tags.add("Featured")               // Add new element
    tags.add("Hot")                    // Duplicate ignored
    tags.remove("Sale")
    println("Tags set: $tags")


    // ------------------------------------------------------------------------
    // 3️⃣ MAPS
    // ------------------------------------------------------------------------
    // Immutable Map
    val user = mapOf(
        "id" to 10,
        "name" to "Ali"
    )
    println("User map: $user")
    println(user["name"])              // Access by key

    // Mutable Map
    val student = mutableMapOf(
        "id" to 100,
        "name" to "Sara"
    )
    student["age"] = 21                // Add new key/value
    student["name"] = "Nora"           // Update existing key
    student.remove("id")
    println("Student map: $student")


    // ------------------------------------------------------------------------
    // 4️⃣ Iterating (looping) over collections
    // ------------------------------------------------------------------------
    println("Loop list:")
    for (city in cities) {
        println("- $city")
    }

    println("Loop map:")
    for ((key, value) in student) {   // destructuring using componentN()
        println("$key = $value")
    }

    // ------------------------------------------------------------------------
    // 5️⃣ Useful manipulation functions (filter, map, sorted)
    // ------------------------------------------------------------------------
    val nums = listOf(1, 5, 3, 2, 4)

    val even = nums.filter { it % 2 == 0 }     // Keep even numbers
    val doubled = nums.map { it * 2 }          // Multiply each by 2
    val sorted = nums.sorted()                 // Sort ascending

    println("Even numbers: $even")
    println("Doubled values: $doubled")
    println("Sorted list: $sorted")
}
