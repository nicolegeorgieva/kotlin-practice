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

    val wolf = w as? Wolf

    fun myFunction() {
        wolf?.eat()
    }
}