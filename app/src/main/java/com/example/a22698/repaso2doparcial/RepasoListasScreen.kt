package com.example.a22698.repaso2doparcial

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

/**
 * Pantalla de **lista con scroll**: usa [LazyColumn] para componer solo las filas visibles (y unas pocas extra),
 * en lugar de crear miles de vistas de golpe.
 *
 * Todo el contenido de datos viene del paquete de repaso:
 * - [RepasoListaProductoViewModel]: devuelve la lista en memoria.
 * - [RepasoProductovista]: dibuja **una** fila (un producto).
 */
@Composable
fun RepasoListasScreen(navController: NavHostController) {
    // Instancia que encapsula los datos de ejemplo (en un examen podría venir de Room, API, etc.).
    val productVM = RepasoListaProductoViewModel()

    // `Column` envuelve la lista para poder usar `Modifier.weight` en el hijo (ver abajo).
    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier
                // `weight(1f)` solo existe dentro de `ColumnScope`: el `LazyColumn` se estira y ocupa el alto disponible.
                .weight(1f)
                .fillMaxWidth()
                // Color en formato ARGB hexadecimal (FF = opaco).
                .background(Color(0xFFF5F5F5))
                .padding(20.dp),
        ) {
            // `item { }`: una celda suelta (no viene de una lista). Aquí: título / cabecera.
            item {
                Text(text = "Repaso de listas (LazyColumn)")
            }

            // `items(lista) { elemento -> ... }`: una celda por cada elemento de la colección.
            items(items = productVM.traerobjetos()) { producto ->
                // `producto` es un [RepasoProducto]. El segundo argumento es un callback vacío: podrías loguear o navegar al pulsar "Agregar a carrito".
                RepasoProductovista(producto) { }
            }

            // Otra celda suelta al final: botón para volver atrás en la pila de navegación.
            item {
                Button(onClick = { navController.popBackStack() }) {
                    Text(text = "Volver")
                }
            }
        }
    }
}
