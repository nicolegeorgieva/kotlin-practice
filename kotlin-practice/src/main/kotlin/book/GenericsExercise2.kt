package book

fun main() {
    val catFuzz = Cat("Fuzz")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny")

    val catOwner = PetOwner(catFuzz)
    catOwner.add(catKatsu)

    println(catOwner.pets)
}

class PetOwner<T : Pet>(t: T) {
    val pets = mutableListOf(t)

    fun add(t: T) {
        pets.add(t)
    }

    fun remove(t: T) {
        pets.remove(t)
    }
}