package expression

fun main() {
    println("How many cats do you have?")
    val input = readlnOrNull()
    val catsCount = input?.toIntOrNull()

    if (catsCount == null) {
        println("Invalid input")
        return
    }

    if (catsCount == 0) {
        println("no cats")
    } else if (catsCount in 1..3) {
        println("few cats")
    } else if (catsCount in 4..6) {
        println("several cats")
    } else {
        println("many cats")
    }
}