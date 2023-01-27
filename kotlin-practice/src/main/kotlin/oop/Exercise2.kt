package oop

fun main() {
    val operations = Math()

    println(operations.add(2, 5))
    println(operations.sub(2, 1))
    println(operations.mul(2, 4))
    println(operations.div(4, 4))
}

class Math {
    fun add(a: Int, b: Int) = a + b
    fun sub(a: Int, b: Int) = a - b
    fun mul(a: Int, b: Int) = a * b
    fun div(a: Int, b: Int) = a / b
}