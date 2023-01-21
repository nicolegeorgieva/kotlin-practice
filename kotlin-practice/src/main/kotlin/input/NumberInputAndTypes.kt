package input

fun main(args: Array<String>) {
    println("Write a number")

    val userInput = readlnOrNull() ?: ""
    val userInputToInt = userInput.toIntOrNull()
    val doubleTypeNum = 5.42

    val result = if (userInputToInt != null) userInputToInt * doubleTypeNum else "Invalid number"

    println(result::class.java)
}