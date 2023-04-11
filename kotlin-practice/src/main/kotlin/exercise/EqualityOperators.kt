package exercise

fun main() {
    val str1 = String("Hello".toCharArray())
    val str2 = String("Hello".toCharArray())

    val isEqual = (str1 == str2)
    val isSameObject = (str1 === str2)

    println(str1)
    println(str2)

    println(isEqual)
    println(isSameObject)
}