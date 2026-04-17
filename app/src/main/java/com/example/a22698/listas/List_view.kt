package com.example.a22698.listas

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a22698.R

@Preview(showBackground = true)
@Composable

fun Listvista(){
    val productVM = ProductviewModel()
    var estado by remember { mutableStateOf(value = 0) }

    fun cambioColor(): Color{
        return if (estado == 0) Color.Black else Color.White
    }
    Column(modifier = Modifier
        .fillMaxSize()) {
        LazyColumn(modifier = Modifier
            .background(color = cambioColor())
            .padding(20.dp)) {
            item{
                Text(text = "olaolaolaola")
            }
            items(items = productVM.traerobjetos("chachalaco")){ producto ->
                Productovista(producto, selected = {
                    Log.d("evento","probando el evento del producto")
                    estado = 1
                })
            }
            item {
                Text(text = "adioadioadioadio")
            }
        }
    }
}