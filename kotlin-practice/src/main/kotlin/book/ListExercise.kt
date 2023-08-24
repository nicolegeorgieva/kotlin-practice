package book

fun main() {
    val list = listOf(
        "book", "horse", "glass", "glass", Tasks("task1"), Tasks("task1"),
        ToDo("todo1"), ToDo("todo1")
    )
    val isEqual = list[2] == list[3]
    println(isEqual)

    val isEqual2 = list[4] == list[5]
    println(isEqual2)

    val isEqual3 = list[6] == list[7]
    println(isEqual3)
}

class Tasks(val taskName: String)

data class ToDo(val todo: String)

