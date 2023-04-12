package exercise

fun main() {
    val human1 = Human(
        names = Names("Susan", "R"),
        address = Address(
            neighborhood = "Green",
            street = Street("Monkey", StreetNumber(null, 'A')),
            flat = Flat(10, 101)
        )
    )

    println(deliverTo(human1))
}

/*
Names: Iliyan Germanov or Mr. Germanov

// return null when - name is invalid
// return null when there's no street

Delivering to Susan R to Green, Monkey 7,
 */

fun deliverTo(human: Human): String? {
    val name = validateName(human)
    val street = human.address?.let { validateStreet(it) }
    if (name == null || street == null) return "Invalid name or street."

    var res = "Delivering to "

    res += "$name"

    if (!human.address.neighborhood.isNullOrBlank()) {
        res += ", ${human.address.neighborhood}"
    }

    res += ", $street"

    if (human.address.flat?.floor != null) {
        res += ", floor: ${human.address.flat.floor}"
    }

    if (human.address.flat?.apartment != null) {
        res += ", apartment: ${human.address.flat.apartment}"
    }

    return res
}

fun validateName(human: Human): String? {
    return if (human.names?.first != null && human.names.first.isNotBlank() && human.names.last.isNotBlank()
    ) {
        "${human.names.first} ${human.names.last}"
    } else if ((human.names?.first == null || human.names.first.isBlank()) && human.names?.last !== null &&
        human.names.last.isNotBlank()
    ) {
        "Mr. ${human.names.last}"
    } else {
        null
    }
}

fun validateStreet(adress: Address): String? {
    var res = ""

    if (adress.street != null && adress.street.name.isNotBlank()) {
        res += adress.street.name
    } else {
        return null
    }

    if (adress.street.number?.number != null) {
        res += adress.street.number.number
    } else res += " "

    if (adress.street.number?.letter != null) {
        res += adress.street.number.letter
    }

    return res
}

data class Human(
    val names: Names?,
    val address: Address?,
)

data class Names(
    val first: String?,
    val last: String
)

data class Address(
    val neighborhood: String?,
    val street: Street?,
    val flat: Flat?,
)

data class Street(
    val name: String,
    val number: StreetNumber?,
)

data class StreetNumber(
    val number: Int?,
    val letter: Char,
)

data class Flat(
    val floor: Int,
    val apartment: Int?,
)