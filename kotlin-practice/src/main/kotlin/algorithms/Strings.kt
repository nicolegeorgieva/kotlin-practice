package algorithms

import kotlin.math.abs

fun main() {
    val word1 = "cdf"
    val word2 = "a"

    println(mergeAlternately(word1, word2))
}

private fun mergeAlternately(word1: String, word2: String): String {
    var res = ""
    var endLetters = ""
    val difference = word1.length - word2.length

    if (word1.length > word2.length) {
        val newWord1 = word1.dropLast(difference)
        endLetters = word1.drop(newWord1.length)

        for (i in newWord1.indices) {
            res += newWord1[i]
            res += word2[i]
        }
    } else if (word2.length > word1.length) {
        val newWord2 = word2.dropLast(abs(difference))
        endLetters = word2.drop(newWord2.length)

        for (i in newWord2.indices) {
            res += word1[i]
            res += newWord2[i]
        }
    } else {
        for (i in word1.indices) {
            res += word1[i]
            res += word2[i]
        }
    }

    return res + endLetters
}