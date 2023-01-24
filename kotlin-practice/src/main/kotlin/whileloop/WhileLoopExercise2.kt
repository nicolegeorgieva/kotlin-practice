package whileloop

fun main() {
    val cats = listOf("Tiger", "Smokey", "Sassy", "Patch", "Sammy")
    var i = 0

    while (i < cats.size) {
        println("Hi, ${cats[i]}!")
        i++
    }
}