package oop

fun main() {
    val calculator = Calculator()

    println(calculator.addNumber(22.0))
    println(calculator.subNumber(2.0))
    println(calculator.mulNumber(2.0))
    println(calculator.divNumber(10.0))
    println(calculator.resetTotal())
}

class Calculator {
    var total = 0.0

    fun addNumber(number: Double): Double {
        total += number
        return total
    }

    fun subNumber(number: Double): Double {
        total -= number
        return total
    }

    fun mulNumber(number: Double): Double {
        total *= number
        return total
    }

    fun divNumber(number: Double): Double {
        total /= number
        return total
    }

    fun resetTotal(): Double {
        total = 0.0
        return total
    }
}