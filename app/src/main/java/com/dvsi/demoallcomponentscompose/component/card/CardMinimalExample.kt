package com.dvsi.demoallcomponentscompose.component.card

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CardMinimalExample() {
    Card() {
        Text(text = "Hello, world!")
    }
}