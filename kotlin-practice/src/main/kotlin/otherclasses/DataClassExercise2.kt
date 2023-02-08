package otherclasses

import kotlin.random.Random

fun main() {
    val articles = mutableListOf<BlogArticleInfo>()
    articles.add(getArticle())
    articles.add(getArticle())

    val newArticles = arrayListOf<BlogArticleInfo>()

    for (article in articles) {
        newArticles.add(article)
        val newArticle = article.copy(title = article.title + " for my blog")
        newArticles.add(newArticle)
    }

    newArticles.forEach { println(it) }
}

fun getArticle(): BlogArticleInfo {
    val randomTitle = "Title " + Random.nextInt(100)
    val numberOfReaders = Random.nextInt(1000)
    return BlogArticleInfo(randomTitle, "Some content", numberOfReaders)
}

data class BlogArticleInfo(val title: String, val content: String, val numOfReaders: Int)