package book

fun main() {
    val wolf1 = Wolf1()
    wolf1.myFunction()
}

interface Roamable {}

class Wolf() : Roamable {
    fun eat() = println("Eating.")
}

class Test() : Roamable {}

class Wolf1() {
    var w: Roamable = Wolf()

    init {
        w = Test()
    }

    fun myFunction() {
        try {
            val wolf = w as Wolf
            wolf.eat()
        } catch (e: Exception) {
            println("Not ok")
        } finally {
            println("Ok")
        }

    }
}