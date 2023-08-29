package book

fun main() {
    val catFuzz = Cat("Fuzz")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny")

    val catOwner = PetOwner(catFuzz)
    catOwner.add(catKatsu)

    println(catOwner.pets)

    val dogRetailer = DogRetailer()
    val catRetailer = CatRetailer()
    val fishRetailer = FishRetailer()

    var petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer = fishRetailer

    println(petRetailer.sell())
}

class Vet<in T : Pet> {
    fun treat(t: T) {
        println("Treat pet ${t.name}")
    }
}

class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell cat")
        return Cat("")
    }
}

class DogRetailer : Retailer<Dog> {
    override fun sell(): Dog {
        println("Sell dog")
        return Dog("")
    }
}

class FishRetailer : Retailer<Fish> {
    override fun sell(): Fish {
        println("Sell fish")
        return Fish("")
    }
}

interface Retailer<out T> {
    fun sell(): T
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