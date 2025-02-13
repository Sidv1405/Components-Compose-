package com.dvsi.demoallcomponentscompose.component.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.trace

@Composable
fun FilledButtonExample(onClick: () -> Unit) {
    Button(
        onClick = { onClick() },
        contentPadding = PaddingValues(25.dp),
        colors = ButtonColors(
            containerColor = Color.Red,
            contentColor = Color.Black,
            disabledContainerColor = Color.Gray,
            disabledContentColor = Color.LightGray
        ),
        enabled = false
    ) {
        Text("Filled")
    }
}