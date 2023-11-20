package algorithms

fun main() {
    println("aabcb".countLetters())
    println("".countLetters())
    println("truikk".countLetters())
}

// aaabcb -> Map(Pair(a, 3), Pair(b, 2), Pair(c, 1))
private fun String.countLetters(): Map<Char, Int> {
    val charsCountMap = mutableMapOf<Char, Int>()

    for (i in this.indices) {
        val char = this[i]

        if (charsCountMap.contains(char)) {
            val currentCount = charsCountMap[char] ?: 1
            charsCountMap[char] = currentCount + 1
            continue
        }

        charsCountMap[char] = 1
    }

    return charsCountMap
}