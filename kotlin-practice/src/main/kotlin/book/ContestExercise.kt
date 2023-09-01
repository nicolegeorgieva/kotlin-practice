package book

fun main() {
    val cat2 = Cat2("Amy")
    val cat3 = Cat2("Lulu")
    val dog2 = Dog2("Rex")
    val fish2 = Fish2("Anna")

    val contest2 = Contest2<Cat2>()
    contest2.addScore(cat2, 100)
    contest2.addScore(cat3, 90)

    contest2.getWinners()
}

abstract class Pet2(var name: String)

class Cat2(name: String) : Pet2(name)

class Dog2(name: String) : Pet2(name)

class Fish2(name: String) : Pet2(name)

class Contest2<T : Pet2>() {
    var scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores.put(t, score)
    }

    fun getWinners(): Set<T> {
        val highScore = scores.values.max()
        val winners = scores.filter { it.value == highScore }.keys

        winners.forEach { println("Winner: ${it.name}") }

        return winners
    }
}