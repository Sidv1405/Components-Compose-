package com.dvsi.demoallcomponentscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dvsi.demoallcomponentscompose.component.chip.AssistChipExample
import com.dvsi.demoallcomponentscompose.component.chip.FilterChipExample
import com.dvsi.demoallcomponentscompose.component.chip.InputChipExample
import com.dvsi.demoallcomponentscompose.component.chip.SuggestionChipExample
import com.dvsi.demoallcomponentscompose.ui.theme.DemoAllComponentsComposeTheme

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
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        AssistChipExample()
                        FilterChipExample()
                        InputChipExample()
                        SuggestionChipExample()
                    }
                    /*               Date Picker*/
//                    DatePickerDocked()
//                    DatePickerModalInput()
//                    DatePickerModal()
//                    DateRangePickerModal()
                }

                /*               Date Picker*/
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
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

