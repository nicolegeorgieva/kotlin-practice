package expression

fun main() {
    println("Input your age")
    val input = readlnOrNull()
    var age = input?.toIntOrNull()

    if (age == null) {
        println("Invalid input")
        return
    }

    if (age < 13) {
        if (age == 0) {
            age = 1
        }
        println("You're $age y.o., so you're a child.")
    } else if (age < 18) {
        println("You're $age y.o., so you're a teen.")
    } else {
        println("You're $age y.o., so you're an adult.")
    }
}