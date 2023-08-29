package test

fun main() {
    printTriangle(6)
}

fun printTriangle(n: Int) {
    var filledSpace = "#"

    for (i in 1..n) {
        val blankSpace = n - i
        var blank = ""

        for (j in 1..blankSpace) {
            blank += " "
        }

        println("$blank$filledSpace")

        filledSpace += "##"
    }
}