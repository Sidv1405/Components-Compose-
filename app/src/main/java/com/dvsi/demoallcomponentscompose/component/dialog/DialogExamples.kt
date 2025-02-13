package com.dvsi.demoallcomponentscompose.component.dialog

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun DialogExamples() {
    // ...
    val openAlertDialog = remember { mutableStateOf(false) }

    // ...
    when {
        // ...
        openAlertDialog.value -> {
            AlertDialogExample(
                onDismissRequest = { openAlertDialog.value = false },
                onConfirmation = {
                    openAlertDialog.value = false
                    println("Confirmation registered") // Add logic here to handle confirmation.
                },
                dialogTitle = "Alert dialog example",
                dialogText = "This is an example of an alert dialog with buttons.",
                icon = Icons.Default.Info
            )
        }
    }
}