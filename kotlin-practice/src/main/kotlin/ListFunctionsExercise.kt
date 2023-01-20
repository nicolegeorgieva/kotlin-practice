fun main() {
    val neededColors = listOf("red", "green", "blue")
    val availableColors = listOf("red", "blue")

    val canPrint = availableColors.containsAll(neededColors)
    println(canPrint)
}