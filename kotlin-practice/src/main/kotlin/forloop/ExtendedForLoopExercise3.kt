package forloop

fun main() {
    println("Input a number")
    val input = readlnOrNull()
    val number = input?.toIntOrNull()

    if (number == null) {
        println("Invalid input")
        return
    }

    for (i in 1..number) {
        for (j in 1..number) {
            when ((i * j) % 3) {
                0 -> print("\uD83D\uDE00")
                1 -> print("\uD83E\uDD28")
                2 -> print("\uD83D\uDE31")
            }
        }
        println()
    }
}