package function

fun main() {
    feedAnimal("dog")
    feedAnimal(listOf("cat", "parrot", "mouse"))
}

fun feedAnimal(animals: Collection<String>) {
    for (animal in animals) {
        println("Feed the $animal.")
    }
}

fun feedAnimal(animal: String) {
    println("Feed the $animal.")
}