package exercise

fun main() {
    val name = Person(null, null)
    println(greeting(name))
}

data class Person(
    val first: String?,
    val last: String?,
)

fun combineNames(person: Person): String? {
    return if (person.first != null && person.last != null &&
        person.first.isNotBlank() && person.last.isNotBlank()
    ) {
        "${person.first} ${person.last}"
    } else {
        "Invalid name"
    }
}

/*
2 names - Iliyan Germanov,
Mr. Germanov
Invalid - 1st name
no names: Invalid
 */

fun greeting(person: Person): String? {
    return if (person.first != null && person.last != null &&
        person.first.isNotBlank() && person.last.isNotBlank()
    ) {
        "${person.first} ${person.last}"
    } else if ((person.first == null || person.first.isBlank()) && person.last !== null &&
        person.last.isNotBlank()
    ) {
        "Mr. ${person.last}"
    } else {
        "Invalid name"
    }
}