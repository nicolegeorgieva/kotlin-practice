package extension

fun main() {
    val array = arrayListOf(2, 4, 55, 67, 88, 3)
    array.elementsCount()
}

fun ArrayList<Int>.elementsCount() = println(this.size)