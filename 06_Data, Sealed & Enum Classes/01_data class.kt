// ============================================================================
// DATA CLASS in Kotlin
// ============================================================================
// - A data class is a special class used to hold data / model values.
// - Kotlin automatically generates useful methods for data classes:
//      • toString()      -> readable representation of the object
//      • equals()        -> compares values instead of references
//      • hashCode()      -> used in collections like HashMap / HashSet
//      • copy()          -> creates a new object with the same values,
//                           and optionally replace some values
//      • componentN()    -> allows destructuring (component1, component2, ...)
// ============================================================================

// Declaring a data class
data class User(val name: String, val age: Int)

fun main() {

    // ------------------------------------------------------------
    // 1️⃣ Creating objects of a data class
    // ------------------------------------------------------------
    val user1 = User("Ahmed", 22)
    val user2 = User("Ahmed", 22)

    // ------------------------------------------------------------
    // 2️⃣ Auto-generated toString()
    // ------------------------------------------------------------
    println(user1.toString())     // Output: User(name=Ahmed, age=22)
    // Without data class, this would print object memory address, not readable.

    // ------------------------------------------------------------
    // 3️⃣ Auto-generated equals() and hashCode()
    // ------------------------------------------------------------
    println(user1 == user2)       // true because values are equal.
    // With normal classes, == checks reference, here it checks values.

    // ------------------------------------------------------------
    // 4️⃣ copy() method
    // ------------------------------------------------------------
    val user3 = user1.copy()                          // same values
    val user4 = user1.copy(age = 30)                  // modify one property
    println(user3)                                    // User(name=Ahmed, age=22)
    println(user4)                                    // User(name=Ahmed, age=30)

    // ------------------------------------------------------------
    // 5️⃣ componentN() and destructuring declarations
    // ------------------------------------------------------------
    val (n, a) = user1   // uses component1() -> name, component2() -> age
    println("Name: $n, Age: $a")

    // You can also call them directly:
    println(user1.component1())   // "Ahmed"
    println(user1.component2())   // 22
}
