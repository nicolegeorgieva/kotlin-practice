fun main(args: Array<String>) {
    println("Write a number")

    val userInput = readlnOrNull() ?: ""
    val numberInput = userInput.toDoubleOrNull()

    if (numberInput != null) {
        println("Double is: ${numberInput * 2}")
    } else {
        println("You didn't write a valid number.")
    }

    println("Enter your birth year")
    calculateAge(2023)
}

fun calculateAge(currentYear: Int) {
    val birthYear = readlnOrNull() ?: ""
    val birthYearNumberInput = birthYear.toIntOrNull()

    if (birthYearNumberInput != null) {
        println("Your age is ${currentYear - birthYearNumberInput}")
    } else {
        println("You didn't enter a valid birth year")
    }

}