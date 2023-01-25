package scope

fun main() {
    val year = 2015

    printYear()
    println("The year inside main is $year.")
}

fun printYear() {
    val year = 1985
    println("The year inside the function is $year.")
}