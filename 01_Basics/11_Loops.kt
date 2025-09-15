fun main() {

    // ---------------------------
    // 1️⃣ FOR LOOP
    // ---------------------------

    // Loop over a range
    for (i in 1..5) {           // 1..5 includes 5
        println("for loop (1..5): $i")
    }

    // Loop with step
    for (i in 1..10 step 2) {
        println("step 2: $i")   // 1,3,5,7,9
    }

    // Loop in reverse
    for (i in 5 downTo 1) {
        println("reverse: $i")  // 5,4,3,2,1
    }

    // Loop over an array
    val fruits = arrayOf("Apple", "Banana", "Cherry")
    for (fruit in fruits) {
        println("Fruit: $fruit")
    }

    // Loop with index
    for ((index, fruit) in fruits.withIndex()) {
        println("Index $index: $fruit")
    }

    // ---------------------------
    // 2️⃣ WHILE LOOP
    // ---------------------------
    var count = 0
    while (count < 3) {           // condition checked first
        println("while loop count: $count")
        count++
    }

    // ---------------------------
    // 3️⃣ DO…WHILE LOOP
    // ---------------------------
    var x = 0
    do {
        println("do-while x: $x")
        x++
    } while (x < 2)               // condition checked after running once


    for (i in 1..5) {
    if (i == 3) continue // skip 3
    if (i == 4) break    // stop entirely
    println(i)          // prints 1,2 then stops
}
}
