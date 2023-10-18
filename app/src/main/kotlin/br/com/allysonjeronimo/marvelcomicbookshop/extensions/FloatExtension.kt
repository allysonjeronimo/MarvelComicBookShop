package br.com.allysonjeronimo.marvelcomicbookshop.extensions

import java.text.NumberFormat

fun Float.currencyFormat(): String {
    val formatter = NumberFormat.getCurrencyInstance()
    return formatter.format(this)
}
