package `when`

fun main() {
    val recommendedAmount = 3
    println("Input the number of meals you have every day")
    val input = readlnOrNull()
    val meals = input?.toIntOrNull()

    if (meals == null || meals < 0) {
        println("Invalid input")
        return
    }

    when (meals) {
        in 0..2 -> println("You should eat at least $recommendedAmount meals a day.")
        3 -> println("Great, you eat the recommended amount of $recommendedAmount meals a day.")
        else -> println("You should eat less. The recommended amount is $recommendedAmount meals a day.")
    }
}