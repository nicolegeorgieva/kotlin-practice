package book

fun main() {
    println(myFun())
}

fun myFun(
    x: (Int) -> Int = {
        println(it)
        it + 7
    }
): Int {
    return x(4)
}