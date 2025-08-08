fun main() {
    // 🔹 Logical operators are used to combine or modify Boolean (true/false) values.
    // They are often used in decision making (if statements, conditions).

    val a = true
    val b = false

    // &&  Logical AND: returns true only if BOTH conditions are true
    println("a && b = ${a && b}") // false (because b is false)
    println("true && true = ${true && true}") // true

    // ||  Logical OR: returns true if AT LEAST one condition is true
    println("a || b = ${a || b}") // true (because a is true)
    println("false || false = ${false || false}") // false

    // !   Logical NOT: reverses the Boolean value
    println("!a = ${!a}") // false (because a was true)
    println("!b = ${!b}") // true (because b was false)

    // 🔄 Example in a real condition
    val age = 20
    val hasID = true

    // Check if a person is allowed to enter (must be over 18 AND have ID)
    if (age > 18 && hasID) {
        println("Access granted ✅")
    } else {
        println("Access denied ❌")
    }

    // Check if a discount applies (under 12 OR over 60)
    val customerAge = 65
    if (customerAge < 12 || customerAge > 60) {
        println("Discount applies 🏷")
    } else {
        println("No discount 💰")
    }
}
