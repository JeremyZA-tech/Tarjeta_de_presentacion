package com.example.tarjeta_de_presentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.tarjeta_de_presentacion.ui.theme.Tarjeta_de_presentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tarjeta_de_presentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardPresentation()
                }
            }
        }
    }
}

@Composable
fun CardPresentation(modifier: Modifier = Modifier) {
    Column(
       // modifier = modifier.fillMaxSize()
    ) {
        Logo(modifier = Modifier.weight(1f))
        Data(modifier = modifier
            .fillMaxWidth()
            .weight(1f)
            .padding(bottom = 20.dp))
    }
}



@Preview(showBackground = true)
@Composable
fun CardPreview() {
    Tarjeta_de_presentacionTheme {
        CardPresentation()
    }
}

@Composable
fun Logo(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.logo)
    Column(
        modifier = modifier
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
        )
        Text(
            text = "Jeremy Zamalloa Armas",
            textAlign = TextAlign.Center,
            modifier = modifier.padding(5.dp)
        )
        Text(
            text = "Desarrollador de Software",
            modifier = modifier.padding(5.dp)
        )
    }
}

@Composable
fun Data(modifier: Modifier = Modifier){
    val phone = painterResource(R.drawable.phone)
    val email = painterResource(R.drawable.email)
    val share = painterResource(R.drawable.share)

    Column(
       modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = phone,
                contentDescription = null,
            )
            Text(
                text = "Telefono",
                modifier = modifier.padding(5.dp)

            )
        }
        Row {
            Image(
                painter = share,
                contentDescription = null,
            )
            Text(
                text = "Redes sociales",
                modifier = modifier.padding(5.dp)
            )
        }
        Row {
            Image(
                painter = email,
                contentDescription = null,
            )
            Text(
                text = "Email",
                modifier = modifier.padding(5.dp)
            )
        }
    }
}