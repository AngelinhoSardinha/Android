package com.example.my_first_android

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.my_first_android.ui.theme.My_first_androidTheme

class MainActivity_2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            My_first_androidTheme {
                Body()
            }
        }
    }
}

@Composable
fun Body() {
    var name: String by remember { mutableStateOf("") }
    var showText: Boolean by remember { mutableStateOf(false) }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Enter your name bitch") })
        Button(onClick = { showText = true }) {
            Text("Say Hi")
        }
        Spacer(Modifier.fillMaxHeight(0.1f))
        if (showText) {
            Text(
                "Hello..." + name + " You are a precioso/a mi pollito",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
        }
    }
}

@Composable
fun MyStateExample() {
    var counter by remember { mutableStateOf(0) }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { counter += 1 }) {
            Text(text = "Push")
        }
        Button(onClick = { counter = 0 }) {
            Text(text = "Restart")
        }
        Text(text = "${counter} times clicked")
        if (counter == 10) {
            Image(
                painter = painterResource(id = R.drawable.nn),
                contentDescription = "PIPIPI"
            )
            Text("HATE NIGGERS", fontWeight = FontWeight.Bold, fontSize = 50.sp)
        }
    }
}

@Composable
fun Calcular() {
    var total: String by remember { mutableStateOf("") }
    var porcentaje: String by remember { mutableStateOf("") }
    var calcula: Boolean by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        TextField(
            value = total,
            onValueChange = { total = it },
            label = { Text(text = stringResource(R.string.total)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        TextField(
            value = porcentaje,
            onValueChange = { porcentaje = it },
            label = { Text(text = stringResource(R.string.porcentaje)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Button(onClick = { calcula = true }) {
            Text("Calcular")
        }
        if (calcula) {
            Text(
                text = stringResource(R.string.texto1) + total.toDouble() * (porcentaje.toDouble() / 100),
                textAlign = TextAlign.Center
            )
            Text(
                text = stringResource(R.string.montoTotal) + (total.toDouble() * (porcentaje.toDouble() / 100) + total.toDouble()),
                textAlign = TextAlign.Center
            )
        }
        if (calcula && porcentaje == "100") {
            Image(
                painter = painterResource(id = R.drawable.baixa),
                contentDescription = "PIPIPI"
            )
            Text(text = stringResource(R.string.camarero), fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun IMC() {
    var botoncito : Boolean by remember { mutableStateOf(false) }
    var nombre : String by remember { mutableStateOf("") }
    var nacimiento : String by remember { mutableStateOf("") }
    var altura : String by remember { mutableStateOf("") }
    var peso : String by remember { mutableStateOf("") }
    var calculo : String by remember { mutableStateOf("") }
    Image(
        painter = painterResource(id = R.drawable.ddb93982c3196c10fa92396e3ac7a5b5),
        contentDescription = "PIPIPI",
        Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextField(
            value = nombre,
            onValueChange = {nombre = it},
            label = { Text(text = stringResource(R.string.dimeNombre)) }
        )
        TextField(
            value = nacimiento,
            onValueChange = {nacimiento = it},
            label = { Text(text = stringResource(R.string.nacimiento)) }
        )
        TextField(
            value = altura,
            onValueChange = {altura = it},
            label = { Text(text = stringResource(R.string.altura)) }
        )
        TextField(
            value = peso,
            onValueChange = {peso = it},
            label = { Text(text = stringResource(R.string.peso)) }
        )
        Button(onClick = {botoncito = true}) {
            Text("Calcula")
        }
        Button(onClick = {botoncito = false}) {
            Text("Reset")
        }
        if(botoncito){
            calculo = (calculo_IMC(peso.toDouble(), altura.toDouble())).toString()
            if(calculo.toDouble() <= 18.5){
                Text(text = stringResource(R.string.insuficiente), color = Color.White)
                Text(text = stringResource(R.string.imc) + calculo, color = Color.White)
                Text(nombre + " con edad " + (nacimiento.toDouble() - 2025), color = Color.White)
                Image(
                    painter = painterResource(id = R.drawable.ff),
                    contentDescription = "PIPIPI",
                    Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            else if(calculo.toDouble() > 18.5 && calculo.toDouble() <= 24.9){
                Text(text = stringResource(R.string.normal), color = Color.White)
                Text(text = stringResource(R.string.imc) + calculo, color = Color.White)
                Text(nombre + " con edad " + (nacimiento.toDouble() - 2025), color = Color.White)
            }
            else if(calculo.toDouble() > 25 && calculo.toDouble() <= 50){
                Text(text = stringResource(R.string.sobrePeso), color = Color.White)
                Text(text = stringResource(R.string.imc) + calculo, color = Color.White)
                Text(nombre + " con edad " + (nacimiento.toDouble() - 2025), color = Color.White)
            }
            else {
                Text(text = stringResource(R.string.gordo), color = Color.White)
                Text(text = stringResource(R.string.imc) + calculo, color = Color.White)
                Text(nombre + " con edad " + (nacimiento.toDouble() - 2025), color = Color.White)
                Image(
                    painter = painterResource(id = R.drawable.gg),
                    contentDescription = "PIPIPI",
                    Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }
}

fun calculo_IMC(peso : Double, altura : Double) : Double{
    var calculo = peso / altura*altura
    return calculo
}

@Composable
fun secreto() {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview2() {
    IMC()
}