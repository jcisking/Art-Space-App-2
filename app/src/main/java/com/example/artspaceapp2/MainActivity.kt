package com.example.artspaceapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Column(modifier = modifier) {
        Box() {
            Image(
                painter = painterResource(id = R.drawable.placeholder
                ),
                contentDescription = null
            )
        }
        Box() {
            Column {
                Text(text = "sdfsf")
                Text(text = "dfsf")
            }
        }
        Row {
            Button(onClick = { /*TODO*/ }) {
                
            }
            Button(onClick = { /*TODO*/ }) {
                
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceApp2Theme {

    }
}