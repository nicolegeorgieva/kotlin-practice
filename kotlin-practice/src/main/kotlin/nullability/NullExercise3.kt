package nullability

fun main() {
    println("Please insert a number")
    val number = readlnOrNull()

    val result = number?.toDoubleOrNull()?.times(7)?.toString()
    println("Length of $result is ${result?.length}")
}