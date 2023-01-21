package ifstatement

fun main() {
    println("Do you have keys for the car with you? (yes/no)")
    val input = readlnOrNull()
    var hasKeys = false

    if (input == "yes") {
        hasKeys = true
    }

    if (hasKeys) {
        println("You can start the car.")
    } else {
        println("You can't start the car.")
    }
}