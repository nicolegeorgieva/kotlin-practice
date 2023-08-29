package book

fun main() {
    val catFiz = Cat("Fiz")

    val petVet = Vet<Pet>()
    val catVet = Vet<Cat>()
    val dogVet = Vet<Dog>()
    val fishVet = Vet<Fish>()

    catVet.treat(catFiz)
    petVet.treat(catFiz)

    val catContest = Contest<Cat>(petVet)

    catContest.addScore(Cat("Fuzz"), 50)
    catContest.addScore(Cat("Katsu"), 45)

    val topCat = catContest.getWinners().first().name
    println(topCat)

    val allPetsContest = Contest(petVet)

    allPetsContest.addScore(Dog("Rex"), 100)
    allPetsContest.addScore(Fish("Amy"), 35)

    val topPet = allPetsContest.getWinners().first().name
    println(topPet)
}

abstract class Pet(var name: String)

class Cat(name: String) : Pet(name) {
    override fun toString(): String {
        return "Cat(name=\"$name\")"
    }
}
class Dog(name: String) : Pet(name)
class Fish(name: String) : Pet(name) {
    override fun toString(): String {
        return "Fish(name=\"$name\")"
    }
}

class Contest<T : Pet>(var vet: Vet<T>) {
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores.put(t, score)
    }

    fun getWinners(): MutableSet<T> {
        val highScore = scores.values.max()
        val winners: MutableSet<T> = mutableSetOf()

        for ((t, score) in scores) {
            if (score == highScore) winners.add(t)
        }

        return winners
    }
}
