package com.example.a22698.actividad4

data class Mercado_model(val texto: String, val categoria: Int, val clave: String)

data class ProductoMercado(
    val imagen: Int,
    val nombre: String,
    val precio: String,
    val envioTexto: String,
    val envioGratis: Boolean,
    val descuento: String?
)
