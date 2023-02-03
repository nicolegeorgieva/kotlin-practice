package standardfunction

fun main() {
    with(Person()) {
        firstName = "Iliyan"
        age = 26
        printInfo()
    }
}

class Person {
    var firstName = "Nicole"
    var lastName = "G"
    var age = 24

    fun printInfo() {
        println("$firstName $lastName, $age")
    }
}