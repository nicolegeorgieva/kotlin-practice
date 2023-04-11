package exercise

abstract class Animal(val name: String) {
    abstract fun introduction()
}

class Dog(name: String) : Animal(name) {
    override fun introduction() {
        println("Dog $name introduces with \"RRR\".")
    }
}

class Cat(name: String) : Animal(name) {
    override fun introduction() {
        println("Cat $name introduces with \"Meow\".")
    }
}

fun main() {
    val dog1 = Dog(name = "Rex")
    val cat1 = Cat(name = "Rhea")

    dog1.introduction()
    cat1.introduction()
}