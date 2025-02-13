package com.dvsi.demoallcomponentscompose.component.button

import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ElevatedButtonExample(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Elevated")
    }
}