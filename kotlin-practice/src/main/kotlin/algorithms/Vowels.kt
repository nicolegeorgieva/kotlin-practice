package algorithms

fun main() {
    val input = "hello"
    println(reverseVowels(input))
}

/*
Input: s = "hello"
Output: "holle"
 */
private fun reverseVowels(s: String): String {
    val input = s.lowercase()
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var finalString = input

    // TODO

    return finalString
}

private fun MutableList<Char>.swap(i: Int, j: Int) {
    val first = this[i]

    this[i] = this[j]
    this[j] = first
}