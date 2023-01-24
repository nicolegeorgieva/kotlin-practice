package function

fun main() {
    println("Input an animal group")
    val input = readln()
    println("The estimated lifespan for that animal group is ${animalGroupLifespan(input)}.")
}

fun animalGroupLifespan(animalGroup: String): Int {
    return when (animalGroup) {
        "cats" -> 15
        "dogs" -> 10
        "rabbit" -> 12
        else -> 20
    }
}