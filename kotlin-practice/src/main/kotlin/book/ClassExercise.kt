package book

fun main() {
    val myCats = arrayOf(Cat("Misty"), Cat(null), null, Cat("Socks"))

    for (cat in myCats) {
        print("${cat?.name}:")
        cat?.meow()
    }
}

class Cat(var name: String? = null) {
    fun meow() {
        println("Meow!")
    }
}