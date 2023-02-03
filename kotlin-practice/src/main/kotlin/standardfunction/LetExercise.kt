package standardfunction

fun main() {
    println("Input a number")
    val input: String = readln()

    input.let {
        val number = it.toInt()
        println("The double of your number is ${number * 2}.")
    }
}