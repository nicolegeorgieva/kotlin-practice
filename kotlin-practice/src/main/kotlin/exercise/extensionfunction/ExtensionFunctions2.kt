package exercise.extensionfunction

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    println(list.mapp { it * it })

    println(list.mapp(::myTransform))

    println(list.filterr { it % 2 == 0 })

    println(list.mappNotNull {
        if (it % 2 != 0) it * 10 else null
    })

    val listNew = listOf("bagPrices", "bags")
    println(listNew.mapp { it -> "$it are" })
}

fun <T> List<T>.mapp(transform: (T) -> T): List<T> {
    val result = mutableListOf<T>()
    for (element in this) {
        result.add(transform(element))
    }
    return result
}

fun myTransform(el: Int): Int = el * el

fun <T> List<T>.filterr(filter: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()

    for (element in this) {
        if (filter(element)) result.add(element)
    }

    return result
}

// if it's null it's not added in the list
fun <T> List<T>.mappNotNull(transform: (T) -> T?): List<T> {
    val result = mutableListOf<T>()

    for (element in this) {
        val transformed = transform(element)
        if (transformed != null) result.add(transformed)
    }

    return result
}