fun main() {
    val colors = hashSetOf<String>()

    colors.addAll(listOf("red", "blue", "beige"))
    colors.remove("beige")
    println(colors)
}