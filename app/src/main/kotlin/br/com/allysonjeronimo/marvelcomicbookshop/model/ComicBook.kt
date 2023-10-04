package br.com.allysonjeronimo.marvelcomicbookshop.model

data class ComicBook(
    val id: String,
    val title: String,
    val description: String = "",
    val isFavorite: Boolean = false,
    val isFeatured: Boolean = false,
    val price: Float = 0f,
    val urlImage: String = ""
)
