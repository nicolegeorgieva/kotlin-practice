package oop

fun main() {
    val myAnimal = Animal()
    myAnimal.run()

    myAnimal.name = "Dog"
    myAnimal.topSpeed = 15
    myAnimal.run()
}

class Animal {
    var name = "Animal"
    var topSpeed = 0

    fun run() {
        println("$name's top speed is $topSpeed.")
    }
}