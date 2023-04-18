package exercise.dataclass

fun main() {
    val movies = listOf(
        Movie(title = "Flower", releaseYear = 2005, director = "Amy Flower", rating = 9.5),
        Movie(title = "Parrot", releaseYear = 2003, director = "Lulu Green", rating = 5.5),
        Movie(title = "Dog", releaseYear = 2020, director = "Amy Flower", rating = 9.0)
    )

    println(filterMoviesByRating(movies, 8.0))
}

data class Movie(
    val title: String,
    val releaseYear: Int,
    val director: String,
    val rating: Double
)

// movies with a rating above X rating
fun filterMoviesByRating(movies: List<Movie>, rating: Double): List<Movie> {
    return movies.filter { it.rating >= rating }
}