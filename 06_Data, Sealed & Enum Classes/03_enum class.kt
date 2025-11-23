// ============================================================================
// ENUM CLASS in Kotlin
// ============================================================================
// - An enum class defines a fixed set of constant values.
// - Useful when representing limited options like days, directions, states, etc.
//
// - Enum constants are objects (instances) of the enum class.
// - Enums can have properties and methods like regular classes.
// - Each enum constant can override properties or methods if needed.
// ============================================================================

// Declaring an enum class of Directions
enum class Direction(val degrees: Int) {  // degrees is a custom property for each constant

    // Enum constants (each is an instance of Direction)
    NORTH(0),      // The angle pointing north
    EAST(90),      // Angle for east direction
    SOUTH(180),    // Angle for south direction
    WEST(270);     // Angle for west direction

    // ------------------------------------------------------------
    // Method inside enum class
    // ------------------------------------------------------------
    fun description(): String {
        return "Direction $name has angle $degrees degrees."
    }
}

// ============================================================================
// Example usage in main()
// ============================================================================
fun main() {

    // Accessing enum values
    val d: Direction = Direction.NORTH

    // Auto-generated properties: name, ordinal
    println(d.name)        // "NORTH"   -> The constant name as String
    println(d.ordinal)     // 0         -> The position index of the constant

    // Accessing custom property
    println(d.degrees)     // 0         -> Angle value stored in NORTH

    // Calling method on constant
    println(d.description())   // "Direction NORTH has angle 0 degrees."

    // Looping through all enum constants
    for (dir in Direction.values()) {
        println("${dir.name} -> degrees: ${dir.degrees}")
    }

    // Using enum in when expression
    when (d) {
        Direction.NORTH -> println("Going North")
        Direction.EAST -> println("Going East")
        Direction.SOUTH -> println("Going South")
        Direction.WEST -> println("Going West")
    }

    // Convert string to enum
    val fromString = Direction.valueOf("EAST")
    println(fromString)  // Output: EAST
}
