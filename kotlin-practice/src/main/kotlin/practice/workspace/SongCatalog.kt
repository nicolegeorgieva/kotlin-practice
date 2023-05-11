package practice.workspace

fun main() {
    val song = SongCatalog("Sky", "Amy", 2005, 1001)

    println(song.isPopular)
    song.songDescription()
}

class SongCatalog(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular = playCount >= 1000

    fun songDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}