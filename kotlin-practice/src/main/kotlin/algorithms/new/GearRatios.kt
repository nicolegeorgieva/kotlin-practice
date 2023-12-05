package algorithms.new

import java.io.File

fun main() {
    val input = File("gearRatios.txt").readText()

    println(isASymbol("%"))
}

private fun isASymbol(input: String): Boolean {
    if (input == ".") return false
    if (input.toIntOrNull() != null) return false
    return true
}