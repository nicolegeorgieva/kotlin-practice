package algorithms

fun main() {
    val text = "Hi, I'm Nicole. I've been diving deep into Software Development for about 2 years, particularly into " +
            "Android Development with Kotlin and Jetpack Compose. I'm proficient in mobile UI/UX and have worked on " +
            "projects related to productivity, fintech, and health. I'm genuinely passionate about tech and believe " +
            "that IT has a huge role to play in our future. I’m ready to bring my expertise to exciting new challenges" +
            " in Android development!"
    println(text.wordsCount())
    println(text.wordsCountWithDensity())
}

// Nice exercise. The exercise is under number 5. Nice.
private fun String.wordsCount(): Map<String, Int> {
    val wordsCountMap = mutableMapOf<String, Int>()

    // Nice, exercise, The, exercise
    val words = this.filter {
        it != '.' && it != ',' && it != '!'
    }.lowercase().split(" ")

    for (word in words) {
        val wordCount = wordsCountMap[word] ?: 0
        wordsCountMap[word] = wordCount + 1
    }

    return wordsCountMap.toList().sortedByDescending { it.second }.toMap()
}

data class SeoInfo(
    val wordCount: Int,
    val densityPercent: Double
)

// 10 words, 3 count -> 30%
private fun String.wordsCountWithDensity(): Map<String, SeoInfo> {
    val wordsCountMap = this.wordsCount()
    val totalWords = wordsCountMap.size

    val resMap = wordsCountMap.map {
        Pair(
            it.key, SeoInfo(
                wordCount = it.value,
                densityPercent = (it.value / totalWords.toDouble()) * 100
            )
        )
    }.toMap()

    return resMap
}