package `when`

fun main() {
    println("Input the current hour.")
    val input = readlnOrNull()
    val hour = input?.toIntOrNull()

    if (hour == null || hour > 24 || hour < 0) {
        println("Invalid input")
        return
    }

    val timeOfDay = when (hour) {
        in 6..11 -> "morning"
        in 12..14 -> "noon"
        in 15..17 -> "afternoon"
        in 18..21 -> "evening"
        else -> "night"
    }

    println("$hour:00 is in the $timeOfDay.")
}