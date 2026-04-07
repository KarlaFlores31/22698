package com.example.a22698.corrutinas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun PreviewWinnerView(){
    WinnerView(StudentsViewModel())
}

@Composable

fun WinnerView(studentsVM : StudentsViewModel){

    var nombre by remember { mutableStateOf(value = "") }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Sorteo alumnos")
        TextField(value = nombre , onValueChange = {
            nombre = it
        })

        Button(onClick = {
            studentsVM.getWinner()
        }) {
            Text(text = "Comenzar")
        }
        if (studentsVM.isLoading) {
            CircularProgressIndicator()
            Text("Cargando por favor espere...")
        }else {
            Text(text = "El ganador es...${studentsVM.winner}")
        }
    }
}