package whileloop

fun main() {
    var finished = false
    do {
        println("Please enter a number greater than 100")
        val input = readln() ?: ""
        val number = input.toInt()

        if (number > 100) {
            println("Thanks")
            finished = true
        } else {
            println("$number is not greater than 100. Please try again.")
        }
    } while (!finished)
}