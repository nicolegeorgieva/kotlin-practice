package practice
//reserve a table
//input 1: peopleCount
//input 2: each person first name
//input 3: each person spending

//min consumation: 10 BGN/person (one can pay for the other). 10bgn is okay for 1 person
//reservation failed/successful (? advance need to pay && ? total)
//program says ? expense(all), advance money = 20% spending/person

fun main() {
    val reservation = tableReserve()
    println(reservation)

    if (validateReservation(reservation)) {
        println("Valid reservation.")
        println("Your table's total bill is ${calculateTotalBill(reservation)}.")
        println("Your table's money in advance is ${calculateAdvanceMoney(reservation)}.")
    } else {
        println("Invalid reservation.")
    }
}

data class Reservation(val peopleCount: Int, val firstNames: List<String>, val individualBill: List<Double>)

private fun tableReserve(): Reservation {
    val peopleCount = readInput("people count").toInt()
    val firstNames = mutableListOf<String>()
    val individualBill = mutableListOf<Double>()

    for (i in 1..peopleCount) {
        println("Enter person $i")
        firstNames.add(readInput("first name"))
        individualBill.add(readInput("individual spending").toDouble())
    }

    return Reservation(peopleCount, firstNames, individualBill)
}

private fun readInput(message: String): String {
    println("Enter $message")
    return readln()
}

fun validateReservation(reservation: Reservation): Boolean {
    val tableMin = reservation.peopleCount * 10
    val totalIndividualBillPlans = reservation.individualBill.sum()

    return reservation.peopleCount > 0 && totalIndividualBillPlans >= tableMin
}

fun calculateAdvanceMoney(reservation: Reservation): Double {
    return reservation.individualBill.sum() * 0.2
}

fun calculateTotalBill(reservation: Reservation): Double {
    return reservation.individualBill.sum()
}