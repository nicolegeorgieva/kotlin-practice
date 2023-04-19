package exercise.extensionfunction

fun main() {
    val testString = "Kotlin is a powerful programming language."

    println("Original String: $testString")
    println("Vowels: ${testString.vowels()}")
    println("Consonants: ${testString.consonants()}")
    println("Capitalized Words: ${testString.capitalizeWords()}")
}

fun String.vowels(): String {
    val vowels = listOf('A', 'E', 'I', 'O', 'U')
    var res = ""

    for (char in this.uppercase()) {
        if (char in vowels) res += char
    }

    return res.toSet().joinToString(", ")
}

fun String.consonants(): String {
    val consonants = listOf(
        'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'
    )

    var res = ""

    for (char in this.uppercase()) {
        if (char in consonants) res += char
    }

    return res.toSet().joinToString(", ")
}

fun String.capitalizeWords(): String {
    var res = ""

    // Split the string into words
    val words = this.split(" ")

    for (word in words) {
        // Capitalize the first letter and add the rest of the word in lowercase
        val capitalizedWord = word.lowercase().replaceFirstChar { char -> char.uppercase() }
        res += "$capitalizedWord "
    }

    // Remove the extra space at the end of the result string
    return res.trim()
}