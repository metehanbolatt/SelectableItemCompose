package com.metehanbolat.selectableitemcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.metehanbolat.selectableitemcompose.ui.theme.SelectableItemComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SelectableItemComposeTheme {
                var selected by remember { mutableStateOf(false) }
                var selected2 by remember { mutableStateOf(false) }
                
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(80.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SelectableItem(
                        selected = selected,
                        title = "Lorem Ipsum",
                        onClick = {
                            selected = !selected
                        }
                    )
                }
            }
        }
    }
}