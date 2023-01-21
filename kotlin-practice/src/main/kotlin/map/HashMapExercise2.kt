package map

fun main() {
    val attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 3254))

    attendance["26 Sept"] = 9348

    val totalFor25And26 = attendance.getValue("25 Sept") + attendance.getValue("26 Sept")
    println("On 25th and 26th of September attended a total of $totalFor25And26 people")

    println("Is data available for 22 Sept? : ${attendance.containsKey("22 Sept")}")
}