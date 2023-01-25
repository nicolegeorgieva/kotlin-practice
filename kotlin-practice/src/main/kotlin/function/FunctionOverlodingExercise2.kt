package function

fun main() {
    messageSize("Hello how are you")
    messageSize(8)
}

fun messageSize(size: Int) {
    var message = ""
    for (i in 1..size) {
        message += "n"
    }

    println("A message of size $size is '$message'.")
}

fun messageSize(message: String) {
    println("'$message' has a size of ${message.length}.")
}
