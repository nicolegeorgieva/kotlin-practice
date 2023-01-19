fun main() {
    val test = readln()
    try {
        println(test?.toInt())
    } catch (e: Exception) {
        e.printStackTrace()
        println("An exception happened \n ${e.localizedMessage}")
    }
}