package com.dvsi.demoallcomponentscompose.component.button

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun OutlinedButtonExample(onClick: () -> Unit) {
    OutlinedButton(onClick = { onClick() }) {
        Text("Outlined")
    }
}