package com.example.numberconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.numberconverter.ui.theme.NumberConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NumberConverterTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    AppNavigation(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    var currentScreen by remember { mutableStateOf("MENU") }

    val baseOptions = listOf(
        "Decimal → Binário", "Decimal → Hexadecimal", "Decimal → Octal",
        "Binário → Decimal", "Hexadecimal → Decimal", "Octal → Decimal"
    )
    val unitOptions = listOf(
        "Kg → Gramas", "Gramas → Kg",
        "Km → Metros", "Metros → Km"
    )

    when (currentScreen) {
        "MENU" -> {
            MenuView(
                onOptionSelected = { selection ->
                    currentScreen = selection
                }
            )
        }
        "BASES" -> {
            ConverterView(
                categoryTitle = "Bases Numéricas",
                options = baseOptions,
                onBack = { currentScreen = "MENU" },
                modifier = modifier
            )
        }
        "UNITS" -> {
            ConverterView(
                categoryTitle = "Unidades Físicas",
                options = unitOptions,
                onBack = { currentScreen = "MENU" },
                modifier = modifier
            )
        }
    }
}