package standardfunction

fun main() {
    val animals = mutableListOf<String?>()

    for (i in 1..3) {
        println("Input an animal")
        val input = readln()
        input.let {
            if (it.isEmpty()) {
                animals.add(null)
            } else {
                animals.add(it)
            }
        }
    }

    println(animals)

    animals.forEach {
        it?.let {
            println("Feeding the $it.")
        }
    }
}