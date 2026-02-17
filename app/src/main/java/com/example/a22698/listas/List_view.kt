package com.example.a22698.listas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a22698.R

@Preview(showBackground = true)
@Composable

fun Listvista(){
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState(0))) {
        Productovista(imagenproduct = R.drawable.fern_echi, nombreproducto = "Fern molesta", calificacion = 1f, precio = 49999 ,entrega = "el domingo")
        Productovista(imagenproduct = R.drawable.ups, nombreproducto = "Chiikawa explosion", calificacion = 5.0f, precio = 1, entrega = "nunca")
        Productovista(imagenproduct = R.drawable.gato_lanza_tomate, nombreproducto = "Gato tomatazo", calificacion = 5.0f, precio = 499, entrega = "el lunes")
        Productovista(imagenproduct = R.drawable.gato_recibe_tomate, nombreproducto = "Gato tomatazo cara", calificacion = 5.0f, precio = 499, entrega = "el martes")
        Productovista(imagenproduct = R.drawable.ups, nombreproducto = "Gato ups", calificacion = 3.5f, precio = 360, entrega = "el miercoles")
        Productovista(imagenproduct = R.drawable.gato_lanza_piedra, nombreproducto = "Gato piedrazo", calificacion = 5.0f, precio = 499, entrega = "el jueves")
        Productovista(imagenproduct = R.drawable.gato_lanza_tomate, nombreproducto = "Gato tomatazo", calificacion = 2.5f, precio = 60000, entrega = "el viernes")
        Productovista(imagenproduct = R.drawable.gato_recibe_tomate, nombreproducto = "Gato tomatazo cara", calificacion = 5.0f, precio = 499, entrega = "el sabado")
        Productovista(imagenproduct = R.drawable.gato_lanza_tomate, nombreproducto = "Gato tomatazo", calificacion = 5.0f, precio = 499, entrega = "el 16 de marzo")
        Productovista(imagenproduct = R.drawable.gato_recibe_tomate, nombreproducto = "Gato tomatazo cara", calificacion = 5.0f, precio = 499, entrega = "el 31 de diciembre")
    }
}