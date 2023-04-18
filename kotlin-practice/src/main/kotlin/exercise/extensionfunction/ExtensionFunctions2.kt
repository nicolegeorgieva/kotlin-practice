package exercise.extensionfunction

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    println(list.mapp { it * it })

    println(list.mapp(::myTransform))

    println(list.filterr { it % 2 == 0 })

    println(list.mappNotNull {
        if (it % 2 != 0) it * 10 else null
    })
}

fun List<Int>.mapp(transform: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (element in this) {
        result.add(transform(element))
    }
    return result
}

fun myTransform(el: Int): Int = el * el

fun List<Int>.filterr(filter: (Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()

    for (element in this) {
        if (filter(element)) result.add(element)
    }

    return result
}

// if it's null it's not added in the list
fun List<Int>.mappNotNull(transform: (Int) -> Int?): List<Int> {
    val result = mutableListOf<Int>()

    for (element in this) {
        val transformed = transform(element)
        if (transformed != null) result.add(transformed)
    }

    return result
}