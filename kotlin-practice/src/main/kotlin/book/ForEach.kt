package book

fun main() {
    myFun()
}

fun myFun() {
    listOf("A", "B", "C", "D").forEach {
        if (it == "C") return
        println(it)
    }

    println("Finished myFun()")
}