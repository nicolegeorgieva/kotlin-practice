package algorithms

fun main() {
    println(lengthOfLastWord("Hello World   "))
}

// "Hello World   "
private fun lengthOfLastWord(s: String): Int {
    val words = s.trim().split(" ")
    return words.last().length
}