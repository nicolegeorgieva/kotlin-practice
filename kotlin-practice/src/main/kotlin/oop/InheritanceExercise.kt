package oop

fun main() {
    val myLaptop = Laptop()
    myLaptop.run()

    val myApple = Apple()
    myApple.screenSize = 10
    myApple.run()
}

open class Laptop {
    var screenSize = 13
    var speed = 1200

    fun run() {
        println("Screen size: $screenSize, speed: $speed.")
    }
}

class Apple : Laptop()