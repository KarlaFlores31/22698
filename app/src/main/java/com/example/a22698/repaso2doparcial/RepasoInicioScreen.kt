package com.example.a22698.repaso2doparcial

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

/**
 * Pantalla de **inicio** del repaso: no recibe argumentos de navegación; solo ofrece dos caminos.
 *
 * [NavHostController] es la misma instancia que creó [RepasoNavManager]; así todas las pantallas
 * comparten el mismo historial (pila) de navegación.
 */
@Composable
fun RepasoInicioScreen(navController: NavHostController) {
    /* `Column`: contenedor vertical (hijos uno debajo de otro).
     `fillMaxSize()`: ocupatodo el espacio que le da el padre (típicamente toda la pantalla).
     `padding(16.dp)`: separa el contenido de los bordes (dp = densidad independiente de píxeles).*/
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Repaso 2º parcial")

        // `navigate(RepasoCaptura)`: apila la pantalla de captura. No borra esta; el usuario puede volver con Atrás.
        Button(onClick = { navController.navigate(RepasoCaptura) }) {
            Text(text = "Ir al formulario")
        }

        // Otra ruta independiente: va a la pantalla de listas ([RepasoListas]).
        Button(onClick = { navController.navigate(RepasoListas) }) {
            Text(text = "Repaso de listas")
        }
    }
}
