package com.dvsi.demoallcomponentscompose.component.chip

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InputChipExample() {
    var enabled by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        if (enabled) {
            InputChip(
                onClick = { enabled = false }, // Khi bấm vào Chip, nó sẽ bị ẩn
                label = { Text("Hello, Chip!") },
                selected = enabled,
                avatar = {
                    Icon(
                        Icons.Filled.Person,
                        contentDescription = "Avatar icon",
                        Modifier.size(InputChipDefaults.AvatarSize)
                    )
                },
                trailingIcon = {
                    Icon(
                        Icons.Default.Close,
                        contentDescription = "Close icon",
                        Modifier.size(InputChipDefaults.AvatarSize)
                    )
                },
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { enabled = true }) {
            Text("Show Chip")
        }
    }
}
