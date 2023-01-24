package function

fun main() {
    for (i in 1..3) {
        multiplyNumber()
    }
}

fun multiplyNumber() {
    println("Input a number")
    val input = readln().toInt()
    val multiplied = input.times(17)

    println(multiplied)
}
