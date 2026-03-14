package com.example.a22698.navegacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

//@Preview(showBackground = true)
@Composable

fun Pdfview(generarReporte : ReportModel){
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Nombre de la seccion : ${generarReporte.seccion}")
        Text(text = "Número de la seccion : ${generarReporte.numero}")
        Text(text = "Nombre del encargado : ${generarReporte.encargado}")
    }
}

@Preview(showBackground = true)
@Composable
fun pdfpreview (){
    val reporte = ReportModel("osi",3, "Zuri")
    Pdfview(reporte)
}