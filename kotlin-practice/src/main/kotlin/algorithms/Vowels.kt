package algorithms

fun main() {
    val input = "hello"
    val input2 = "leetcode"
    val input3 = "helilotu" // hulolite

    println(reverseVowels(input))
    println(reverseVowels(input2))
    println(reverseVowels(input3))
}

/*
Input: s = "hello"
1, 4
"leetcode"
1, 2, 5, 7
Output: "holle"
 */
private fun reverseVowels(s: String): String {
    val input = s.lowercase()
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    val finalString = input.toMutableList()
    val indicesToSwap = mutableListOf<Int>()

    for (i in input.indices) {
        if (input[i] in vowels) {
            indicesToSwap.add(i)
        }
    }

    if (indicesToSwap.isEmpty()) return input

    for (j in indicesToSwap.indices) {
        finalString.swap(indicesToSwap[j], indicesToSwap[indicesToSwap.size - 1 - j])
    }

    return finalString.joinToString("")
}

private fun MutableList<Char>.swap(i: Int, j: Int) {
    val first = this[i]

    this[i] = this[j]
    this[j] = first
}