package com.example.my_first_android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController

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
}