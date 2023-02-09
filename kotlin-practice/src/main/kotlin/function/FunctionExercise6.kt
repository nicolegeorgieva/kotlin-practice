package function

fun main() {
    println("Input an animal group")
    val input = readln()
    println("The estimated lifespan for that animal group is ${animalGroupLifespan(input)}.")
}

/**
 * Returns the lifespan of different animal groups.
 * @param animalGroup the name of the animal group _(e.g. "cats", "dogs", etc.)_
 * @return [Int], representing the lifespan of the animal group.
 * For unknown animal group returns 20.
 */
fun animalGroupLifespan(animalGroup: String): Int {
    return when (animalGroup) {
        "cats" -> 15
        "dogs" -> 10
        "rabbits" -> 12
        "mice" -> 2
        else -> 20
    }
}