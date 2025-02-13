package com.dvsi.demoallcomponentscompose.component.date_picker

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DisplayMode
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.text.SimpleDateFormat
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerModalInput() {
    // Các state quản lý trạng thái chọn ngày và hiển thị Date Picker
    val showDatePicker = remember { mutableStateOf(false) }
    val selectedDate = remember { mutableStateOf<Long?>(null) }

    Column(modifier = Modifier.padding(16.dp)) {
        // Button mở dialog chọn ngày
        Button(onClick = { showDatePicker.value = true }) {
            Text("Open Date Picker")
        }

        // Hiển thị ngày đã chọn nếu có
        selectedDate.value?.let {
            val dateFormat = SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault())
            val formattedDate = dateFormat.format(Date(it))
            Text(text = "Selected Date: $formattedDate")
        }

        // Hiển thị Date Picker khi showDatePicker là true
        if (showDatePicker.value) {
            val datePickerState = rememberDatePickerState(initialDisplayMode = DisplayMode.Input)

            DatePickerDialog(
                onDismissRequest = { showDatePicker.value = false },
                confirmButton = {
                    TextButton(onClick = {
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
