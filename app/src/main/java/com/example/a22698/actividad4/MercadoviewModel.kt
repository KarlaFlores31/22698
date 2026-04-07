package com.example.a22698.actividad4

import com.example.a22698.R

class MercadoviewModel {

    fun traercategorias(): List<Mercado_model>{
        var categoriaslist = mutableListOf<Mercado_model>()

        categoriaslist.add(Mercado_model("ACCESORIOS PARA BELLEZA", R.drawable.belleza))
        categoriaslist.add(Mercado_model("PARA DEPORTES", R.drawable.deportes))
        categoriaslist.add(Mercado_model("TU NUEVO ELECTRODOMÉSTICO", R.drawable.electrodomesticos))
        categoriaslist.add(Mercado_model("PARA TU COLECCIÓN", R.drawable.juguetes))
        categoriaslist.add(Mercado_model("PARA TU PERRHIJO", R.drawable.mascotas))
        return categoriaslist
    }
}