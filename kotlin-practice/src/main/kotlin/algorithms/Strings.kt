package algorithms

fun main() {
    val word1 = "cdf"
    val word2 = "a"

    println(mergeAlternately(word1, word2))
}

private fun mergeAlternately(word1: String, word2: String): String {
    val longerLength = maxOf(word1.length, word2.length)

    return buildString {
        for (i in 0 until longerLength) {
            word1.getOrNull(i)?.let {
                append(it)
            }
            word2.getOrNull(i)?.let {
                append(it)
            }
        }
    }
}