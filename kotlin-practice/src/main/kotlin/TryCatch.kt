fun main() {
    val test = readln()
    try {
        println(test?.toInt())
    } catch (e: Exception) {
        println("An exception happened \n ${e.localizedMessage}")
    }
}