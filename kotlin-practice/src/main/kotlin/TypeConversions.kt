fun main() {
    val pi = 3.14159

//    println(pi.toFloat())
//    println(pi.toInt())
//    println(pi.toString())

    println("Enter a number of type double")

    val userInput = readlnOrNull()
    val userInputToDouble = userInput?.toDoubleOrNull()

    if (userInputToDouble != null) {
        println("${userInputToDouble * pi} is of type ${userInputToDouble::class.java}")
    } else {
        println("Invalid type")
    }
}