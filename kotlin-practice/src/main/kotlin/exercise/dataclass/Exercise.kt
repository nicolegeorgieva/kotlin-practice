package exercise.dataclass

fun main() {
    val movies = listOf(
        Movie(title = "Flower", releaseYear = 2020, director = "Amy Flower", rating = 9.5),
        Movie(title = "Parrot", releaseYear = 2003, director = "Lulu Green", rating = 5.5),
        Movie(title = "Dog", releaseYear = 2005, director = "Amy Flower", rating = 9.0)
    )

    println(sortMoviesByYear(movies, 2005))
}

data class Movie(
    val title: String,
    val releaseYear: Int,
    val director: String,
    val rating: Double
)

// movies with a rating above or equal to X rating
fun filterMoviesByRating(movies: List<Movie>, rating: Double): List<Movie> {
    return movies.filter { it.rating >= rating }
}

// movies released after or equal to Y year
fun sortMoviesByYear(movies: List<Movie>, year: Int): List<Movie> {
    return movies.filter { it.releaseYear >= year }.sortedBy { it.releaseYear }
}