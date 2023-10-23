package com.example.tarjeta_de_presentacion

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    CardPresentation(context = this)
                }
            }
        }
    }
}

@Composable
fun CardPresentation(context: Context, modifier: Modifier = Modifier) {
    val fondo = painterResource(R.drawable.fondo2)
    Box(modifier) {
        Image(
            painter = fondo,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Logo(

            )
            Data(
                context = applicationContext
            )
        }
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
            CardPresentation(context = this)
        }
    }
}

@Composable
fun Logo(modifier: Modifier = Modifier) {
    val logo = painterResource(R.drawable.logo)
    val borderWidth = 4.dp
    val rainbowColorsBrush = remember {
        Brush.sweepGradient(
            listOf(
                Color(0xFF9575CD),
                Color(0xFFBA68C8),
                Color(0xFFE57373),
                Color(0xFFFFB74D),
                Color(0xFFFFF176),
                Color(0xFFAED581),
                Color(0xFF4DD0E1),
                Color(0xFF9575CD)
            )
        )
    }

    Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(
                        top = 50.dp,
                        bottom = 150.dp
                    ),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = logo,
                    contentDescription = null,
                    modifier = Modifier
                        .size(150.dp)
                        .border(
                            BorderStroke(borderWidth, rainbowColorsBrush),
                            CircleShape
                        )
                        .padding(borderWidth)
                        .clip(CircleShape)
                )
                Text(
                    text = "Jeremy Zamalloa Armas",
                    modifier = Modifier
                        .padding(15.dp),
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Cursive

                )
                Text(
                    text = "Técnico Soporte Informático"
                )
            }
}

@Composable
fun Data(context: Context, modifier: Modifier = Modifier){
    val phone = painterResource(R.drawable.phone)
    val share = painterResource(R.drawable.share)
    val email = painterResource(R.drawable.email)
    val phoneText = "+34 633143863"
    Column(
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .clickable {
                        // Abrir la aplicación de teléfono para llamar al número de teléfono
                        val intent = Intent(Intent.ACTION_DIAL)
                        intent.data = Uri.parse("tel:$phoneText")
                        context.startActivity(intent)
                    }
            ) {
                Image(
                    painter = phone,
                    contentDescription = null
                )
                Text(
                    text = phoneText,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(
                            start = 5.dp
                        )
                )
            }
            Row {
                Image(
                    painter = share,
                    contentDescription = null
                )
                Text(
                    text = "redes sociales",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(
                            start = 5.dp
                        )
                    )
            }
            Row {
                Image(
                    painter = email,
                    contentDescription = null
                )
                Text(
                    text = "jeremyzamalloaarmas@gmail.com",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(
                            start = 5.dp
                        )
                    )
            }
        }
}