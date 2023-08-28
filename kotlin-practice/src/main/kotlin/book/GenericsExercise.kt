package book

fun main() {
    val catContest = Contest<Cat>()

    catContest.addScore(Cat("Fuzz"), 50)
    catContest.addScore(Cat("Katsu"), 45)

    val topCat = catContest.getWinners().first().name
    println(topCat)
}

abstract class Pet(var name: String)
class Cat(name: String) : Pet(name)
class Dog(name: String) : Pet(name)
class Fish(name: String) : Pet(name)

class Contest<T : Pet> {
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
