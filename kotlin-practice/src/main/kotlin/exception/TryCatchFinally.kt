package exception

fun main() {
    try {
        println("What product would you like to buy?")
        val product = readln()
        if (product.isBlank()) error("Product is blank.")

        println("How many of it do you require?")
        val quantity = readln().toInt()
        val productPrice = 9.99

        println("Total sum: ${quantity.times(productPrice)}")
    } catch (e: Exception) {
        e.printStackTrace()
        println("An exception has occurred \n ${e.localizedMessage}")
    } finally {
        println("The execution has completed")
    }
}