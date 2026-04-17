package com.example.a22698.repaso2doparcial

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Pantalla de **solo lectura**: muestra los valores que ya viajaron en el objeto [RepasoResultado].
 *
 * No lee variables globales ni el estado de los [androidx.compose.material3.TextField] de la pantalla anterior:
 * los datos llegan **solo** por el parámetro [datos], que Navigation rellenó al hacer `toRoute()` en [RepasoNavManager].
 *
 * En los `Text`, las expresiones entre `$` y llaves insertan propiedades de Kotlin dentro del string (plantillas de string).
 */
@Composable
fun RepasoResultadoScreen(datos: RepasoResultado) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Título: ${datos.titulo}")
        Text(text = "Código: ${datos.codigo}")
        Text(text = "Responsable: ${datos.responsable}")
    }
}
