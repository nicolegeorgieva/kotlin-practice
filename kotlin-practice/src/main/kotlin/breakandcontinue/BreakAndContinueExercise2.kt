package breakandcontinue

fun main() {
    val clients = listOf("Anna", "Bob", "Carol", "David")

    for (name in clients) {
        if (name[0] == 'C') continue
        println("Hello, $name!")
    }
}