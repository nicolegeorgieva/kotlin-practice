fun main(args: Array<String>) {
    println("Write a number")

    val userInput = readlnOrNull() ?: ""
    val numberInput = userInput.toDoubleOrNull()

    if (numberInput != null) {
        println("Double is: ${numberInput * 2}")
    } else {
        println("You didn't write a valid number.")
    }
}