package list

fun main() {
    val customers = arrayListOf("Nicole", "Iliyan")
    val newCustomer = "Morgana"

    customers.add(newCustomer)
    customers.removeAt(2)
    println(customers)
}