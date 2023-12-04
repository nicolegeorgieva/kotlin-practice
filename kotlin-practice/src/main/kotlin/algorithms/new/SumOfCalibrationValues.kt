package algorithms.new

import java.io.File

fun main() {
    val input = File("day1.txt").readText()
    val input2 = File("new.txt").readText()

    println(finalSum("www3two"))
    println(finalSum(input))
    println(finalSum(input2))
}

val numbers = mapOf(
    Pair("one", 1),
    Pair("two", 2),
    Pair("three", 3),
    Pair("four", 4),
    Pair("five", 5),
    Pair("six", 6),
    Pair("seven", 7),
    Pair("eight", 8),
    Pair("nine", 9)
)

val finalNums = numbers + numbers.map {
    val newKey = it.key.reversed()
    Pair(newKey, it.value)
}

private fun finalSum(input: String): Int {
    val words = getWords(input)

    val res = words.map {
        wordToTwoDigitNumber(it)
    }.sum()

    return res
}

private fun wordToTwoDigitNumber(word: String): Int {
    val first = extractFirstDigit(word) ?: throw Exception("Error!")
    val second = extractFirstDigit(word.reversed()) ?: first

    return "$first$second".toInt()
}

private fun getWords(input: String): List<String> {
    return input.split("\n")
}

private fun extractFirstDigit(word: String): Int? {
    var accumulated = ""
    var digit: Int? = null

    for (char in word) {
        if (char.isDigit()) {
            digit = char.digitToInt()
            break
        }

        accumulated += char

        val number = containsTextDigit(accumulated)
        if (number != null) {
            digit = number
            break
        }
    }

    return digit
}

// "wwwone" -> "one"
// "www" -> null
private fun containsTextDigit(accumulated: String): Int? {
    for (key in finalNums.keys) {
        if (key in accumulated) {
            return finalNums[key]
        }
    }

    return null
}