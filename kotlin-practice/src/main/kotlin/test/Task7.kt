package test

fun main() {
    showSnake(3, 3)
}

fun showSnake(rows: Int, columns: Int) {
    var toInvert = false

    for (i in 0 until rows) {
        var output = ""

        for (number in 0 until columns) {
            val finalNumber = number + (i * columns)
            output += " $finalNumber"

        }

        if (toInvert) {
            println(output.reversed().trim())
        } else {
            println(output.trim())
        }

        toInvert = !toInvert
    }
}