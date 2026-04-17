package com.example.a22698.repaso2doparcial

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a22698.R

/**
 * **Una fila de la lista**: tarjeta con imagen, textos y botón. Equivale a la idea de `listas/Productovista`,
 * pero tipada con [RepasoProducto] para mantener el repaso autocontenido.
 *
 * @param producto Datos a mostrar (imagen, nombre, precio, etc.).
 * @param selected Callback que el padre puede usar cuando el usuario confirma acción (aquí se invoca al pulsar el botón,
 *        además de alternar el estado local `chuich`).
 */
@Preview(showBackground = true)
@Composable
private fun RepasoProductovistaPreview() {
    val ejemplo = RepasoProducto(
        imagenproduct = R.drawable.gato_lanza_tomate,
        nombreproducto = "Gato tomatazo",
        calificacion = 5.0f,
        precio = 499,
        entrega = "el domingo",
    )
    RepasoProductovista(ejemplo) { }
}

@Composable
fun RepasoProductovista(producto: RepasoProducto, selected: () -> Unit) {
    // Estado local: si es true, se muestra el texto "Agregado al carrito" debajo de la tarjeta.
    // `remember` evita que al recomponer se pierda si el ítem ya estaba "marcado".
    var chuich by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxWidth()) {
        // `Card`: superficie Material con forma y color de fondo; agrupa el contenido de la fila.
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xffffffff)),
        ) {
            // `Row`: disposición horizontal — imagen a la izquierda, columna de textos a la derecha.
            Row {
                // `painterResource(Int)`: carga el drawable a partir del id `R.drawable.*`.
                Image(
                    modifier = Modifier
                        .size(120.dp)
                        .align(Alignment.CenterVertically),
                    painter = painterResource(producto.imagenproduct),
                    contentDescription = "imagen de producto",
                )
                Column(modifier = Modifier.padding(start = 8.dp)) {
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = producto.nombreproducto, fontSize = 20.sp)
                    Text(text = "⭐${producto.calificacion} estrellas", fontSize = 10.sp)
                    // En strings, `$` antes de `{` interpola valores; doble `$` escapa el símbolo de moneda.
                    Text(
                        text = "$${producto.precio}",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Llega ${producto.entrega}")
                    Button(
                        onClick = {
                            selected() // Notifica al padre (p. ej. para navegar o contar clics).
                            chuich = !chuich // Alterna el mensaje inferior (demo de estado en el ítem).
                        },
                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color(0xFF000000),
                            containerColor = Color(0xFFFFC107),
                        ),
                    ) {
                        Text(text = "Agregar a carrito")
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                }
            }
        }
        if (chuich) {
            Text(text = "Agregado al carrito")
        }
    }
}
