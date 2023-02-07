package otherclasses

fun main() {
    val customers = mutableListOf<CustomerInfo>()

    customers.add(CustomerInfo(name = "Iliyan", email = "ig@gmail.com", productsBought = 3))
    customers.add(CustomerInfo(name = "Nicole", email = "ng@gmail.com", productsBought = 5))
    customers.add(CustomerInfo(name = "Freya", email = "freya@gmail.com", productsBought = 2))
    println(customers)

    val newCustomer = customers[1].copy(email = "n.g@gmail.com")
    customers.add(newCustomer)
    println(customers)

    sendEmail(customers)
}

fun sendEmail(customers: MutableCollection<CustomerInfo>) {
    customers.forEach { println("Sending an email to ${it.email}") }
}

data class CustomerInfo(val name: String, val email: String, val productsBought: Int)