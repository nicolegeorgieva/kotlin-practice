package vararg

fun main() {
    sayHello(3, "Nicole", "Iliyan")
}

fun sayHello(count: Int, vararg names: String) {
    for (name in names) {
        for (i in 1..count) {
            println("Hello, $name!")
        }
    }
}