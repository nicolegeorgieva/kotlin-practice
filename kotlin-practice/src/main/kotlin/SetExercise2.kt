fun main() {
    val deskItems = hashSetOf("laptop", "jar", "cable", "hourglass")
    val toBeRemoved = setOf("cable", "jar")
    
    deskItems.removeAll(toBeRemoved)
    println(deskItems)
}