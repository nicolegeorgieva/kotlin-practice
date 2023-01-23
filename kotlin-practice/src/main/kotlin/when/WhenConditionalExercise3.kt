package `when`

fun main() {
    println("Input your name")
    val input = readlnOrNull()?.takeIf { it.isNotBlank() }?.uppercase()

    if (input == null || input[0] !in 'A'..'Z') {
        println("Invalid input")
        return
    }

    when (input[0]) {
        'A', 'B', 'C' -> println("Your name starts with one of the first 3 letters of the alphabet.")
        'D', 'E', 'F' -> println("Your name starts with one of the second 3 letters of the alphabet.")
        else -> println("Your name doesn't start with neither one of the first nor second 3 letters of the alphabet.")
    }
}