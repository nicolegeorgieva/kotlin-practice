package forloop

fun main() {
    var total = 0

    for (i in 1..100) {
        total += i
    }

    println("The total sum is $total")
}