package br.com.allysonjeronimo.marvelcomicbookshop.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
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
import br.com.allysonjeronimo.marvelcomicbookshop.model.ComicBook
import coil.compose.AsyncImage

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    comicBook: ComicBook = ComicBook(id = "1", title = "V for Vendetta", price = 100f, isFavorite = true),
) {
    Scaffold(
        topBar = {
            AppBar(title = comicBook.title, isFavorite = comicBook.isFavorite)
        },
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            ImageGallery()
            Content()
        }
    }
}

@Composable
private fun Content() {
    Column(modifier = Modifier.padding(12.dp)) {
        Text(
            "R$ 9,99",
            fontSize = 42.sp,
        )
        Separator()
        Spacer(modifier = Modifier.height(12.dp))
        Text("Descrição", fontSize = 22.sp, fontWeight = FontWeight.SemiBold)
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            "Bla bla bla bla bla bla bla bla bla Bla bla bla bla bla bla bla bla bla Bla bla bla bla bla bla bla bla bla Bla bla bla bla bla bla bla bla bla Bla bla bla bla bla bla bla bla bla Bla bla bla bla bla bla bla bla bla Bla bla bla bla bla bla bla bla bla",
            fontSize = 18.sp,
            color = Color.Gray,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis,
        )
        Spacer(modifier = Modifier.height(12.dp))
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text("Ver descrição completa")
        }
        Spacer(modifier = Modifier.height(12.dp))
        Separator()
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
            ),
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_shopping_cart),
                contentDescription = null,
                modifier = Modifier.padding(end = 12.dp),
            )
            Text("Comprar", fontSize = 24.sp)
        }
    }
}

@Composable
private fun Separator() {
    Box(
        modifier =
        Modifier
            .height(1.dp)
            .fillMaxWidth()
            .background(Color.LightGray),
    ) {}
}

@Composable
private fun ImageGallery() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        IconButton(onClick = { }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_left),
                contentDescription = null,
            )
        }
        Box(
            modifier = Modifier
                .background(Color.DarkGray)
                .fillMaxWidth()
                .height(180.dp)
                .weight(1f),
            contentAlignment = Alignment.Center,
        ) {

        }
        IconButton(onClick = { }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_right),
                contentDescription = null,
            )
        }
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun AppBar(title: String, isFavorite: Boolean) {
    val favoriteIcon = if (isFavorite) {
        painterResource(id = R.drawable.ic_favorite)
    } else {
        painterResource(id = R.drawable.ic_favorite_border)
    }

    TopAppBar(
        title = {
            Text(title)
        },
        actions = {
            IconButton(onClick = { }) {
                Icon(
                    painter = favoriteIcon,
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
}
