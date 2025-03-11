package com.example.my_first_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.my_first_android.ui.theme.My_first_androidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            My_first_androidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Ejercicio_cubos(
                        name = "Angel",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
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
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    My_first_androidTheme {
        Ejercicio_cubos("Angel")
    }
}