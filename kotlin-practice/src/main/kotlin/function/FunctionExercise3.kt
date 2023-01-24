package function

fun main() {
    for (i in 1..3) {
        userData()
    }
}

fun userData() {
    println("What's your name?")
    val name = readln()
    println("What's your birth year?")
    val birthYear = readln().toInt()

    println("$name is ${2023 - birthYear - 1} or ${2023 - birthYear} y.o.")
}