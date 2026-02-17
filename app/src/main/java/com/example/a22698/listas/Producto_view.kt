package com.example.a22698.listas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a22698.R

@Preview(showBackground = true)
@Composable
fun ProductoPreview(){

    Productovista(imagenproduct = R.drawable.gato_lanza_tomate, nombreproducto = "Gato tomatazo", calificacion = 5.0f, precio = 499, entrega = "el domingo")
}

@Composable

fun Productovista(imagenproduct: Int, nombreproducto: String, calificacion: Float, precio: Int, entrega: String){


    //var imagenproduct: Int = R.drawable.gato_lanza_tomate
    //var nombreproducto: String = "Gatito lanza tomate"
    //var calificacion: Float = 5.0f
    //var precio: Int = 500
    //var entrega: String = "12 de marzo"

    Column(modifier = Modifier
        .fillMaxWidth()) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xffffffff))){
            Row() {
                Image(modifier = Modifier
                    .size(120.dp)
                    .align(Alignment.CenterVertically),
                    painter = painterResource(imagenproduct),
                    contentDescription = "imagen de producto")
                Column(modifier = Modifier.padding(start = 8.dp)) {
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = nombreproducto,
                        fontSize = 20.sp)
                    Text(text = "⭐$calificacion estrellas",
                        fontSize = 10.sp)
                    Text(text = "$$precio",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Llega $entrega")
                    Button(onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color(0xFF000000),
                            containerColor = Color(0xFFFFC107)
                        )) {
                        Text(text = "Agregar a carrito")
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                }
            }
        }
    }
}