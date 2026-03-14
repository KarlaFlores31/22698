package com.example.a22698.navegacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

//@Preview(showBackground = true)
@Composable
fun Reportview(navController: NavHostController) {
    var seccion by remember() { mutableStateOf(value = "") }
    var numero by remember() { mutableStateOf(value = "") }
    var encargado by remember() { mutableStateOf(value = "") }

    Column(modifier = Modifier.fillMaxSize()){
        Text(text = "Adios")
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Finalizar")
        }
        TextField(value = seccion, onValueChange = {seccion = it}, label = {Text("Nombre de la sección")})
        TextField(value = numero, onValueChange = {numero = it}, label = {Text("Número de la sección")})
        TextField(value = encargado, onValueChange = {encargado = it}, label = {Text("Nombre del encargado")})
        Button(onClick = {
            navController.navigate(ReportModel(seccion,numero.trim().toInt(),encargado))
        }) {
            Text(text = "Enviar datos")
        }
    }
}