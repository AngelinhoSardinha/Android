package com.example.my_first_android.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.my_first_android.DiceRollerApp
import com.example.my_first_android.Ejercicio_clase
import com.example.my_first_android.screens.Screen1
import com.example.my_first_android.ui.theme.My_first_androidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            My_first_androidTheme {
                //Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                DiceRollerApp()
                //}
            }
        }
    }
}
/*
@Composable
fun MyNavegation() {
    val navController = rememberNavController()
    NavHost(navController, Pantalla1) {
        composable<Pantalla1> {
            Screen1{ navController.navigate(Pantalla2)}
        }
        composable<Pantalla2> {
            Screen2{ userName -> navController.navigate(Pantalla3(userName = userName))}
        }
        composable<Pantalla3> { backStackEntry ->
            val pantalla3 = backStackEntry.toRoute<Pantalla3>()
            Screen3(pantalla3.userName) { navController.navigate(Pantalla1){
                popUpTo<Pantalla1>{ inclusive= true } } }
        }
    }
}*/