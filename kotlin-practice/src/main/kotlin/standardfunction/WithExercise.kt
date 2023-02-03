package standardfunction

fun main() {
    with(Person()) {
        firstName = "Iliyan"
        age = 26
        printInfo()
    }

    val person2 = Person()
    person2.printInfo()
}

class Person {
    var firstName = "Nicole"
    var lastName = "G"
    var age = 24

    fun printInfo() {
        println("$firstName $lastName, $age")
    }
}