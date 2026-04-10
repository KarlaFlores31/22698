package com.example.a22698.actividad3

import com.example.a22698.R

data class MensajeEImagen(val mensaje: String, val imagenRes: Int)

fun mensajeEImagenParaEdad(edad: Int): MensajeEImagen = when (edad) {
    in 0..14 -> MensajeEImagen(
        mensaje = "menor de edad",
        imagenRes = R.drawable.foto_nino
    )
    15 -> MensajeEImagen(
        mensaje = "mayor de edad en Indonesia pero no en mexico",
        imagenRes = R.drawable.foto_joven
    )
    16 -> MensajeEImagen(
        mensaje = "mayor de edad en Cuba pero no en mexico",
        imagenRes = R.drawable.foto_joven
    )
    17 -> MensajeEImagen(
        mensaje = "mayor de edad en Corea del norte pero no en mexico",
        imagenRes = R.drawable.foto_joven
    )
    18 -> MensajeEImagen(
        mensaje = "mayor de edad en mexico y gran parte de latinoamerica",
        imagenRes = R.drawable.foto_joven
    )
    19 -> MensajeEImagen(
        mensaje = "mayor de edad en Corea del sur",
        imagenRes = R.drawable.foto_joven
    )
    20 -> MensajeEImagen(
        mensaje = "myaor de edad en japón",
        imagenRes = R.drawable.foto_joven
    )
    21 -> MensajeEImagen(
        mensaje = "mayor de edad en Usa y posiblemente en todo el mundo",
        imagenRes = R.drawable.foto_joven
    )
    60 -> MensajeEImagen(
        mensaje = "eres de la tercera edad",
        imagenRes = R.drawable.foto_anciano
    )
    65 -> MensajeEImagen(
        mensaje = "ya te puedes jubilar",
        imagenRes = R.drawable.foto_anciano
    )
    else -> MensajeEImagen(
        mensaje = "Tienes $edad años.",
        imagenRes = R.drawable.foto_joven
    )
}
