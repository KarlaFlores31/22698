package com.example.a22698.repaso2doparcial

import com.example.a22698.R

/**
 * **Fuente de datos en memoria** para la pantalla de listas del repaso.
 *
 * El nombre "ViewModel" aquí es solo organizativo: **no** hereda de `androidx.lifecycle.ViewModel`
 * ni se obtiene con `viewModels()` en una Activity. Sirve para agrupar la función que construye la lista.
 *
 * Así el repaso no depende del paquete `listas` y puedes leer solo esta carpeta para estudiar el flujo.
 */
class RepasoListaProductoViewModel {

    /**
     * Devuelve una lista fija de [RepasoProducto] usando drawables del módulo `res`.
     *
     * - `mutableListOf` crea una lista mutable; se podría usar `buildList { }` o `listOf(...)` de forma inmutable.
     * - Cada `R.drawable.*` es un recurso compilado en [R]; debe existir en `res/drawable` (o variantes).
     */
    fun traerobjetos(): List<RepasoProducto> {
        val productList = mutableListOf<RepasoProducto>()
        productList.add(RepasoProducto(R.drawable.fern_echi, "Fern molesta", 1f, 49999, "el domingo"))
        productList.add(RepasoProducto(R.drawable.chiikawa_explosion, "Chiikawa explosion", 5.0f, 1, "nunca"))
        productList.add(RepasoProducto(R.drawable.gato_lanza_tomate, "Gato tomatazo", 5.0f, 499, "el lunes"))
        productList.add(RepasoProducto(R.drawable.gato_recibe_tomate, "Gato tomatazo cara", 5.0f, 499, "el martes"))
        productList.add(RepasoProducto(R.drawable.ups, "Gato ups", 3.5f, 360, "el miercoles"))
        productList.add(RepasoProducto(R.drawable.gato_lanza_piedra, "Gato piedrazo", 5.0f, 499, "el jueves"))
        return productList
    }
}
