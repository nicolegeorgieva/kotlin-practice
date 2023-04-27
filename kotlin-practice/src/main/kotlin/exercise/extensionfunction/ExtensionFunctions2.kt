package exercise.extensionfunction

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    println(list.mapp { it * it })

    println(list.mapp(::myTransform))

    println(list.filterr { it % 2 == 0 })

    println(list.mappNotNull {
        if (it % 2 != 0) it * 10 else null
    })

    val listNew = listOf("bag prices", "bags")
    println(listNew.mapp { it -> "$it are" })

    println(list.map { "This is number $it" })
    println(list.mapp { it * 3.0 })
}

fun <T, R> List<T>.mapp(transform: (T) -> R): List<R> {
    val result = mutableListOf<R>()
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
fun <T, R> List<T>.mappNotNull(transform: (T) -> R?): List<R> {
    val result = mutableListOf<R>()

    for (element in this) {
        val transformed = transform(element)
        if (transformed != null) result.add(transformed)
    }

    return result
}