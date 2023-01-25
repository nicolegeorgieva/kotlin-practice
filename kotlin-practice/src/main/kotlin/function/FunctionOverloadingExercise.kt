package function

fun main() {
    feedAnimal("dog")
    feedAnimal(listOf("cat", "parrot", "mouse"))
}

fun feedAnimal(animals: Collection<String>) {
    for (animal in animals) {
        feedAnimal(animal)
    }
}

fun feedAnimal(animal: String) {
    println("Feed the $animal.")
}