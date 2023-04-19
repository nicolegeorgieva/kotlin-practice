package exercise.extensionfunction

fun main() {
    val testString = "Kotlin is a powerful programming language."

    println("Original String: $testString")
    println("Vowels: ${testString.vowels()}")
//    println("Consonants: ${testString.consonants()}")
//    println("Capitalized Words: ${testString.capitalizeWords()}")
}

fun String.vowels(): String {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var res = ""

    for (char in this) {
        if (char in vowels) res += char
    }

    return res.toSet().joinToString(", ")
}