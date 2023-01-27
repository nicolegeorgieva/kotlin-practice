package oop

fun main() {
    val airplane = Airplane()
    val boeing = Boeing()
    val airbus = Airbus()

    boeing.name = "Boeing"
    airbus.name = "Airbus"
    boeing.speed = 1500
    airbus.speed = 1600

    airplane.ascend()
    airplane.descend()

    boeing.ascend()
    boeing.descend()

    airbus.ascend()
    airbus.descend()
}

open class Airplane() {
    var name = "Generic Airplane"
    var speed = 1000
    var altitude = 20000

    fun ascend() {
        altitude += 1000
        println("$name has an altitude of $altitude and speed $speed.")
    }

    fun descend() {
        altitude -= 1000
        println("$name has an altitude of $altitude and speed $speed.")
    }
}

class Boeing : Airplane()

class Airbus : Airplane()