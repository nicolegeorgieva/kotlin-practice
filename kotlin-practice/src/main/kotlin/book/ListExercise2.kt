package book

fun main() {
    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")

    val pets = petsLiam + petsSophia + petsNoah + petsEmily
    println("All pets: $pets")
    println("Number of pets: ${pets.size}")

    val allPetsTypes = pets.toSet()
    println("There are ${allPetsTypes.size} types of pets.")

    println("Pets types in alphabetical order: ${allPetsTypes.sorted().joinToString(", ")}")
}