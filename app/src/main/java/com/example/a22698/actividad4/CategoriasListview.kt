package com.example.a22698.actividad4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable

fun CategoriasListview(){
    val productoGL = MercadoviewModel()

    Row(modifier = Modifier.fillMaxSize()) {
        LazyRow(modifier = Modifier.background(color = Color.White)
            .padding(10.dp)){
            items(items = productoGL.traercategorias()){ categoria ->
                Categoriaact(categoria)
            }
        }
    }
}