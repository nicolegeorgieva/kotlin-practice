fun main(args: Array<String>) {
    println("Write a number")

    val numberInput = readLine() ?: ""
    println("Double is: ${numberInput.toInt() * 2}")
}