package algorithms.new

import java.io.File

fun main() {
    val input = File("cubes.txt").readText()
    val gameList = parseInput(input)

    //[Game 1: 4 blue, 16 green, 2 red,  5 red, 11 blue, 16 green,  9 green, 11 blue,  10 blue, 6 green, 4 red]

    println(parseGameId("Game 15: 4 blue, 16 green, 2 red,  5 red, 11 blue, 16 green,  9 green, 11 blue,  10 blue, 6 green, 4 red"))
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

// "Game 1: 4 blue, 16 green, 2 red; 5 red, 11 blue, 16 green; 9 green, 11 blue; 10 blue, 6 green, 4 red",
// "Game 2: ..."
private fun parseInput(input: String): List<String> {
    return input.split("\n")
}

// "Game 1: 4 blue, 16 green, 2 red; 5 red, 11 blue, 16 green; 9 green, 11 blue; 10 blue, 6 green, 4 red",
private fun parseGame(line: String): Game {
    TODO()
}

// Game 15
private fun parseGameId(line: String): Int {
    val gameTitleList = line.split(":").first().split(" ")
    return gameTitleList[1].toInt()
}

private fun parseSets(line: String): List<Set> {
    TODO()
}

