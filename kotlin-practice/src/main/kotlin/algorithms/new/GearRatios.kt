package algorithms.new

import java.io.File

fun main() {
    val input = File("gearRatios.txt").readText()
}

private fun isASymbol(input: Char): Boolean {
    if (input == '.') return false
    if (input.isDigit()) return false
    return true
}

private fun isANumber(input: Char): Boolean {
    return input.isDigit()
}

/*
to match criteria for part number:
1. A number which is directly next to a symbol (left || right) ||
2. A number which is next || same index to a symbol (previous || same || next)
 */

