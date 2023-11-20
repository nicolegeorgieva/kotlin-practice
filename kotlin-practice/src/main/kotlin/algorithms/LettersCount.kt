package algorithms

fun main() {
    println("aabcb".countLetters())
    println("".countLetters())
    println("truikk".countLetters())
}

// aaabcb -> Map(Pair(a, 3), Pair(b, 2), Pair(c, 1))
private fun String.countLetters(): Map<Char, Int> {
    val res = mutableMapOf<Char, Int>()

    for (i in this.indices) {
        val char = this[i]

        if (res.contains(char)) {
            val currentCount = res[char] ?: 1
            res[char] = currentCount + 1
            continue
        }

        res[char] = 1
    }

    return res
}