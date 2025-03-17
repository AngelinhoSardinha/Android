package com.example.my_first_android.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import com.example.my_first_android.ui.theme.My_first_androidTheme

@Composable
fun Screen1(navigateToScreen2: () -> Unit) {
    Button(
        onClick = navigateToScreen2,
        Modifier.fillMaxWidth()
    ) {
        Text("Next Screen")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    My_first_androidTheme {
        Screen1({})
    }
}