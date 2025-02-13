package com.dvsi.demoallcomponentscompose.component.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FilledTonalButtonExample(onClick: () -> Unit) {
    FilledTonalButton(
        onClick = { onClick() },
//        contentPadding = PaddingValues(8.dp),
        colors = ButtonColors(
            containerColor = Color.Red,
            contentColor = Color.Black,
            disabledContainerColor = Color.Gray,
            disabledContentColor = Color.LightGray
        ),
        enabled = true
    ) {
        Text("Tonal")
    }
}