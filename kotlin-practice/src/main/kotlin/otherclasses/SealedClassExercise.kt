package otherclasses

fun main() {
    val vehicle = Motorcycle()
    say(vehicle)
}

sealed class Vehicle

class Bicycle : Vehicle()
class Car : Vehicle()
class Motorcycle : Vehicle()


fun say(vehicle: Vehicle) {
    when (vehicle) {
        is Bicycle -> println("It's more healthy")
        is Car -> println("It's faster")
        is Motorcycle -> println("It's dangerous")
    }
}