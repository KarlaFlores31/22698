package com.example.a22698.actividad4

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun MercadoNav(innerPadding: PaddingValues = PaddingValues()) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "categorias",
        modifier = Modifier.padding(innerPadding)
    ) {
        composable("categorias") {
            CategoriasListview(navController = navController)
        }
        composable(
            route = "productos/{clave}",
            arguments = listOf(
                navArgument("clave") { type = NavType.StringType }
            )
        ) { entrada ->
            val clave = entrada.arguments?.getString("clave") ?: ""
            ProductosListview(
                claveCategoria = clave,
                navController = navController
            )
        }
    }
}
