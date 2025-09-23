fun main() {
    // ===========================================
    // 1️⃣ Explicit types
    // You can explicitly specify the type of a variable when declaring it.
    // This is useful for clarity, documentation, or when you want to prevent accidental type inference.
    // Here, we declare 'height' as Double explicitly.
    // ===========================================
    val height: Double = 1.75
    println("Height (explicit type Double): $height")

    // You can also declare String, Int, Boolean, etc. explicitly
    val city: String = "Casablanca"
    val year: Int = 2025
    val isKotlinFun: Boolean = true
    println("City: $city, Year: $year, Is Kotlin fun? $isKotlinFun")

    // ===========================================
    // 2️⃣ Type inference
    // Kotlin compiler can automatically infer the type of a variable from the assigned value.
    // You do not need to write the type explicitly.
    // This reduces boilerplate code and keeps the code cleaner.
    // ===========================================
    val weight = 70.5      // inferred as Double
    var name = "Anas"      // inferred as String
    var score = 100        // inferred as Int
    val isStudent = false  // inferred as Boolean

    println("Weight (inferred type): $weight")
    println("Name (inferred type): $name")
    println("Score (inferred type): $score")
    println("Is student (inferred type): $isStudent")

    // ===========================================
    // 3️⃣ Mixing explicit types and inference
    // You can declare some variables with explicit types and others with inferred types.
    // Kotlin ensures type safety in both cases.
    // ===========================================
    val temperature: Float = 36.6f  // explicit
    val country = "Morocco"          // inferred
    println("Temperature: $temperature, Country: $country")

    // ===========================================
    // 4️⃣ Summary
    // - Explicit types: you declare the variable type yourself.
    // - Type inference: compiler determines the type from the initial value.
    // Using inference makes the code concise, but explicit types improve readability in complex scenarios.
    // ===========================================
}
