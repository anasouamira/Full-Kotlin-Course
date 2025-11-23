// ======================================================================================
// Destructuring Declarations in Kotlin
// ======================================================================================
// Destructuring allows you to unpack objects into separate variables.
// It works with data classes, pairs, maps, and custom classes that define componentN().
// ======================================================================================

data class User(val id: Int, val name: String, val age: Int)

fun main() {

    // --------------------------------------------------------------------------
    // 1️⃣ Destructuring a Data Class
    // --------------------------------------------------------------------------
    val user = User(1, "Ahmed", 25)

    // Destructuring automatically calls component1(), component2(), component3()
    val (id, name, age) = user   // Unpacking into separate variables
    println("ID: $id, Name: $name, Age: $age")


    // --------------------------------------------------------------------------
    // 2️⃣ Destructuring in a function parameter
    // --------------------------------------------------------------------------
    fun printUserInfo(user: User) {
        val (uid, uname, uage) = user
        println("User info -> id: $uid, name: $uname, age: $uage")
    }
    printUserInfo(user)


    // --------------------------------------------------------------------------
    // 3️⃣ Destructuring a Pair and Triple
    // --------------------------------------------------------------------------
    val pair = Pair("Username", "Ahmed")
    val (label, value) = pair   // destructuring Pair
    println("Label: $label, Value: $value")

    val triple = Triple("A", "B", "C")
    val (first, second, third) = triple
    println("$first - $second - $third")


    // --------------------------------------------------------------------------
    // 4️⃣ Destructuring in for-loops (maps)
    // --------------------------------------------------------------------------
    val studentGrades = mapOf(
        "Sara" to 95,
        "Nora" to 88,
        "Omar" to 76
    )

    for ((studentName, grade) in studentGrades) {  // destructuring map entries
        println("$studentName scored $grade")
    }


    // --------------------------------------------------------------------------
    // 5️⃣ Ignoring destructured values using underscore (_)
    // --------------------------------------------------------------------------
    val (_, onlyName, _) = user   // Ignore id and age
    println("Only extracted name: $onlyName")
}
