package com.example.my_first_android

import android.os.Bundle
import androidx.compose.material3.TextFieldDefaults
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
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
import androidx.compose.ui.platform.LocalContext
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
import kotlin.random.Random

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
    var botoncito: Boolean by remember { mutableStateOf(false) }
    var nombre: String by remember { mutableStateOf("") }
    var nacimiento: String by remember { mutableStateOf("") }
    var altura: String by remember { mutableStateOf("") }
    var peso: String by remember { mutableStateOf("") }
    var calculo: String by remember { mutableStateOf("") }
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
            onValueChange = { nombre = it },
            label = { Text(text = stringResource(R.string.dimeNombre)) }
        )
        TextField(
            value = nacimiento,
            onValueChange = { nacimiento = it },
            label = { Text(text = stringResource(R.string.nacimiento)) }
        )
        TextField(
            value = altura,
            onValueChange = { altura = it },
            label = { Text(text = stringResource(R.string.altura)) }
        )
        TextField(
            value = peso,
            onValueChange = { peso = it },
            label = { Text(text = stringResource(R.string.peso)) }
        )
        Button(onClick = { botoncito = true }) {
            Text("Calcula")
        }
        Button(onClick = { botoncito = false }) {
            Text("Reset")
        }
        if (botoncito) {
            calculo = (calculo_IMC(peso.toDouble(), altura.toDouble())).toString()
            if (calculo.toDouble() <= 18.5) {
                Text(text = stringResource(R.string.insuficiente), color = Color.White)
                Text(text = stringResource(R.string.imc) + calculo, color = Color.White)
                Text(nombre + " con edad " + (nacimiento.toDouble() - 2025), color = Color.White)
                Image(
                    painter = painterResource(id = R.drawable.ff),
                    contentDescription = "PIPIPI",
                    Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            } else if (calculo.toDouble() > 18.5 && calculo.toDouble() <= 24.9) {
                Text(text = stringResource(R.string.normal), color = Color.White)
                Text(text = stringResource(R.string.imc) + calculo, color = Color.White)
                Text(nombre + " con edad " + (nacimiento.toDouble() - 2025), color = Color.White)
            } else if (calculo.toDouble() > 25 && calculo.toDouble() <= 50) {
                Text(text = stringResource(R.string.sobrePeso), color = Color.White)
                Text(text = stringResource(R.string.imc) + calculo, color = Color.White)
                Text(nombre + " con edad " + (nacimiento.toDouble() - 2025), color = Color.White)
            } else {
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

fun calculo_IMC(peso: Double, altura: Double): Double {
    var calculo = peso / altura * altura
    return calculo
}

@Composable
fun secreto() {
    var botoncito by remember { mutableStateOf(false) }
    var adivinacion by remember { mutableStateOf("") }
    var numeroSecreto by remember { mutableStateOf(random()) }
    var contador by remember { mutableStateOf(0) }

    Image(
        painter = painterResource(id = R.drawable.ddb93982c3196c10fa92396e3ac7a5b5),
        contentDescription = "Fondo",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = adivinacion,
            onValueChange = { adivinacion = it },
            label = { Text(text = stringResource(R.string.adivina)) }
        )
        Button(onClick = {
            botoncito = true
            contador++
        }) {
            Text("Adivina")
        }
        Button(onClick = {
            botoncito = false
            contador = 0
            numeroSecreto = random()
        }) {
            Text("Reset")
        }

        Text(text = "Intentos: $contador", color = Color.White)

        if (botoncito) {
            val numeroAdivinado = adivinacion.toIntOrNull()
            if (numeroAdivinado != null) {
                when {
                    numeroAdivinado == numeroSecreto -> {
                        Text(text = stringResource(R.string.igual), color = Color.Green)
                        Image(
                            painter = painterResource(id = R.drawable.victor),
                            contentDescription = "Victoria",
                            modifier = Modifier.size(200.dp)
                        )
                    }

                    numeroAdivinado < numeroSecreto -> {
                        Text(text = stringResource(R.string.mayor), color = Color.White)
                    }

                    else -> {
                        Text(text = stringResource(R.string.menos), color = Color.White)
                    }
                }
            } else {
                Text(text = "Introduce un número válido", color = Color.Red)
            }
        }
    }
}

fun random(): Int {
    var num = Random.nextInt(0, 100)
    return num
}

@Composable
fun conversiones() {
    var botoncito by remember { mutableStateOf(false) }
    var numero by remember { mutableStateOf("") }
    var textoSelecionado by remember { mutableStateOf("") }
    var expandir by remember { mutableStateOf(false) }
    var resultado by remember { mutableStateOf("") }
    val convertir = listOf(
        "De pulgada a cm",
        "De yarda a m",
        "De millas a Km",
        "De cm a pulgada",
        "De m a yarda",
        "De Km a milla"
    )
    Image(
        painter = painterResource(id = R.drawable.ddb93982c3196c10fa92396e3ac7a5b5),
        contentDescription = "Fondo",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
    Column(
        Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Calculadora para convertir",
            Modifier.padding(40.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            color = Color.White
        )
    }
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = numero,
            onValueChange = { numero = it },
            label = { Text(text = stringResource(R.string.convertirr)) }
        )
        OutlinedTextField(
            value = textoSelecionado,
            onValueChange = { textoSelecionado = it },
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .clickable { expandir = true }
                .fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Red,
                unfocusedIndicatorColor = Color.Gray
            )
        )
        DropdownMenu(
            expanded = expandir,
            onDismissRequest = { expandir = false },
            modifier = Modifier.fillMaxWidth()
        ) {
            convertir.forEach { convertir ->
                DropdownMenuItem(text = { Text(text = convertir) }, onClick = {
                    textoSelecionado = convertir
                    expandir = false
                })
            }
        }
        Button(onClick = {
            val valor = numero.toDoubleOrNull()
            resultado = if (valor != null) {
                when (textoSelecionado) {
                    "De pulgada a cm" -> "${pulgada_cm(valor)} cm"
                    "De yarda a m" -> "${yarda_m(valor)} m"
                    "De millas a Km" -> "${millas_km(valor)} Km"
                    "De cm a pulgada" -> "${cm_pulgada(valor)} pulgadas"
                    "De m a yarda" -> "${m_yarda(valor)} yardas"
                    "De Km a milla" -> "${km_milla(valor)} millas"
                    else -> "Selecciona una opción"
                }
            } else {
                "Número inválido"
            }
            botoncito = true
        }) {
            Text("Calcular")
        }

        if (botoncito) {
            Text(text = "Resultado: $resultado", fontSize = 20.sp, color = Color.White)
        }
    }
}

