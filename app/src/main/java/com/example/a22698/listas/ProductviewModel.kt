package com.example.a22698.listas

import com.example.a22698.R

class ProductviewModel {
    fun traerobjetos(categoria: String): List<Product_model>{
        var productList = mutableListOf<Product_model>()
        return when (categoria){
            "chachalaco" -> listOf(
                Product_model(imagenproduct = R.drawable.fern_echi, nombreproducto = "Fern molesta", calificacion = 1f, precio = 49999 ,entrega = "el domingo"),
                Product_model(imagenproduct = R.drawable.chiikawa_explosion, nombreproducto = "Chiikawa explosion", calificacion = 5.0f, precio = 1, entrega = "nunca"),
                Product_model(imagenproduct = R.drawable.gato_lanza_tomate, nombreproducto = "Gato tomatazo", calificacion = 5.0f, precio = 499, entrega = "el lunes"),
                Product_model(imagenproduct = R.drawable.gato_recibe_tomate, nombreproducto = "Gato tomatazo cara", calificacion = 5.0f, precio = 499, entrega = "el martes"),
                Product_model(imagenproduct = R.drawable.ups, nombreproducto = "Gato ups", calificacion = 3.5f, precio = 360, entrega = "el miercoles"),
                Product_model(imagenproduct = R.drawable.gato_lanza_piedra, nombreproducto = "Gato piedrazo", calificacion = 5.0f, precio = 499, entrega = "el jueves")
            )
            else -> {return productList}
        }
        return productList
    }
}