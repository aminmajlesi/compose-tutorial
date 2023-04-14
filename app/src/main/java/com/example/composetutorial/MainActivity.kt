package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ComposeTutorialTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("Android")
//                }
//            }

            Box(modifier = Modifier
                .fillMaxSize(0.5f)
                .padding(16.dp)){
                val painter = painterResource(id = R.drawable.image)
                val title = "this is card image"
                val desc = "this is description"

                ImageCard(painter = painter, contentDesc = desc,
                    title = title)
            }



        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun ImageCard(
    painter : Painter,
    contentDesc : String,
    title : String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(12.dp),
        elevation = 5.dp
    ){
        Box(modifier = Modifier.height(200.dp)){
            Image(
                painter = painter,
                contentDescription = contentDesc,
                contentScale = ContentScale.Crop
            )
            //Box(modifier = Modifier.)

            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(title, style = TextStyle(color = Color.White,
                fontSize = 16.sp))
            }


            
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
//    ComposeTutorialTheme {
//        Greeting("Android")
//    }

    val painter = painterResource(id = R.drawable.image)
    val title = "this is card image"
    val desc = "this is description"

    ImageCard(painter = painter, contentDesc = desc,
        title = title)

//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Gray),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.SpaceAround
//
//    ) {
//        Text(text = "Hello")
//        Text(text = "Amin")
//    }


}