package test

fun main() {
    val someClass = SomeClass()
    someClass.a()
    someClass.c()
}

class SomeClass {
    fun a() {
        println(42)
    }

    fun b() {
        a()
    }

    fun c() {
        this.b()
    }
}