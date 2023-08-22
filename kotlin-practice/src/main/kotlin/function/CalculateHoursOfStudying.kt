package function

fun main() {
    var calculatedTime: Double = 0.46

    val currentStudyMins = try {
        calculateCurrentTimeOfStudyingInMin("15:48", "")
    } catch (e: Exception) {
        0
    }

    val currentStudy = try {
        calculateCurrentTimeOfStudying(currentStudyMins)
    } catch (e: Exception) {
        0.0
    }

    calculatedTime = calculateTotalTimeOfStudying(calculatedTime, currentStudy)

    println(calculatedTime.toString().split(".").let { parts ->
        val mins = (parts[1] + "0").take(2)
        "${parts[0]}h ${mins}m"
    })
}

/**
 * This fun receives the already calculated time of studying (e.g. 1.2) and current time of studying (e.g. 2.2) and
 * returns a Double representing the sum of both values (3.2 in this example, which means 3h 20m).
 */
fun calculateTotalTimeOfStudying(calculatedTime: Double, currentTime: Double): Double {
    return calculatedTime + currentTime
}

/**
 * This fun receives currentMins and cutMins* and returns a Double value representing the currentTimeOfStudying
 * (e.g. 1.2) in which "1" means 1 hour and "2" means 20 minutes. Or total - 1h 20m.
 */
fun calculateCurrentTimeOfStudying(mins: Int, cutMins: Int = 0): Double {
    val reducedMins = mins - cutMins

    val hour = (reducedMins / 60).toString()
    val min = (reducedMins - (hour.toInt() * 60)).toString()

    val res = if (min.toInt() < 10) {
        "$hour.0$min".toDouble()
    } else {
        "$hour.$min".toDouble()
    }

    return res
}

// 15:20 - 16:40 (80m)
/**
 * This fun receives startTime (e.g. 15:20) and endTime (e.g. 16:40) and calculates current time of studying in mins
 * (80 for this example).
 */
fun calculateCurrentTimeOfStudyingInMin(startTime: String, endTime: String): Int {
    val minutesPerHour = 60

    val startHourInMins = startTime.removeRange(2, 5).toInt() * minutesPerHour
    val totalStartTimeInMins = startHourInMins + startTime.removeRange(0, 3).toInt()

    val endHourInMins = endTime.removeRange(2, 5).toInt() * minutesPerHour
    val totalEndTimeInMins = endHourInMins + endTime.removeRange(0, 3).toInt()

    return totalEndTimeInMins - totalStartTimeInMins
}