package higherorderfunction

fun main() {
    val clients = listOf("Anna", "Susan", "Sarah", "Kelly")
    println(clients.sortedBy { it.last() })
}