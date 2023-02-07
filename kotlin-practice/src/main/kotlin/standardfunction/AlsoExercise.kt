package standardfunction

fun main() {
    Car().apply {
        buildCar()
    }.also {
        println("LOG: Building the car $it.")
        println("Sending a message to the police that car $it has been built.")
    }
}

class Car {
    fun buildCar() {
        println("Building a car.")
    }
}