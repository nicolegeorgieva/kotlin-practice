package algorithms.new

import java.io.File

fun main() {
    val input = File("day1.txt").readText()
    val input2 = File("example.txt").readText()

    println(sumOfCalibrationValues(input))
    println(sumOfCalibrationValues(input2))
}

private fun sumOfCalibrationValues(input: String): Int {
    val newInput = input.split("\n").map {
        it.filter { char ->
            char.toString().toIntOrNull() !== null
        }
    }
    var sum = 0

    for (word in newInput) {
        if (word.length == 1) {
            sum += (word + word).toInt()
            continue
        }

        sum += ("${word.first()}${word.last()}").toInt()
    }

    return sum
}