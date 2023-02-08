package generics

fun main() {
    val info = Info<String>()
    info.getLength("Some string")

    val info2 = Info<Double>()
    info2.getLength(34.6)

    val info3 = Info<ArrayList<Int>>()
    info3.getLength(arrayListOf(5, 4, 3))

}

class Info<T> {
    fun getLength(element: T) {
        println(element.toString().length)
    }
}