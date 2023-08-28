package book

fun main() {
    val elephants = arrayOf(Elephant("Misty"), Elephant(null), null, Elephant("Socks"))

    for (elephant in elephants) {
        print("${elephant?.name}:")
        elephant?.howl()
    }
}

class Elephant(var name: String? = null) {
    fun howl() {
        println("sjdnalarjb!")
    }
}