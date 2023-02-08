package generics

fun main() {
    val geometry = Geometry<Square>()
    geometry.printMessage(Square(), 5)

    val geometry2 = Geometry<Circle>()
    geometry2.printMessage(Circle(), 5)
}

abstract class Shape {
    abstract fun getArea(size: Int): Double
}

class Square : Shape() {
    override fun getArea(size: Int): Double = size * size.toDouble()
}

class Circle : Shape() {
    override fun getArea(size: Int): Double = size * size * 3.1415
}

class Geometry<T : Shape> {
    fun printMessage(shape: T, size: Int) {
        println("The area of this shape is ${shape.getArea(size)}")
    }
}