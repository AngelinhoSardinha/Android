package com.example.my_first_android

import android.os.Bundle
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
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

@Composable
fun Ejercicio_1(modifier: Modifier) {
    Column(modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bbb),
            contentDescription = "PIPIPI"
        )
    }
    Column(
        modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp)
    ) {
        Spacer(modifier.height(130.dp))
        Text(
            "Jetpack Compose tutorial \n", fontSize = 25.sp
        )
        Text(
            "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI\n" +
                    "development on Android with less code, powerful tools, and intuitive Kotlin APIs. \n",
            textAlign = TextAlign.Justify
        )
        Text(
            "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say\n" +
                    "what elements you want and the Compose compiler does the rest. Compose is built around Composable\n" +
                    "functions. These functions let you define your app\\'s UI programmatically because they let you describe how it\n" +
                    "should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as\n" +
                    "initializing an element and then attaching it to a parent. To create a Composable function, you add the\n" +
                    "@Composable annotation to the function name. \n",
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun Ejercicio_clase(modifier: Modifier) {
    Column(modifier.fillMaxSize()) {
        Row(
            modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Column(
                modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFEADDFF))
                    .padding(horizontal = 12.dp), verticalArrangement = Arrangement.Center
            ) {
                Text(
                    "Text composable",
                    textAlign = TextAlign.Center,
                    modifier = modifier.fillMaxWidth(),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Displays text and follows the recommended Material Design guidelines.",
                    textAlign = TextAlign.Justify, modifier = modifier
                        .fillMaxWidth()
                )
            }
            Column(
                modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFD0BCFF)),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    "Image composable",
                    textAlign = TextAlign.Center,
                    modifier = modifier.fillMaxWidth(),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Creates a composable that lays out and draws a given Painter class object.",
                    textAlign = TextAlign.Justify, modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 5.dp)
                )
            }
        }
        Row(
            modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Column(
                modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFB69DF8)),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    "Row composable",
                    textAlign = TextAlign.Center,
                    modifier = modifier.fillMaxWidth(),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "A layout composable that places its children in a horizontal sequence.",
                    textAlign = TextAlign.Justify, modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 5.dp)
                )
            }
            Column(
                modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFF6EDFF)),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    "Column composable",
                    textAlign = TextAlign.Center,
                    modifier = modifier.fillMaxWidth(),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "A layout composable that places its children in a vertical sequence.",
                    textAlign = TextAlign.Justify, modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 5.dp)
                )
            }
        }
    }
}

@Composable
fun Ejercicio_cubos(name: String, modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxGreen, boxCyan, boxMagenta) = createRefs()
        Box(modifier = Modifier.size(120.dp).background(Color.Red).constrainAs(boxRed) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })
        Box(modifier = Modifier.size(120.dp).background(Color.Yellow).constrainAs(boxYellow){
            bottom.linkTo(boxRed.top)
            end.linkTo(boxRed.start)
        })
        Box(modifier = Modifier.size(120.dp).background(Color.Green).constrainAs(boxGreen){
            bottom.linkTo(boxRed.top)
            start.linkTo(boxRed.end)
        })
        Box(modifier = Modifier.size(120.dp).background(Color.Cyan).constrainAs(boxCyan){
            top.linkTo(boxRed.bottom)
            end.linkTo(boxRed.start)
        })
        Box(modifier = Modifier.size(120.dp).background(Color.Magenta).constrainAs(boxMagenta){
            top.linkTo(boxRed.bottom)
            start.linkTo(boxRed.end)
        })
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxGreen, boxCyan, boxMagenta) = createRefs()
        Box(modifier = Modifier.size(120.dp).background(Color.Red).constrainAs(boxRed) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })
        Box(modifier = Modifier.size(120.dp).background(Color.Yellow).constrainAs(boxYellow){
            start.linkTo(boxRed.start)
            bottom.linkTo(boxRed.top)
        })
        Box(modifier = Modifier.size(120.dp).background(Color.Green).constrainAs(boxGreen){
            start.linkTo(boxRed.start)
            top.linkTo(boxRed.bottom)
        })
        Box(modifier = Modifier.size(120.dp).background(Color.Cyan).constrainAs(boxCyan){
            end.linkTo(boxRed.start)
            top.linkTo(boxRed.top)
        })
        Box(modifier = Modifier.size(120.dp).background(Color.Magenta).constrainAs(boxMagenta){
            start.linkTo(boxRed.end)
            top.linkTo(boxRed.top)
        })
    }
    Image(
        painter = painterResource(id = R.drawable.hh),
        contentDescription = "PIPIPI",
        alpha = 0.5f
    )
}


/*fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier.padding(10.dp)
    )
    Text(
        "Byeeeeee $name!",
        modifier = modifier.padding(40.dp).alpha(5.5.toFloat())
    )
    Column(modifier.fillMaxSize().padding(70.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Text line 1", Modifier.background(Color.Cyan).weight(1f).fillMaxSize())
        Text("Text line 2", Modifier.background(Color.Yellow).weight(1f).fillMaxSize())
        Text("Text line 3", Modifier.background(Color.Green).weight(1f).fillMaxSize())
        Text("Text line 4", Modifier.background(Color.Magenta).weight(1f).fillMaxSize())
        Text("Text line 5", Modifier.background(Color.Gray).weight(1f).fillMaxSize())
    }
}*/

/*Spacer para poner espacios entre elementos*/

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    My_first_androidTheme {
        Ejercicio_clase(modifier = Modifier)
    }
}