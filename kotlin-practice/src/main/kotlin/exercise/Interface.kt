package exercise

interface SoundMaker {
    fun makeSound()
}

class Lion : SoundMaker {
    override fun makeSound() {
        println("Rrrr")
    }
}

class Elephant : SoundMaker {
    override fun makeSound() {
        println("Hrrr")
    }
}

class Monkey : SoundMaker {
    override fun makeSound() {
        println("Uuaa")
    }
}

fun main() {
    val lion = Lion()
    lion.makeSound()

    val elephant = Elephant()
    elephant.makeSound()

    val monkey = Monkey()
    monkey.makeSound()
}
