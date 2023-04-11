package exercise

fun main() {
    var myVariable: String? = "Nicole"

    val length = myVariable?.length ?: 0

    println(length)
}