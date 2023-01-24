package breakandcontinue

fun main() {
    for (i in 1..5) {
        println("Input an animal you want to bring.")
        val input = readln()

        if (input == "snake") {
            println("You can't bring a snake here.")
            break
        }

        println("$input was successfully added to the shelter.")
    }
}