package com.example.artspaceapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspaceapp2.ui.theme.ArtSpaceApp2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceApp2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Artwork()
                }
            }
        }
    }
}
@Composable
fun Artwork(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.Bottom

    ) {

        ArtworkImage(
            modifier = Modifier.padding(bottom = 64.dp)
        )
        ArtworkInfo(
            modifier = Modifier.padding(bottom = 16.dp)
        )
        ButtonRow(
            modifier = Modifier.padding(bottom = 8.dp)

        )
    }
}

@Composable
fun ArtworkImage(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier,
        shadowElevation = 15.dp,
        color = Color.White,
//            border = BorderStroke(6.dp, Color.LightGray)
    ) {
        Image(
            modifier = Modifier
                .padding(20.dp),
            painter = painterResource(
                id = R.drawable.placeholder
            ),
            contentDescription = null
        )
    }
}

@Composable
fun ArtworkInfo(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.LightGray)
    ) {
        Text(
            fontSize = 25.sp ,
            text = "Still Life of Blue Rose and Other Flowers"
        )
        Text(
            text = "Owen Scott (2021)"
        )
    }
}

@Composable
fun ButtonRow(
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        Button(onClick = { /*TODO*/ }) {

        }
        Button(onClick = { /*TODO*/ }) {

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceApp2Theme {

    }
}