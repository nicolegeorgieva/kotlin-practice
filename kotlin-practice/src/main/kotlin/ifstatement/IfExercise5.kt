package ifstatement

fun main() {
    println("Write your points here.")

    val input = readlnOrNull()
    val points = input?.toIntOrNull()

    if (points == null) {
        println("Invalid input")
        return
    }

    val grade = if (points in 90..100) {
        "A"
    } else if (points in 80..89) {
        "B"
    } else if (points in 70..79) {
        "C"
    } else if (points in 60..69) {
        "D"
    } else if (points in 50..59) {
        "E"
    } else {
        "F"
    }

    println(grade)
}
