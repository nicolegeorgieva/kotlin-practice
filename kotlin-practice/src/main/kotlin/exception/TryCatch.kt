package exception

fun main() {
    val test = readln()
    try {
        println(test?.toInt())
    } catch (e: Exception) {
        e.printStackTrace()
        println("An exception has occurred \n ${e.localizedMessage}")
    } finally {
        println("The execution has completed")
    }
}