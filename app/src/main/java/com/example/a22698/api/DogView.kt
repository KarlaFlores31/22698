package com.example.a22698.api

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DogView(dogviewmodel : DogViewModel){


    Column(Modifier.fillMaxSize()) {
        Text("El perrito de hoy es:")
        Button(onClick = {
            dogviewmodel.traerUrlImagen()
        }) {
            Text("Mostrar imagen")
        }
        Text(dogviewmodel.url)
    }
}


@Preview(showBackground = true)
@Composable
fun ViewDoqview(){
    val dogviewModel = DogViewModel()
    DogView(dogviewModel)
}