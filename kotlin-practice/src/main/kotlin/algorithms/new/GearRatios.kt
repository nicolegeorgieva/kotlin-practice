package algorithms.new

import java.io.File

fun main() {
    val input = File("gearRatios.txt").readText()
}

/*
to match criteria for part number:
1. A number which is directly next to a symbol (left || right) ||
2. A number which is next || same index to a symbol (previous || same || next)
 */

// "617*......"
// A number which is directly next to a symbol (left || right)
private fun partNumbersFromDirectlyNextSymbols(input: String): List<Int> {
    var latestChar = ' '
    var number = ""
    val partNumbersList = mutableListOf<Int>()

    for (i in input.indices) {
        latestChar = input[i]

        if (latestChar.isANumber()) {
            number += latestChar
        } else if (latestChar.isASymbol()) {
            if (input[i - 1].isANumber()) {
                partNumbersList += number.toInt()
            }

            if (input[i + 1].isANumber()) {
                number = ""
            }
        } else {
            continue
        }
    }

    return partNumbersList
}

private fun Char.isASymbol(): Boolean {
    if (this == '.') return false
    if (this.isDigit()) return false
    return true
}

private fun Char.isANumber(): Boolean {
    return this.isDigit()
}