    package com.example.prova1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prova1.ui.theme.Prova1Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight

    class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Prova1Theme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    /*JetpackText(
                        text1 = stringResource(R.string.text1),
                        text2 = stringResource(R.string.text2),
                        text3 = stringResource(R.string.text3)
                    )*/
                    /*GreetingImage(
                        message = stringResource(R.string.happy_birthday_pohl),
                        from = stringResource(R.string.signature_text),
                    )*/
                    /*TaskManager(
                        textManager1 = stringResource(R.string.text_manager1),
                        textManager2 = stringResource(R.string.text_manager2)
                    )*/
                    Quadrant(
                        textTopLeft1 = stringResource(R.string.text_top_left1),
                        textTopLeft2 = stringResource(R.string.text_top_left2),
                        textTopRight1 = stringResource(R.string.text_top_right1),
                        textTopRight2 = stringResource(R.string.text_top_right2),
                        textBottomLeft1 = stringResource(R.string.text_bottom_left1),
                        textBottomLeft2 = stringResource(R.string.text_bottom_left2),
                        textBottomRight1 = stringResource(R.string.text_bottom_right1),
                        textBottomRight2 = stringResource(R.string.text_bottom_right2),
                        topLeftBG = Color(0xFFEADDFF),
                        topRightBG = Color(0xFFD0BCFF),
                        bottomLeftBG = Color(0xFFB69DF8),
                        bottomRightBG = Color(0xFFF6EDFF)
                    )

                }
            }
        }
    }
}

@Composable
fun Quadrant(textTopLeft1: String, textTopLeft2: String, topLeftBG: Color,
             textTopRight1: String, textTopRight2: String, topRightBG: Color,
             textBottomLeft1: String, textBottomLeft2: String, bottomLeftBG: Color,
             textBottomRight1: String, textBottomRight2: String, bottomRightBG: Color){
    Column(Modifier.fillMaxWidth()){
        Row(Modifier.weight(1f)){
            QuadrantCard(textTopLeft1, textTopLeft2, topLeftBG, modifier = Modifier.weight(1f))
            QuadrantCard(textTopRight1, textTopRight2, topRightBG, modifier = Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)){
            QuadrantCard(textBottomLeft1, textBottomLeft2, bottomLeftBG, modifier = Modifier.weight(1f))
            QuadrantCard(textBottomRight1, textBottomRight2, bottomRightBG, modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun QuadrantCard(text1: String, text2: String, background: Color, modifier: Modifier = Modifier){
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = text1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = text2,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun TaskManager(textManager1: String, textManager2: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.ic_task_completed)
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ){
        Image(
            painter = image,
            contentDescription = null,
        )
        Text(
            text = textManager1,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = textManager2,
            fontSize = 16.sp
        )
    }
}

@Composable
fun JetpackText(text1: String, text2: String, text3: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
        )
        Text(
            text = text1,
            fontSize = 24.sp,
            modifier = modifier
                .padding(16.dp)
        )
        Text(
            text = text2,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp )
        )
        Text(
            text = text3,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(16.dp)
        )
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ){
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Prova1Theme {
        GreetingImage(message = "Happy birthday Sam", from = "From Emma")
    }
}