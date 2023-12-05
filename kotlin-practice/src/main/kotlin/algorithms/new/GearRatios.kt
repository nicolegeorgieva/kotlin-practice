package algorithms.new

import java.io.File

fun main() {
    val input = File("gearRatios.txt").readText()
    val lines = input.lines()

    println(getSymbolsCoordinates(lines))
}

/*
to match criteria for part number:
1. A number which is directly next to a symbol (left || right) ||
2. A number which is next || same index to a symbol (previous || same || next)
 */

data class Coordinates(
    val x: Int,
    val y: Int
)

// "...317..........214"
// "...*.........4....5"
private fun getSymbolsCoordinates(input: List<String>): List<Coordinates> {
    val symbolsCoordinates = mutableListOf<Coordinates>()

    for (i in input.indices) {
        val line = input[i]

        for (j in line.indices) {
            val char = line[j]
            if (char.isASymbol()) {
                symbolsCoordinates += Coordinates(x = j, y = i)
            }
        }
    }

    return symbolsCoordinates
}

private fun Char.isASymbol(): Boolean {
    if (this == '.') return false
    if (this.isDigit()) return false
    return true
}

private fun Char.isANumber(): Boolean {
    return this.isDigit()
}