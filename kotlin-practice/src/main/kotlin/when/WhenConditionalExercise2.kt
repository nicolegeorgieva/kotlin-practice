package `when`

fun main() {
    println("Input the current hour.")
    val input = readlnOrNull()
    val hour = input?.toIntOrNull()

    if (hour == null || hour > 24) {
        println("Invalid input")
        return
    }

    when (hour) {
        in 6..11 -> println("It's morning.")
        in 12..14 -> println("It's noon.")
        in 15..17 -> println("It's afternoon.")
        in 18..21 -> println("It's evening.")
        else -> println("It's night.")
    }
}