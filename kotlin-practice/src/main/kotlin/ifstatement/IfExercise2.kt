package ifstatement

fun main() {
    println("Write the hour of the current time (1, 2, 3, 4, 23).")
    val input = readlnOrNull()
    val hour = input?.toIntOrNull()
    if (hour == null) {
        println("Invalid input")
        return
    }

    if (hour < 12) {
        println("$hour am")
    } else if (hour == 12) {
        println("$hour pm")
    } else {
        println("${hour - 12} pm")
    }
}