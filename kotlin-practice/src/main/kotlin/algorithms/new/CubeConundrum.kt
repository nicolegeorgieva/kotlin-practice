package algorithms.new

import java.io.File

fun main() {
    val input = File("cubes.txt").readText()
    val gameList = parseInput(input)

    //[Game 1: 4 blue, 16 green, 2 red,  5 red, 11 blue, 16 green,  9 green, 11 blue,  10 blue, 6 green, 4 red]

//    println(parseGameId("Game 15: 4 blue, 16 green, 2 red,  5 red, 11 blue, 16 green,  9 green, 11 blue,  10 blue, 6 green, 4 red"))
//    println(parseStringToSet("4 blue, 16 green, 2 red"))
//    println(parseSets("Game 1: 4 blue, 16 green, 2 red; 5 red, 11 blue, 16 green; 9 green, 11 blue; 10 blue, 6 green, 4 red"))
//    println(parseGame("Game 1: 4 blue, 16 green, 2 red; 5 red, 11 blue, 16 green; 9 green, 11 blue; 10 blue, 6 green, 4 red"))
    println(checkOneSet(Set(redCubesCount = 2, greenCubesCount = 16, blueCubesCount = 4)))
}

val bag = mapOf(
    "red" to 12,
    "green" to 13,
    "blue" to 14
)

val sum = bag.values.sum()

data class Game(
    val id: Int,
    val sets: List<Set>
)

data class Set(
    val redCubesCount: Int,
    val greenCubesCount: Int,
    val blueCubesCount: Int
)

// "Game 1: 4 blue, 16 green, 2 red; 5 red, 11 blue, 16 green; 9 green, 11 blue; 10 blue, 6 green, 4 red"
// "Game 2: ..."
private fun parseInput(input: String): List<String> {
    return input.split("\n")
}

// "Game 1: 4 blue, 16 green, 2 red; 5 red, 11 blue, 16 green; 9 green, 11 blue; 10 blue, 6 green, 4 red"
private fun parseGame(line: String): Game {
    val gameId = parseGameId(line)
    val gameSets = parseSets(line)

    return Game(id = gameId, sets = gameSets)
}

// Game 15
private fun parseGameId(line: String): Int {
    val gameTitleList = line.split(":").first().split(" ")
    return gameTitleList[1].toInt()
}

// "Game 1: 4 blue, 16 green, 2 red; 5 red, 11 blue, 16 green; 9 green, 11 blue; 10 blue, 6 green, 4 red"
private fun parseSets(line: String): List<Set> {
    val lineWithoutTitle = line.split(":").last()
    val sets = lineWithoutTitle.split(";")
    var setList = mutableListOf<Set>()

    // 4 blue, 16 green, 2 red
    for (i in sets.indices) {
        val generatedSet = parseStringToSet(sets[i])
        setList.add(generatedSet)
    }

    return setList
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

// Set(redCubesCount=2, greenCubesCount=16, blueCubesCount=4)
private fun checkOneSet(set: Set): Boolean {
    return set.redCubesCount <= bag["red"]!! && set.greenCubesCount <= bag["green"]!!
            && set.blueCubesCount <= bag["blue"]!!
}
