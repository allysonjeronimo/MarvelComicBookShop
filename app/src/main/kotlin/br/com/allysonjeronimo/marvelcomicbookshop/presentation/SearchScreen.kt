package br.com.allysonjeronimo.marvelcomicbookshop.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.allysonjeronimo.marvelcomicbookshop.R
import br.com.allysonjeronimo.marvelcomicbookshop.model.ComicBook

@Composable
fun SearchScreen(
    comicBooks: List<ComicBook> = listOf(
        ComicBook(id = "1", title = "V for Vendetta"),
        ComicBook(id = "2", title = "Justice"),
        ComicBook(id = "3", title = "Amazing Fantasy"),
    ),
) {
    Column() {
        comicBooks.forEach { comicBook ->
            ComicBookCard(
                title = comicBook.title,
            )
        }
    }
}

@Composable
fun ComicBookCard(title: String, price: Float = 0f) {
    Card() {
        Row() {
            Box() {
                Icon(
                    painter = painterResource(id = R.drawable.ic_image),
                    contentDescription = null,
                )
            }
            Column() {
                Text(title)
                Text(price.toString())
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SearchScreenPreview() {
    SearchScreen()
}
