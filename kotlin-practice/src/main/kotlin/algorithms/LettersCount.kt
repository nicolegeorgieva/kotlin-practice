package algorithms

fun main() {
    println("aabcb".countLetters())
    println("".countLetters())
    println("truikk".countLetters())
}

// aabcb -> Map(Pair(a, 2), Pair(b, 2), Pair(c, 1))
private fun String.countLetters(): Map<Char, Int> {
    var res = mutableMapOf<Char, Int>()

    val uniqueChars = this.toSet().toList() // a, b, c

    for (i in uniqueChars.indices) {
        val count = this.filter { it == uniqueChars[i] }.length
        res.put(uniqueChars[i], count)
    }

    return res
}