package com.dvsi.demoallcomponentscompose.component.button

import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

@Composable
fun TextButtonExample(onClick: () -> Unit) {
    TextButton(
        onClick = { onClick() }
    ) {
        Text("Text Button")
    }
}