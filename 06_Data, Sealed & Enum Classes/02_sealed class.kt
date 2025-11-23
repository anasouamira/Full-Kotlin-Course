// ============================================================================
// SEALED CLASS in Kotlin
// ============================================================================
// - A sealed class is used to represent restricted or "closed" class hierarchies.
// - All subclasses must be declared in the SAME file (but can be nested or separate).
// - This allows the compiler to know ALL possible subclasses at compile time.
//
// Why is this useful?
// - When using `when` with a sealed class, Kotlin requires handling ALL cases,
//   making the `when` expression exhaustive (no need for an `else` branch).
// - Perfect for representing states, results, or events in applications.
// ============================================================================

// Declaring a sealed class hierarchy that represents network responses:
sealed class NetworkResult {

    // ------------------------------------------------------------
    // Subclass representing success (with data)
    // ------------------------------------------------------------
    data class Success(val data: String) : NetworkResult()

    // ------------------------------------------------------------
    // Subclass representing error (with message)
    // ------------------------------------------------------------
    data class Error(val message: String) : NetworkResult()

    // ------------------------------------------------------------
    // Subclass representing loading state (no data)
    // ------------------------------------------------------------
    object Loading : NetworkResult()
}

// ============================================================================
// Using sealed class in a when expression
// ============================================================================
fun handleResult(result: NetworkResult) {

    // Because `NetworkResult` is sealed, `when` is exhaustive:
    // Kotlin ensures all subclasses are covered (Success, Error, Loading).
    when (result) {

        is NetworkResult.Success -> {
            println("Success! Received data: ${result.data}")
        }

        is NetworkResult.Error -> {
            println("Error occurred: ${result.message}")
        }

        NetworkResult.Loading -> {
            println("Loading... please wait.")
        }
    }
}

fun main() {

    // Testing the sealed class cases
    val res1: NetworkResult = NetworkResult.Success("User profile loaded")
    val res2: NetworkResult = NetworkResult.Error("Network failure")
    val res3: NetworkResult = NetworkResult.Loading

    handleResult(res1)
    handleResult(res2)
    handleResult(res3)
}
