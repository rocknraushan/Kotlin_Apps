package com.android.happybirthday

import android.content.res.Resources.Theme
import android.graphics.drawable.PaintDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android.happybirthday.ui.theme.HappyBirthdayTheme

class Article : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme{
                Surface (

                        ) {

                }
            }
        }

    }
}


@Composable
fun ImageViews(title:String, phrage1:String,phrage2:String, modifier: Modifier = Modifier){
    val  Imgval = painterResource(id = R.drawable.bg_compose_background)
    Box {
    Image(painter = Imgval, contentDescription = null)


        textView(Title = title, phrage1 = phrage1, phrage2 = phrage2)

    }


}

@Composable
fun textView(Title:String, phrage1:String,phrage2:String, modifier: Modifier = Modifier){

    Column(
        modifier = modifier,
        
        
    ) {
    Text(text = Title
        , fontSize = 24.sp,
        modifier = modifier
            .padding(16.dp)
    )
        Text(text = phrage1,
        modifier = modifier
            .padding(16.dp),
            textAlign = TextAlign.Start
        )

        Text(text = phrage2,
            modifier = modifier
                .padding(16.dp),
        textAlign = TextAlign.Start)
        
    }


}




@Preview(showBackground = true)
@Composable
fun ArticleView(){
  MaterialTheme{

      ImageViews(title = stringResource(id = R.string.title),
          phrage1 = stringResource(id = R.string.phrage1) ,
          phrage2 = stringResource(id = R.string.phrage2)
      )

  }
}