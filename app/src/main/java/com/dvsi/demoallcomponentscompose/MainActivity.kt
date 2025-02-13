package com.dvsi.demoallcomponentscompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.DateRangePicker
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dvsi.demoallcomponentscompose.component.app_bar.bottom_app_bar.BottomAppBarExample
import com.dvsi.demoallcomponentscompose.component.bottom_sheet.BottomSheetExample
import com.dvsi.demoallcomponentscompose.component.bottom_sheet.PartialBottomSheetExample
import com.dvsi.demoallcomponentscompose.component.button.ElevatedButtonExample
import com.dvsi.demoallcomponentscompose.component.button.FilledButtonExample
import com.dvsi.demoallcomponentscompose.component.button.FilledTonalButtonExample
import com.dvsi.demoallcomponentscompose.component.button.OutlinedButtonExample
import com.dvsi.demoallcomponentscompose.component.button.TextButtonExample
import com.dvsi.demoallcomponentscompose.component.card.CardMinimalExample
import com.dvsi.demoallcomponentscompose.component.card.ElevatedCardExample
import com.dvsi.demoallcomponentscompose.component.card.FilledCardExample
import com.dvsi.demoallcomponentscompose.component.card.OutlinedCardExample
import com.dvsi.demoallcomponentscompose.component.checkbox.CheckboxMinimalExample
import com.dvsi.demoallcomponentscompose.component.checkbox.CheckboxParentExample
import com.dvsi.demoallcomponentscompose.component.date_picker.DatePickerDocked
import com.dvsi.demoallcomponentscompose.component.date_picker.DatePickerModal
import com.dvsi.demoallcomponentscompose.component.date_picker.DatePickerModalInput
import com.dvsi.demoallcomponentscompose.component.dialog.AlertDialogExample
import com.dvsi.demoallcomponentscompose.component.dialog.DialogExamples
import com.dvsi.demoallcomponentscompose.component.radio_button.RadioButtonSingleSelection
import com.dvsi.demoallcomponentscompose.ui.theme.DemoAllComponentsComposeTheme
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoAllComponentsComposeTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .windowInsetsPadding(WindowInsets.statusBars)
                ) {
                    /*                Top App Bar */
//                SmallTopAppBarExample()
//                CenterAlignedTopAppBarExample()
//                MediumTopAppBarExample()
//                LargeTopAppBarExample()

                    /*               Bottom App Bar*/
//                    BottomAppBarExample()

                    /*               Badges*/
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
//                    BadgeBasicExample()
//                    BadgeInteractiveExample()
                    }

                    /*               Bottom Sheet*/
//                BottomSheetExample()
//                    PartialBottomSheetExample()

                    /*               Button*/
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
//                        FilledButtonExample(onClick = {
//                            Toast.makeText(this@MainActivity, "FilledButtonExample", Toast.LENGTH_SHORT).show()
//                        })

//                        FilledTonalButtonExample(onClick = {
//                            Toast.makeText(this@MainActivity, "FilledTonalButtonExample", Toast.LENGTH_SHORT).show()
//                        })

//                        OutlinedButtonExample(onClick = {
//                            Toast.makeText(this@MainActivity, "OutlinedButtonExample", Toast.LENGTH_SHORT).show()
//                        })

//                        ElevatedButtonExample(onClick = {
//                            Toast.makeText(this@MainActivity, "ElevatedButtonExample", Toast.LENGTH_SHORT).show()
//                        })

//                        TextButtonExample(onClick = {
//                            Toast.makeText(this@MainActivity, "TextButtonExample", Toast.LENGTH_SHORT).show()
//                        })
                    }

                    /*               Card*/
//                    CardMinimalExample()
//                    FilledCardExample()
//                    ElevatedCardExample()
//                    OutlinedCardExample()

                    /*               Checkbox*/
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
//                        CheckboxMinimalExample()
//                        CheckboxParentExample()
                    }

                    /*               Chip*/

                    /*               Date Picker*/
                    DatePickerDocked()
//                    DatePickerModalInput()
//                    DatePickerModal()
//                    DateRangePicker()
                    }

                    /*               Date Picker*/
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
//                        DialogExamples()

                    }

                    /*               Radio Button*/
//                    RadioButtonSingleSelection()

                }
            }
        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DemoAllComponentsComposeTheme {

    }
}

