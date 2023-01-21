package set

fun main() {
    var acceptedColors = hashSetOf("white", "black", "grey")
    val myColors = setOf("blue", "red", "black", "green")

    acceptedColors.retainAll(myColors)
    println(acceptedColors)

    acceptedColors = hashSetOf("white", "black", "grey")
    acceptedColors.add("red")
    acceptedColors.retainAll(myColors)
    println(acceptedColors)
}