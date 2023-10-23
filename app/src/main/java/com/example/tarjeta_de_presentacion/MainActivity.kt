package com.example.tarjeta_de_presentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Logo(

        )
        Data(

        )
    }
    
}




@Preview(showBackground = true)
@Composable
fun CardPreview() {
    Tarjeta_de_presentacionTheme {

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            CardPresentation()
        }
    }
}

@Composable
fun Logo(modifier: Modifier = Modifier) {
    val logo = painterResource(R.drawable.logo)

        Box(
            /*modifier = Modifier.padding(
                bottom = 200.dp
            )*/
        ) {
            Column(
                modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = logo,
                    contentDescription = null,
                    modifier = Modifier.size(150.dp)
                )
                Text(
                    text = "Jeremy Zamalloa Armas"
                )
                Text(
                    text = "Desarollo Software"
                )
            }
        }
    

}

@Composable
fun Data(modifier: Modifier = Modifier){
    val phone = painterResource(R.drawable.phone)
    val share = painterResource(R.drawable.share)
    val email = painterResource(R.drawable.email)

    Box(


    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Row {
                Image(
                    painter = phone,
                    contentDescription = null
                )
                Text(text = "Telefono")
            }
            Row {
                Image(
                    painter = share,
                    contentDescription = null
                )
                Text(text = "redes sociales")
            }
            Row {
                Image(
                    painter = email,
                    contentDescription = null
                )
                Text(text = "email")
            }
        }
    }

}