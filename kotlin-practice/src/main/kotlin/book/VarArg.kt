package book

fun main() {
    val myList = valuesToList(1, 2, 3, 4, 5)
    println(myList)
}

fun <T> valuesToList(vararg vals: T): MutableList<T> {
    val list: MutableList<T> = mutableListOf()

    for (i in vals) {
        list.add(i)
    }

    return list
}