package algorithms.new

import java.io.File

fun main() {
    val input = File("cubes.txt").readText()
    val sets =
        parseSets("Game 1: 4 blue, 16 green, 2 red; 5 red, 11 blue, 16 green; 9 green, 11 blue; 10 blue, 6 green, 4 red")

    println(getFewestValidGameCubes(sets))
}

val bag = Set(
    redCubesCount = 12,
    greenCubesCount = 13,
    blueCubesCount = 14
)

data class Game(
    val id: Int,
    val sets: List<Set>
)

data class Set(
    val redCubesCount: Int,
    val greenCubesCount: Int,
    val blueCubesCount: Int
)

private fun validGamesSum(input: String): Int {
    return input.lines()
        .map(::parseAsGame)
        .filter(::validateGame)
        .sumOf { it.id }
}

// Set(blue=2, red=3, red=1), Set(green=2, blue=3; green=4)
private fun getFewestValidGameCubes(gameSets: List<Set>): Set {
    val redCount = gameSets.maxOf {
        it.redCubesCount
    }
    val blueCount = gameSets.maxOf {
        it.blueCubesCount
    }
    val greenCount = gameSets.maxOf {
        it.greenCubesCount
    }

    return Set(redCubesCount = redCount, greenCubesCount = greenCount, blueCubesCount = blueCount)
}

// "Game 1: 4 blue, 16 green, 2 red; 5 red, 11 blue, 16 green; 9 green, 11 blue; 10 blue, 6 green, 4 red"
private fun parseAsGame(line: String): Game {
    val gameId = parseGameId(line)
    val gameSets = parseSets(line)

    return Game(id = gameId, sets = gameSets)
}

// Game 15
private fun parseGameId(line: String): Int {
    val gameTitleList = line
        .split(":")
        .first()
        .split(" ")
    return gameTitleList[1].toInt()
}

// "Game 1: 4 blue, 16 green, 2 red; 5 red, 11 blue, 16 green; 9 green, 11 blue; 10 blue, 6 green, 4 red"
private fun parseSets(line: String): List<Set> {
    val lineWithoutTitle = line.split(":").last()
    val sets = lineWithoutTitle.split(";")

    return sets.map {
        parseStringToSet(it)
    }
}

// 4 blue, 16 green, 2 red
private fun parseStringToSet(input: String): Set {
    var red = 0
    var green = 0
    var blue = 0

    val inputList = input.split(",")

    // 4 blue
    for (i in inputList.indices) {
        val current = inputList[i].filter {
            it != ','
        }.trim().split(" ")

        when (current[1]) {
            "red" -> red += current[0].toInt()
            "green" -> green += current[0].toInt()
            "blue" -> blue += current[0].toInt()
        }
    }

    return Set(
        redCubesCount = red,
        greenCubesCount = green,
        blueCubesCount = blue
    )
}

private fun validateGame(game: Game): Boolean {
    return game.sets.all {
        validateSet(it)
    }
}

// Set(redCubesCount=2, greenCubesCount=16, blueCubesCount=4)
private fun validateSet(set: Set): Boolean {
    return set.redCubesCount <= bag.redCubesCount &&
            set.greenCubesCount <= bag.greenCubesCount &&
            set.blueCubesCount <= bag.blueCubesCount
}