package com.example.a22698.repaso2doparcial

/**
 * **Modelo de datos** de un producto para el módulo de repaso (solo Kotlin: no es entidad de Room ni de red).
 *
 * `data class` genera automáticamente `equals`, `hashCode`, `toString` y `copy`, útil para listas e igualdad.
 *
 * Los nombres de propiedad coinciden con el estilo del proyecto en `listas` (`imagenproduct`, etc.) para que el mismo
 * tipo de UI ([RepasoProductovista]) sea fácil de seguir en clase.
 *
 * @property imagenproduct Identificador del drawable, p. ej. `R.drawable.gato_lanza_tomate` (es un `Int`, no la imagen en bytes).
 * @property nombreproducto Texto visible como título del producto.
 * @property calificacion Nota numérica (se muestra como estrellas en la UI).
 * @property precio Precio entero en la moneda que definas (aquí solo se concatena en un string).
 * @property entrega Texto libre (ej. día de entrega).
 */
data class RepasoProducto(
    val imagenproduct: Int,
    val nombreproducto: String,
    val calificacion: Float,
    val precio: Int,
    val entrega: String,
)
