package ifstatement

fun main() {
    println("Write a number")
    var input = readlnOrNull() ?: "0"
    val numberInput = input?.toIntOrNull()

    if (numberInput == null) {
        println("Invalid input")
        return
    }

    if (numberInput / 10 == 0) println("The number contains one digit") else println("The number doesn't contain one digit.")
}
