package com.example.a22698.actividad3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import java.util.Calendar

@Composable
fun Casaview(navController: NavHostController) {
    var añoTexto by remember { mutableStateOf("") }
    val añoActual = remember { Calendar.getInstance().get(Calendar.YEAR) }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    val añoNac = añoTexto.trim().toIntOrNull() ?: return@FloatingActionButton
                    if (añoNac < 1900 || añoNac > añoActual) return@FloatingActionButton
                    val edad = añoActual - añoNac
                    navController.navigate(EdadResultado(edad))
                }
            ) {
                Icon(
                    imageVector = Icons.Default.Calculate,
                    contentDescription = "Calcular edad e ir al resultado"
                )
            }
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Año de nacimiento",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Introduce tu año de nacimiento y pulsa el botón flotante para calcular tu edad.",
                style = MaterialTheme.typography.bodyMedium
            )
            OutlinedTextField(
                value = añoTexto,
                onValueChange = { añoTexto = it.filter { ch -> ch.isDigit() }.take(4) },
                label = { Text("Año (ej. 2005)") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
