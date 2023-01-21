package list

fun main() {
    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val itemsToRemove = listOf("pen", "paper", "mug", "phone")

    items.removeAll(itemsToRemove)
    println(items)
}