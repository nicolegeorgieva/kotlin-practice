package map

fun main() {
    val customers = mapOf(Pair("John", 1), Pair("Alice", 5), Pair("Bob", 3))

    println("Is Alice a customer? : ${customers.containsKey("Alice")}")

    if (customers.containsKey("Alice")) {
        println("She bought ${customers.getValue("Alice")} products.")
    }

    println("Is Michael a customer? : ${customers.containsKey("Michael")}")
}