fun km_milla(valor: Double): Double {
    return valor / 1.60934
}

fun m_yarda(valor: Double): Double {
    return valor / 0.9144
}

fun cm_pulgada(valor: Double): Double {
    return valor / 2.54
}

fun millas_km(valor: Double): Double {
    return valor * 1.60934
}

fun pulgada_cm(valor: Double): Double {
    return valor * 2.54
}

fun yarda_m(valor: Double): Double {
    return valor * 0.9144
}

@Composable
fun LlimonadaApp() {
    var fase by remember { mutableStateOf(1) }
    var clicsNecessaris by remember { mutableStateOf(random()) }
    var clicsActuals by remember { mutableStateOf(0) }

    val (text, imatge) = when (fase) {
        1 -> Pair("Agafa una llimona", R.drawable.limonero)
        2 -> Pair("Esprem la llimona", R.drawable.limon)
        3 -> Pair("Beu-te-la", R.drawable.limonadas)
        else -> Pair("Comença de nou", R.drawable.baso)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text, fontSize = 24.sp, modifier = Modifier.padding(16.dp))

        Image(
            painter = painterResource(id = imatge),
            contentDescription = null,
            modifier = Modifier
                .size(250.dp)
                .clickable {
                    when (fase) {
                        1 -> fase = 2
                        2 -> {
                            clicsActuals++
                            if (clicsActuals >= clicsNecessaris) {
                                fase = 3
                                clicsActuals = 0
                            }
                        }

                        3 -> fase = 4
                        4 -> {
                            fase = 1
                            clicsNecessaris = Random.nextInt(2, 5)
                        }
                    }
                }
        )
    }
}

@Composable
fun DiceRollerApp() {
    var dice1 by remember { mutableStateOf(1) }
    var dice2 by remember { mutableStateOf(1) }
    val context = LocalContext.current
    Image(
        painter = painterResource(id = R.drawable.tapestry),
        contentDescription = "Fondo",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.title),
            contentDescription = "titulo",
            modifier = Modifier.fillMaxWidth().size(300.dp)
        )

        Button(onClick = {
            dice1 = Random.nextInt(1, 7)
            dice2 = Random.nextInt(1, 7)

            if (dice1 == 6 && dice2 == 6) {
                Toast.makeText(context, "JACKPOT!", Toast.LENGTH_SHORT).show()
            }
        }, colors = buttonColors(containerColor = Color.Red)) {
            Text("ROLL THE DICE")
        }

        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            DiceImage(dice = dice1) { dice1 = Random.nextInt(1, 7) }
            DiceImage(dice = dice2) { dice2 = Random.nextInt(1, 7) }
        }

    }
}

@Composable
fun DiceImage(dice: Int, onClick: () -> Unit) {
    val diceImage = when (dice) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    Image(
        painter = painterResource(id = diceImage),
        contentDescription = "Dado $dice",
        modifier = Modifier
            .size(100.dp)
            .clickable { onClick() }
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview2() {
    DiceRollerApp()
}