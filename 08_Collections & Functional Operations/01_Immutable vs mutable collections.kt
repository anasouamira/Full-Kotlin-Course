// ============================================================================
// Immutable vs Mutable Collections in Kotlin
// ============================================================================
// - Immutable collections: cannot be modified after creation.
//   (You can read values but cannot add, remove, or update elements.)
//   Examples: listOf(), setOf(), mapOf()
//
// - Mutable collections: can be changed after creation.
//   (You can add, remove, update elements.)
//   Examples: mutableListOf(), mutableSetOf(), mutableMapOf()
// ============================================================================

fun main() {

    // ------------------------------------------------------------
    // 1️⃣ Immutable List (read-only)
    // ------------------------------------------------------------
    val immutableList = listOf("Apple", "Banana", "Orange")

    println("Immutable list: $immutableList")
    println(immutableList[0])        // Accessing elements works normally

    // immutableList.add("Mango")    // ❌ ERROR: Cannot add
    // immutableList.remove("Banana") // ❌ ERROR: Cannot remove

    // ------------------------------------------------------------
    // 2️⃣ Mutable List (modifiable)
    // ------------------------------------------------------------
    val mutableList = mutableListOf("Red", "Green", "Blue")

    mutableList.add("Yellow")          // Add element
    mutableList.remove("Green")        // Remove element
    mutableList[0] = "Dark Red"        // Update element

    println("Mutable list: $mutableList")

    // ------------------------------------------------------------
    // 3️⃣ Immutable Map
    // ------------------------------------------------------------
    val immutableMap = mapOf(
        "id" to 10,
        "name" to "Ali"
    )

    println("Immutable map: $immutableMap")
    println(immutableMap["name"])   // Read OK

    // immutableMap["age"] = 22      // ❌ ERROR: Cannot modify

    // ------------------------------------------------------------
    // 4️⃣ Mutable Map
    // ------------------------------------------------------------
    val mutableMap = mutableMapOf(
        "id" to 20,
        "name" to "Sara"
    )

    mutableMap["age"] = 25          // Add new key/value
    mutableMap["name"] = "Nora"     // Update value
    mutableMap.remove("id")         // Remove pair

    println("Mutable map: $mutableMap")

    // ------------------------------------------------------------
    // 5️⃣ Immutable vs Mutable Set
    // ------------------------------------------------------------
    val immutableSet = setOf(1, 2, 3)
    val mutableSet = mutableSetOf(10, 20, 30)

    mutableSet.add(40)
    mutableSet.remove(20)

    println("Immutable set: $immutableSet")
    println("Mutable set: $mutableSet")
}
