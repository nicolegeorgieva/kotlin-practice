package whileloop

fun main() {
    println("Input a large integer")
    val input = readlnOrNull()
    val number = input?.toIntOrNull()?.toLong()

    if (number == null) {
        println("Invalid number")
        return
    }

    var i = 0
    while (i < number) {
        if (i % 7 == 0) {
            println(i)
        }
        i++
    }
}