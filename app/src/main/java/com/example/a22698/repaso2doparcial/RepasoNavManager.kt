package com.example.a22698.repaso2doparcial

// --- Jetpack Compose: layout y previews ---
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
// --- Navigation Compose: grafo de pantallas ---
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
// --- Kotlin Serialization: necesario para rutas tipadas en Navigation ---
import kotlinx.serialization.Serializable

/**
 * ## Rutas de navegación tipadas
 *
 * Navigation puede guardar en la pila de pantallas (back stack) no solo un nombre, sino
 * un objeto serializado. Por eso estas clases llevan [Serializable].
 *
 * | Tipo en Kotlin | Uso en navegación |
 * |----------------|-------------------|
 * | `object`       | Pantalla sin argumentos: solo significa "ir a Inicio", "ir a Captura", etc. |
 * | `data class`   | Pantalla con datos: al hacer `navigate(RepasoResultado(...))` viajan los campos. |
 */

/** Ruta de la pantalla menú: primera que ve el usuario (startDestination). */
@Serializable
object RepasoInicio

/** Ruta del formulario donde el usuario escribe título, código y responsable. */
@Serializable
object RepasoCaptura

/**
 * Ruta de la pantalla de resumen.
 * Es un `data class` porque al navegar hay que pasar titulo, codigo y responsable.
 */
@Serializable
data class RepasoResultado(
    val titulo: String,
    val codigo: Int,
    val responsable: String,
)

/** Ruta de la pantalla que muestra la lista de productos con scroll ([LazyColumn]). */
@Serializable
object RepasoListas

/**
 * Construye el **NavHost**: une cada tipo de ruta con el `@Composable` que debe mostrarse.
 *
 * Flujo típico: Inicio → Captura → Resultado, o Inicio → Listas → (Volver).
 *
 * @param innerPadding margen interno útil si este `NavHost` va dentro del `content` de un `Scaffold`
 *        (así el contenido no queda debajo de barras del sistema).
 */
@Composable
fun RepasoNavManager(innerPadding: PaddingValues = PaddingValues(16.dp)) {
    // `NavHostController`: objeto que recuerda la pantalla actual y la pila de pantallas anteriores.
    // `rememberNavController()`: si no lo memorizamos, en cada recomposición se crearía uno nuevo y se perdería el estado de navegación.
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = RepasoInicio, // Pantalla inicial al montar este grafo
        modifier = Modifier.padding(innerPadding),
    ) {
        // `composable<Ruta> { }`: cuando la ruta activa es `RepasoInicio`, se dibuja este bloque.
        composable<RepasoInicio> {
            // Se pasa el mismo `navController` para que los botones puedan llamar `navigate(...)`.
            RepasoInicioScreen(navController = navController)
        }
        composable<RepasoCaptura> {
            RepasoCapturaScreen(navController = navController)
        }
        composable<RepasoResultado> {
            // Quien navegó hizo: `navigate(RepasoResultado(titulo, codigo, responsable))`.
            // `it` es el `NavBackStackEntry`; `toRoute()` reconstruye el `RepasoResultado` tipado (sin usar strings a mano).
            val datos: RepasoResultado = it.toRoute()
            RepasoResultadoScreen(datos = datos)
        }
        composable<RepasoListas> {
            RepasoListasScreen(navController = navController)
        }
    }
}

/** Preview de todo el flujo; visible en el panel Design / Split de Android Studio. */
@Preview(showBackground = true)
@Composable
private fun RepasoNavManagerPreview() {
    RepasoNavManager()
}
