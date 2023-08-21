package function

fun main() {
    var calculatedTime = 3.0

    val currentStudyMins = calculateCurrentTimeOfStudyingInMin("19:00", "20:16")
    val currentStudy = calculateCurrentTimeOfStudying(currentStudyMins, cutMins = 4)

    calculatedTime = calculateTotalTimeOfStudying(calculatedTime, currentStudy)

    println(calculatedTime)
}

fun calculateTotalTimeOfStudying(calculatedTime: Double, currentTime: Double): Double {
    return calculatedTime + currentTime
}

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