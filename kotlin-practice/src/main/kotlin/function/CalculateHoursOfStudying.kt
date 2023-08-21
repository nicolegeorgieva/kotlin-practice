package function

fun main() {
    val calculatedHours = 0.0

    println(calculateCurrentTimeOfStudyingInMin("15:20", "16:45"))
    println(calculateCurrentTimeOfStudying(125, cutMins = 5))


}

//fun calculateTotalTimeOfStudying(startTime: Double, currentTime: Double): Double {
//
//}

fun calculateCurrentTimeOfStudying(mins: Int, cutMins: Int = 0): Double {
    var hour = ""
    var min = ""
    val reducedMins = mins - cutMins

    hour = (reducedMins / 60).toString()
    min = (reducedMins - (hour.toInt() * 60)).toString()

    val res = if (min.toInt() < 10) {
        "$hour.0$min".toDouble()
    } else {
        "$hour.$min".toDouble()
    }

    return res
}

// 15:20 - 16:40 (80m)
fun calculateCurrentTimeOfStudyingInMin(startTime: String, endTime: String): Int {
    val minutesPerHour = 60

    val startHourInMins = startTime.removeRange(2, 5).toInt() * minutesPerHour
    val totalStartTimeInMins = startHourInMins + startTime.removeRange(0, 3).toInt()

    val endHourInMins = endTime.removeRange(2, 5).toInt() * minutesPerHour
    val totalEndTimeInMins = endHourInMins + endTime.removeRange(0, 3).toInt()

    val res = totalEndTimeInMins - totalStartTimeInMins
    return res
}