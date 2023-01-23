package forloop

fun main() {
    println("Input a number")
    val input = readlnOrNull()
    val maxValue = input?.toIntOrNull()

    if (maxValue == null) {
        println("Invalid input")
        return
    }

    for (i in maxValue downTo 0) {
        if (i % 7 == 0) {
            println(i)
        }
    }
}