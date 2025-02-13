package com.dvsi.demoallcomponentscompose.component.date_picker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DatePicker
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.text.SimpleDateFormat
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerModal() {
    val showDatePicker = remember { mutableStateOf(false) }
    val selectedDate = remember { mutableStateOf<Long?>(null) }

    val datePickerState = rememberDatePickerState()

    // Content for MainActivity
    Column(modifier = Modifier.padding(16.dp)) {
        Button(onClick = { showDatePicker.value = true }) {
            Text("Open Date Picker")
        }

        selectedDate.value?.let {
            val formattedDate = SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault()).format(Date(it))
            Text(text = "Selected Date: $formattedDate")
        }

        if (showDatePicker.value) {
            DatePickerDialog(
                onDismissRequest = { showDatePicker.value = false },
                confirmButton = {
                    TextButton(onClick = {
                        // Use datePickerState.selectedDateMillis instead of 'it'
                        selectedDate.value = datePickerState.selectedDateMillis
                        showDatePicker.value = false
                    }) {
                        Text("OK")
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showDatePicker.value = false }) {
                        Text("Cancel")
                    }
                }
            ) {
                DatePicker(state = datePickerState)
            }
        }
    }
}
