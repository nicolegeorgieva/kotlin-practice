package algorithms.new

import java.io.File

fun main() {
    val input = File("day1.txt").readText()
    val input2 = File("example.txt").readText()
    val input3 = File("new.txt").readText()

    println(sumOfCalibrationValues(input))
    println(sumOfCalibrationValues(input2))
    println(sumOfCalibrationValues(input3))
}

/*
two1nine
29
 */
private fun sumOfCalibrationValues(input: String): Int {
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

    var sum = 0

    val words = input.split("\n")
    val validWords = mutableListOf<Int>()

    for (i in words.indices) {
        var input = ""
        var currentNum = ""

        for (y in words[i].indices) {
            // 0 -> two1nine -> t
            val text = words[i][y]

            if (text.isDigit()) {
                currentNum += text
                continue
            }

            if (input in numbers.keys) {
                currentNum += numbers[currentNum]
                input = ""
                continue
            }

            input += text

            if (i == words.size - 1) {
                validWords.add("${currentNum.first()}${currentNum.last()}".toInt())
            }
        }
    }

    return validWords.sum()
}
