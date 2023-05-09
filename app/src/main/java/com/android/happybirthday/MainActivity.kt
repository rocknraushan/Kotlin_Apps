package com.android.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(251)
                ) {
                   GreetingImg(message = "Jai  Shree Ram", from = "Raushan")
                }
            }
        }
    }
}


@Composable
fun GreetingImg(message: String,from: String,modifier: Modifier= Modifier){
        val image = painterResource(id = R.drawable.androidparty)


    Box {
        Image(painter = image, contentDescription = "backGround Image",
                contentScale = ContentScale.Crop,
                alpha = 0.6f)

        GreetingText(message = message, from = from, modifier = Modifier
            .padding(8.dp)
            .fillMaxSize())
    }
}


@Composable
fun GreetingText(message : String,modifier : Modifier = Modifier,from : String){

Column (modifier = modifier,
        verticalArrangement = Arrangement.Center){


    Text(
        text = message,
        color = Color(248, 11, 11, 166),
        fontSize = 100.sp,
        lineHeight = 100.sp,
        textAlign = TextAlign.Center
    )

    Text(text = "Rock",
        fontSize = 50.sp,
        modifier = Modifier
            .padding(9.dp)
            .align(alignment = Alignment.CenterHorizontally))

    Text(
        text = from,
        color = MaterialTheme.colorScheme.onPrimaryContainer,
        fontSize = 100.sp,
        lineHeight = 100.sp,
        fontFamily = FontFamily.Cursive,
        modifier = Modifier
            .padding(8.dp)
            .align(alignment = Alignment.CenterHorizontally))


}

}



@Preview(
    showBackground = false

)

@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {


        GreetingImg(message = "Jai Shree Ram", from = "Raushan")

    }
}