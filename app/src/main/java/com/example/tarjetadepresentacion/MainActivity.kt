package com.example.tarjetadepresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetadepresentacion.ui.theme.TarjetaDePresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ShowCard()
                }
            }
        }
    }
}

@Composable
fun ShowCard(
    modifier: Modifier = Modifier
) {

    val image = painterResource(id = R.drawable.android_logo)

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            Modifier.size(100.dp)
        )
        Text(
            text = stringResource(R.string.nombre_inge),
            fontWeight = FontWeight.Bold,
            fontSize = 38.sp
        )
        Text(
            text = stringResource(R.string.ingeniero_en_tc),
            fontSize = 12.sp
        )
    }
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(top = 9.dp, bottom = 9.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.llamada_telefonica),
                contentDescription = null,
                Modifier
                    .size(24.dp)
            )
            Text(
                text = stringResource(R.string.num_telefonico),
                modifier = Modifier
                    .padding(start = 16.dp),
                fontSize = 16.sp
            )
        }
        Row(
            modifier = Modifier
                .padding(top = 9.dp, bottom = 9.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.compartir),
                contentDescription = null,
                Modifier
                    .size(24.dp)
            )
            Text(
                text = stringResource(R.string.redes),
                modifier = Modifier
                    .padding(start = 16.dp),
                fontSize = 16.sp
            )
        }
        Row(
            modifier = Modifier
                .padding(top = 9.dp, bottom = 9.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.correo),
                contentDescription = null,
                Modifier
                    .size(24.dp)
            )
            Text(
                text = stringResource(R.string.correo_inge),
                modifier = Modifier
                    .padding(start = 16.dp),
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaDePresentacionTheme {
        ShowCard()
    }
}