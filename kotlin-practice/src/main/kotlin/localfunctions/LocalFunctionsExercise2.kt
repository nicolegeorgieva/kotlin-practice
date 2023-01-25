package localfunctions

fun main() {
    greeting()
}

fun greeting() {
    fun printGreeting(name: String) {
        println("Hello, $name!")
    }

    while (true) {
        println("Input a name")
        val input = readln()
        if (input == "") break

        printGreeting(input)
    }
}