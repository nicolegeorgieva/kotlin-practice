package algorithms.new

import java.io.File

fun main() {
    val input = File("gearRatios.txt").readText()
    val lines = input.lines()

    println(foundAdjacentSymbols(lines, Coordinates(1, 11)))
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

// "...317..........214......"
// "..@.........568...#......"
// x = 3, y = 0 (always for 1st char)
private fun foundAdjacentSymbols(input: List<String>, coordinates: Coordinates): Boolean {
    val x = coordinates.x
    val y = coordinates.y

    for (i in input.indices) {
        val line = input[i]

        for (j in line.indices) {
            val char = line[j]

            if (char.isASymbol()) {
                if (x == j - 1 || x == j + 1 || y == i - 1 || y == i + 1) {
                    return true
                }
            }
        }
    }

    return false
}


private fun Char.isASymbol(): Boolean {
    if (this == '.') return false
    if (this.isDigit()) return false
    return true
}

private fun Char.isANumber(): Boolean {
    return this.isDigit()
}