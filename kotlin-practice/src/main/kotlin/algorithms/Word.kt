package algorithms

fun main() {
    val input = listOf("N>I", "I>C", "C>O", "O>L", "L>E").shuffled()
    val input2 = listOf("R>U", "P>E", "E>R").shuffled()
    println(generateTheWord(input))
    println(generateTheWord(input2))
}

private fun generateTheWord(input: List<String>): String {
    var word = ""
    var firstLetter = input[0][0]
    var lastLetter = input[0][2]
    var middleWord = ""

    for (i in input.indices) {
        if (input[i].contains(lastLetter)) {
            lastLetter = input[i][2]
        }

        if (input[i].contains(firstLetter)) {
            firstLetter = input[i][0]
        }

        if (i == 0) {
            middleWord += input[i][0]
            middleWord += input[i][2]
            continue
        }

        if (input[i][0] == middleWord[1]) {
            middleWord += input[i][2]
            continue
        }
    }

    word = firstLetter + middleWord + lastLetter
    return word.toSet().joinToString("")
}