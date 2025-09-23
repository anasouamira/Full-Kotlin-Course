fun main() {
    // ===========================================
    // 1️⃣ break
    // 'break' immediately exits the nearest enclosing loop.
    // ===========================================
    println("Using break:")
    for (i in 1..5) {
        if (i == 3) {
            break // exits the loop when i == 3
        }
        println(i) // prints 1, 2
    }

    // ===========================================
    // 2️⃣ continue
    // 'continue' skips the current iteration and moves to the next loop iteration.
    // ===========================================
    println("\nUsing continue:")
    for (i in 1..5) {
        if (i == 3) {
            continue // skips printing 3
        }
        println(i) // prints 1,2,4,5
    }

    // ===========================================
    // 3️⃣ Labeled break
    // Labeled breaks are used to exit an outer loop from within a nested loop.
    // Syntax: labelName@ for loop, then break@labelName
    // ===========================================
    println("\nUsing labeled break:")
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (i * j == 4) {
                break@outer // exits the outer loop
            }
            println("i=$i, j=$j")
        }
    }

    // ===========================================
    // 4️⃣ Labeled continue
    // Can also be used to skip to the next iteration of an outer loop.
    // ===========================================
    println("\nUsing labeled continue:")
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (i * j == 4) {
                continue@outer // skips to next iteration of outer loop
            }
            println("i=$i, j=$j")
        }
    }

    // ===========================================
    // 5️⃣ Summary
    // - break: exits the nearest loop
    // - continue: skips current iteration
    // - labeled break@labelName: exits an outer loop
    // - labeled continue@labelName: skips to next iteration of outer loop
    // ===========================================
}
