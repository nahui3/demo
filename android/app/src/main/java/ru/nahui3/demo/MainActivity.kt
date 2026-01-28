package ru.nahui3.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.nahui3.android.ui.FieldWithText
import ru.nahui3.demo.ui.theme.DemoTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    DemoTheme {
        DemoScreen()
    }
}

@Composable
private fun DemoScreen() {
    Column() {
        Text(text = "Демо библиотеки nahui3/android")

        FieldWithText(
            label = "Ваш текст"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DemoScreenPreview() {
    App()
}