package breakandcontinue

fun main() {
    while (true) {
        println("Input your age")
        val input = readln()
        if (input == "stop") break

        val age = input.toInt()
        if (age < 18) {
            println("Sorry, you can't go in.")
            continue
        }

        println("Welcome!")
    }
}