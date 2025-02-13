package com.dvsi.demoallcomponentscompose.component.chip

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun FilterChipExample() {
    var selected = remember { mutableStateOf(false) }

    FilterChip(
        onClick = { selected.value = !selected.value },
        label = {
            Text("Filter chip")
        },
        selected = selected.value,
        leadingIcon = if (selected.value) {
            {
                Icon(
                    imageVector = Icons.Filled.Done,
                    contentDescription = "Done icon",
                    modifier = Modifier.size(FilterChipDefaults.IconSize)
                )
            }
        } else {
            null
        },
    )
}
