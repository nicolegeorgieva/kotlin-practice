package expression

fun main() {
    val animalShelter = listOf("dog", "cat", "mouse")

    if (animalShelter.isNotEmpty()) {
        println("There are still available animals to adopt: $animalShelter")
    } else {
        println("Thank you! All animals here have been adopted.")
    }
}