package breakandcontinue

fun main() {
    val animals = arrayListOf<String>()

    for (i in 1..5) {
        println("Input an animal you want to bring.")
        val input = readln()

        if (input == "snake") {
            println("You can't bring a snake here.")
            break
        }

        animals.add(input)
        println("$input was successfully added to the shelter.")
    }

    println("All animals added: $animals")
}