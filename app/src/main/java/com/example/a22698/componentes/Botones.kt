package com.example.a22698.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.a22698.R

@Preview(showBackground = true)
@Composable

fun Botones() {
    var activo by remember {
        mutableStateOf(false)
    }
    var texto by remember {
        mutableStateOf("Bye")//
    }
    var imagen by remember {
        mutableStateOf(R.drawable.gato_lanza_tomate)//
    }
    fun cambiartexto (){
        if (activo) {
            texto = "Bye"
        } else {
            texto = "Hola"
        }
        activo = !activo
    }
    fun cambiarimagen(){
        if (activo) {
            imagen = R.drawable.gato_lanza_tomate
        } else {
            imagen = R.drawable.gato_recibe_tomate
        }
        activo = !activo
    }
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = texto)
        Button(onClick = {
            cambiartexto()
        }, colors = ButtonDefaults.buttonColors(
            contentColor = Color(0xFF000000),
            containerColor = Color(0xFF8BC34A)
        )) {
            Text(text = "Click me")
        }

        Image(painterResource(imagen),
            contentDescription = "gato lanzador de tomate")
        Button(onClick = {
            cambiarimagen()
        }, colors = ButtonDefaults.buttonColors(
            contentColor = Color(0xFFFFFFFF),
            containerColor = Color(0xFF9C27B0)
        )) {
            Text(text = "Click me")
        }
    }
}