package whileloop

fun main() {
    println("Input an integer")
    val input = readlnOrNull()
    val number = input?.toIntOrNull()

    if (number == null) {
        println("Invalid number")
        return
    }

    var i = 1
    var factorial = 1L

    while (i <= number) {
        factorial *= i
        i++
    }

    println(factorial)
}