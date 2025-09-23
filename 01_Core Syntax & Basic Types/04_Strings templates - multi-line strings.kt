fun main() {
    // ===========================================
    // 1️⃣ Basic String
    // A String is a sequence of characters.
    // You can use double quotes to declare a string literal.
    // ===========================================
    val greeting: String = "Hello"
    val language = "Kotlin"
    println("Basic greeting: $greeting $language") // combines two strings

    // ===========================================
    // 2️⃣ String Templates
    // Kotlin allows embedding variables or expressions directly inside strings
    // using the '$' symbol. This is called a string template.
    // If you need to use an expression, wrap it in curly braces: ${expression}
    // ===========================================
    val name = "Anas"
    val age = 25
    println("Hello $name, you are $age years old.") // simple template
    println("Next year, you will be ${age + 1} years old.") // expression inside template

    // ===========================================
    // 3️⃣ Multi-line Strings
    // Multi-line strings are declared with triple quotes (""").
    // They preserve line breaks, spaces, and formatting.
    // Useful for text blocks, long messages, or JSON/HTML snippets.
    // ===========================================
    val poem = """
        Roses are red,
        Violets are blue,
        Kotlin is fun,
        And so are you!
    """.trimIndent() // trimIndent removes common leading whitespace
    println("Poem:\n$poem")

    // ===========================================
    // 4️⃣ Raw strings vs escaped characters
    // In a normal string, you need to escape characters like \n, \t, \"
    // Multi-line strings allow writing text as-is without most escapes.
    val escapedString = "Hello\nWorld\t!"
    println("Escaped string:\n$escapedString")
    
    // ===========================================
    // 5️⃣ Summary
    // - Single-line strings: "text"
    // - String templates: "Hello $variable" or "Value: ${expression}"
    // - Multi-line strings: """text"""
    // Using string templates improves readability and reduces concatenation.
    // Multi-line strings are ideal for text blocks.
    // ===========================================
}
