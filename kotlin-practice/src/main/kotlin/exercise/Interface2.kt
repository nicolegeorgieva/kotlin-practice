package exercise

interface ArithmeticOperation {
    fun operate(a: Double, b: Double): Double
}

class Addition : ArithmeticOperation {
    override fun operate(a: Double, b: Double): Double = a + b
}

class Subtraction : ArithmeticOperation {
    override fun operate(a: Double, b: Double): Double = a - b
}

class Multiplication : ArithmeticOperation {
    override fun operate(a: Double, b: Double): Double = a * b
}

class Division : ArithmeticOperation {
    override fun operate(a: Double, b: Double): Double = a / b
}

class Calculator(val arithmeticOperation: ArithmeticOperation) {
    fun calculate(a: Double, b: Double): Double {
        return arithmeticOperation.operate(a, b)
    }
}

fun main() {
    val add = Addition()
    val calculator = Calculator(add)

    println(calculator.calculate(6.0, 5.0))
}