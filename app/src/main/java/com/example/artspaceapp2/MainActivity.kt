package com.example.artspaceapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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

                    ArtSpaceApp()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceApp() {

    Artwork()
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
            modifier = Modifier
                .padding(bottom = 72.dp)
        )
        ArtworkInfo(
            modifier = Modifier
                .padding(bottom = 32.dp)
        )
//        Spacer(modifier = Modifier.height(62.dp))
        ButtonRow(
            modifier = Modifier
                .padding(bottom = 12.dp)
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
    ) {
        Image(
            modifier = Modifier
                .padding(32.dp),
            painter = painterResource(
                id = R.drawable.darren_and_lovee
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
            .padding(24.dp)
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
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        Button(
            onClick = { /*TODO*/ },
            contentPadding = PaddingValues(horizontal = 40.dp)
        ) {
            Text(text = "Previous")
        }
        Button(
            onClick = { /*TODO*/ },
            contentPadding = PaddingValues(horizontal = 40.dp)
        ) {
            Text(text = "Next")
        }
    }
}

data class Artwork(
    @DrawableRes val imageRes: Int,
    @StringRes val description: Int,
    @StringRes val artist: Int,
) {
    var artworkList: MutableList<Artwork> = mutableListOf(
        Artwork(
            imageRes = R.drawable.darren_and_lovee,
            description = R.string.darren_and_lovee_chillin,
            artist = R.string.bobby_kel
        ),
        Artwork(
            imageRes = R.drawable.darren_on_knee,
            description = R.string.curiosity,
            artist = R.string.some_dude
        ),
        Artwork(
            imageRes = R.drawable.darren_looking_at_camera,
            description = R.string.stare_down,
            artist = R.string.some_dude
        ),
        Artwork(
            imageRes = R.drawable.darren_looking_down,
            description = R.string.what_is_that,
            artist = R.string.some_other_guy
        )
    )

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceApp2Theme {

    }
}