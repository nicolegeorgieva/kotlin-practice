package algorithms

fun main() {
    val people = intArrayOf(3, 2, 6)
    val carsSeats = intArrayOf(4, 4, 3)

    println(canTravel(people, carsSeats))
}

/*
people: 3, 2, 6
cars: 4, 4, 2
can fit into these cars?
 */
private fun canTravel(people: IntArray, carsSeats: IntArray): Boolean {
    val peopleSum = people.sum()
    val carsSeatsSum = carsSeats.sum()

    return peopleSum <= carsSeatsSum
}