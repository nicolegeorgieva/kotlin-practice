package lambdafunction

fun main() {
    val people = listOf("Nicole", "Iliyan", "Morgana")
    val result = greetPeople(people) { name ->
        "Hello, $name!"
    }

    println(result)
}

fun greetPeople(names: List<String>, action: (String) -> String): List<String> {
    val result = mutableListOf<String>()

    for (name in names) {
        result.add(action(name))
    }

    return result
}