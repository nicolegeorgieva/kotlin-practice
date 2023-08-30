package book

fun main() {
    val myLambda: () -> Unit = { println("My lambda") }
    myLambda()

    val c: (Int, Int) -> Unit = { a, b -> a * b }
    println(c(4, 5))

    val something = "Hello".let {
        println(it)
        it.length
    }

    println(something)

    val nullable: Int? = 5

    val v = nullable?.let {
        println(it)
        it * 2
    }

    println(v)
}

