package com.example.a22698.repaso2doparcial

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

/**
 * Pantalla de **formulario**: tres campos de texto y un envío que navega a [RepasoResultadoScreen].
 *
 * ### Estado en Compose
 * - Cada `mutableStateOf` guarda un valor que, al cambiar, **dispara recomposición** (vuelve a dibujarse lo necesario).
 * - `remember { ... }` hace que el estado **no se reinicie** en cada recomposición (solo la primera vez).
 * - `by` + imports `getValue`/`setValue` permiten escribir `titulo = "x"` en lugar de `titulo.value = "x"`.
 *
 * ### TextField "controlado"
 * El texto mostrado (`value`) sale siempre del estado; `onValueChange` actualiza ese estado. Así la UI y los datos no se desincronizan.
 */
@Composable
fun RepasoCapturaScreen(navController: NavHostController) {
    var titulo by remember { mutableStateOf("") }
    // Se escribe como texto; al enviar se valida y se convierte a Int (no se usa `toInt()` directo para evitar crash).
    var codigoTexto by remember { mutableStateOf("") }
    var responsable by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Formulario")

        // Vuelve a la pantalla anterior sin enviar datos (saca esta pantalla de la pila).
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Volver")
        }

        TextField(
            value = titulo,
            onValueChange = { titulo = it },
            label = { Text(text = "Título") },
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = codigoTexto,
            onValueChange = { codigoTexto = it },
            label = { Text(text = "Código (número)") },
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = responsable,
            onValueChange = { responsable = it },
            label = { Text(text = "Responsable") },
            modifier = Modifier.fillMaxWidth(),
        )

        Button(
            onClick = {
                // `toIntOrNull()`: si el usuario escribió letras, devuelve null en lugar de lanzar excepción.
                // `?: return@Button`: si es null, salimos solo del lambda del onClick (no de toda la función).
                val codigo = codigoTexto.trim().toIntOrNull() ?: return@Button
                // `isBlank()`: true si está vacío o solo espacios.
                if (titulo.isBlank() || responsable.isBlank()) return@Button

                // `navigate` con un objeto [RepasoResultado]: la pantalla destino lo recibe con `toRoute()`.
                navController.navigate(
                    RepasoResultado(
                        titulo = titulo.trim(),
                        codigo = codigo,
                        responsable = responsable.trim(),
                    ),
                )
            },
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(text = "Enviar datos")
        }
    }
}
