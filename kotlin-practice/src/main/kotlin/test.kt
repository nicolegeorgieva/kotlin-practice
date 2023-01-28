//a fun readPerson readln(first name, last name, age) returns data class Person.
// a fun (takes Person) : String , returns "Hi, X, you're X y. o.

fun main() {
    val name1 = readPerson()
    println(message(name1))
}

fun readPerson(): Person {
    println("Write your first name")
    val firstName = readln()

    println("Write your last name")
    val lastName = readln()

    println("Write your age")
    val age = readln().toInt()

    return Person(firstName, lastName, age)
}

fun message(person: Person): String {
    return "Hi, ${person.firstName}, you're ${person.age} y. o."
}

data class Person(val firstName: String, val lastName: String, val age: Int)