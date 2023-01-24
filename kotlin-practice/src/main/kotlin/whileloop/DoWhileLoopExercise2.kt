package whileloop

fun main() {
    var finished = false

    do {
        println("Input a number")
        val input = readln()
        val number = input.toInt()

        var factorial = 1L
        var i = 1

        while (i <= number) {
            factorial *= i
            i++
        }

        if (factorial < 3000000) {
            println("The factorial of number $number is $factorial and it's smaller than 3 000 000.")
        } else {
            println("The factorial of number $number is $factorial.")
            finished = true
        }

    } while (!finished)
}