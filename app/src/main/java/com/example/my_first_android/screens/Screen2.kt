package com.example.my_first_android.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Screen2(userName: String, navigateToScreen3: (String) -> Unit) {
    Button(onClick = { navigateToScreen3(userName) } ) {
        Text("Next Screen")
    }
}