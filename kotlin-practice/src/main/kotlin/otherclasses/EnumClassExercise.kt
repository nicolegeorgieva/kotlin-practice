package otherclasses

fun main() {
    val person = Olympics.BRONZE

    giveMedal(person)
    sayPosition(person)
}

enum class Olympics(val position: Int?) {
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(null);
}

fun giveMedal(olympics: Olympics) {
    return when (olympics.position) {
        1 -> println(olympics.name)
        2 -> println(olympics.name)
        3 -> println(olympics.name)
        else -> {
            println("NONE")
        }
    }
}

fun sayPosition(olympics: Olympics) {
    return when (olympics) {
        Olympics.GOLD -> println(olympics.position)
        Olympics.SILVER -> println(olympics.position)
        Olympics.BRONZE -> println(olympics.position)
        Olympics.NONE -> println("Other")
    }
}