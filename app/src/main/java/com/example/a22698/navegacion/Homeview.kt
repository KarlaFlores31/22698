package com.example.a22698.navegacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

//@Preview(showBackground = true)
@Composable
fun Homeview(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()){
        Text(text = "Bienvenido")
        Button(onClick = {
            navController.navigate(Reporte)
        }) {
            Text(text = "Comenzar")
        }
    }
}