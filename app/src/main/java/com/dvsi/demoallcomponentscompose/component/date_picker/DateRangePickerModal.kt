package com.dvsi.demoallcomponentscompose.component.date_picker

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.rememberDateRangePickerState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DateRangePickerModal() {
    var showDialog by remember { mutableStateOf(false) }
    var selectedDateRange by remember { mutableStateOf<Pair<Long?, Long?>?>(null) }
    val dateFormat = SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault())

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Button(onClick = { showDialog = true }) {
            Text(text = "Select Date Range")
        }

        selectedDateRange?.let { (start, end) ->
            val formattedStart = start?.let { formatDate(it) } ?: "N/A"
            val formattedEnd = end?.let { formatDate(it) } ?: "N/A"

            Text(
                text = "Selected Range: $formattedStart - $formattedEnd",
                modifier = Modifier.padding(top = 16.dp)
            )
        }

        if (showDialog) {
            val dateRangePickerState = rememberDateRangePickerState()

            DatePickerDialog(
                onDismissRequest = { showDialog = false },
                confirmButton = {
                    TextButton(
                        onClick = {
                            selectedDateRange = Pair(
                                dateRangePickerState.selectedStartDateMillis,
                                dateRangePickerState.selectedEndDateMillis
                            )
                            showDialog = false
                        }
                    ) {
                        Text("OK")
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showDialog = false }) {
                        Text("Cancel")
                    }
                }
            ) {
                DateRangePicker(
                    state = dateRangePickerState,
                    title = { Text(text = "Select date range") },
                    showModeToggle = false,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(500.dp)
                        .padding(16.dp)
                )
            }
        }
    }
}

fun formatDate(timestamp: Long): String {
    val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    return sdf.format(Date(timestamp))
}
