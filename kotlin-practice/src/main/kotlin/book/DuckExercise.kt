package book

fun main() {
    val duck1 = MyDucks(arrayOf(Duck(null), Duck(1), null))
    println(duck1.totalDuckHeight())
}

class Duck(val height: Int? = null) {
    fun quack() = println("Quack! Quack!")
}

class MyDucks(var myDucks: Array<Duck?>) {
    fun quack() {
        for (duck in myDucks) {
            duck?.quack()
        }
    }

    fun totalDuckHeight(): Int {
        var h: Int = 0
        for (duck in myDucks) {
            h += duck?.height ?: 0
        }

        return h
    }
}