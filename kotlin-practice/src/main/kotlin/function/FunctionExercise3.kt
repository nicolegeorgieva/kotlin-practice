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

    println("$name, $birthYear")
}