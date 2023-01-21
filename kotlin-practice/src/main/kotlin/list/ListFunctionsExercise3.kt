package list

fun main() {
    val animals = arrayListOf("lion", "zebra", "chimp", "elephant")

    animals.add("panda")
    println(animals)

    animals.remove("lion")
    println(animals)

    val condition = listOf("elephant", "giraffe")
    println(animals.containsAll(condition))
}