fun main() {
    // ===========================================
    // 1️⃣ Basic range using '..'
    // '..' creates a range including both start and end values.
    // ===========================================
    val range1 = 1..5
    println("Range using '..':")
    for (i in range1) {
        println(i) // prints 1, 2, 3, 4, 5
    }

    // ===========================================
    // 2️⃣ Using 'until' to exclude the end
    // 'until' creates a range that excludes the end value.
    // Example: 1 until 5 -> 1,2,3,4
    // ===========================================
    println("Range using 'until':")
    for (i in 1 until 5) {
        println(i) // prints 1, 2, 3, 4
    }

    // ===========================================
    // 3️⃣ Using 'downTo' for reverse ranges
    // 'downTo' creates a decreasing range from start to end.
    // ===========================================
    println("Range using 'downTo':")
    for (i in 5 downTo 1) {
        println(i) // prints 5, 4, 3, 2, 1
    }

    // ===========================================
    // 4️⃣ Using 'step' to skip values
    // 'step' specifies the increment (or decrement) for the range.
    // ===========================================
    println("Range with step:")
    for (i in 1..10 step 2) {
        println(i) // prints 1, 3, 5, 7, 9
    }

    println("Reverse range with step:")
    for (i in 10 downTo 1 step 3) {
        println(i) // prints 10, 7, 4, 1
    }

    // ===========================================
    // 5️⃣ Summary
    // - '..' : inclusive range (start to end)
    // - 'until' : exclusive end (start to end-1)
    // - 'downTo' : decreasing range
    // - 'step' : specify increment/decrement
    // ===========================================
}
