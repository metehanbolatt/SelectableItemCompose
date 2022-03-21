package com.metehanbolat.selectableitemcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.selectableitemcompose.ui.theme.SelectableItemComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SelectableItemComposeTheme {

            }
        }
    }
}