package br.com.allysonjeronimo.marvelcomicbookshop.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.allysonjeronimo.marvelcomicbookshop.R
import br.com.allysonjeronimo.marvelcomicbookshop.extensions.currencyFormat
import br.com.allysonjeronimo.marvelcomicbookshop.model.ComicBook

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    comicBooks: List<ComicBook> = listOf(
        ComicBook(id = "1", title = "V for Vendetta", price = 100f),
        ComicBook(id = "2", title = "Justice", price = 99.9f),
        ComicBook(id = "3", title = "Amazing Fantasy"),
    ),
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Comic Books")
                },
                actions = {
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_search),
                            contentDescription = null,
                            tint = Color.White,
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_shopping_cart),
                            contentDescription = null,
                            tint = Color.White,
                        )
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Red,
                    titleContentColor = Color.White,
                ),
            )
        },
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            comicBooks.forEach { comicBook ->
                ComicBookCard(
                    title = comicBook.title,
                    price = comicBook.price,
                )
            }
        }
    }
}

@Composable
fun ComicBookCard(title: String, price: Float = 0f) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
    ) {
        Row {
            ImageBox()
            CardContent(title = title, price = price)
        }
    }
}

@Composable
fun CardContent(title: String, price: Float) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(
            title,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
        )
        Text(
            price.currencyFormat(),
            fontSize = 18.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
fun ImageBox() {
    Box(
        modifier = Modifier
            .size(62.dp)
            .background(Color.Gray),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_image),
            contentDescription = null,
            tint = Color.White,
        )
    }
}

@Composable
@Preview(showBackground = true, widthDp = 280)
fun SearchScreenPreview() {
    SearchScreen()
}
