package com.example.a22698.actividad3

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Serializable
object EdadInicio

@Serializable
data class EdadResultado(val edad: Int)

@Preview(showBackground = true)
@Composable
fun EdadNavManager(innerPadding: PaddingValues = PaddingValues(all = 16.dp)) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = EdadInicio,
        modifier = Modifier.padding(innerPadding)
    ) {
        composable<EdadInicio> {
            Casaview(navController)
        }
        composable<EdadResultado> {
            val ruta: EdadResultado = it.toRoute()
            EdadResultadoview(edad = ruta.edad)
        }
    }
}
