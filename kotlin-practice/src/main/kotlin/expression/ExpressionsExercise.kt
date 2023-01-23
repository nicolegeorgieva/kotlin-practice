package expression

fun main() {
    val guestList = setOf("John", "Alice", "Bob", "Carol")
    println("Please enter your name")

    val guest = readlnOrNull()?.takeIf { it.isNotBlank() }
    if (guest == null) {
        println("Invalid input")
        return
    }

    if (guest in guestList) println("Hi, $guest, please come in.") else println(
        "Your name doesn't exist in the guest" +
                "list."
    )
}