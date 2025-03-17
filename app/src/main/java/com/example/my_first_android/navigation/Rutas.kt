package com.example.my_first_android.navigation
import kotlinx.serialization.Serializable

@Serializable
object Pantalla1

@Serializable
data class Pantalla2(val userName: String)

@Serializable
data class Pantalla3(val userName: String, val edad: Int, val saludo : String)