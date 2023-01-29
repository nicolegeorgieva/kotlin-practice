package practice
//a fun practice.readPerson readln(first name, last name, age) returns data class practice.Person.
// a fun (takes practice.Person) : String , returns "Hi, X, you're X y. o.

data class Person(val firstName: String, val lastName: String, val age: Int)

fun main() {
    val person1 = readPerson()
    println(message(person1))
}

private fun readPerson(): Person {
    val firstName = readInput("first name")
    val lastName = readInput("last name")
    val age = readInput("age").toInt()

    return Person(firstName, lastName, age)
}

private fun readInput(message: String): String {
    println("Enter $message")
    return readln()
}

private fun message(person: Person): String {
    return "Hi, ${person.firstName}, you're ${person.age} y. o."
}

