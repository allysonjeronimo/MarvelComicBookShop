package br.com.allysonjeronimo.marvelcomicbookshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.com.allysonjeronimo.marvelcomicbookshop.presentation.SearchScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SearchScreen()
        }
    }
}
