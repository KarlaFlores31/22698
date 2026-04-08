package com.example.a22698.actividad4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ProductosListview(claveCategoria: String, navController: NavHostController) {
    val vm = MercadoviewModel()
    val productos = vm.traerProductosPorCategoria(claveCategoria)
    val titulo = when (claveCategoria) {
        "belleza" -> "Belleza"
        "deportes" -> "Deportes"
        "electrodomesticos" -> "Electrodomesticos"
        "juguetes" -> "Juguetes"
        "mascotas" -> "Mascotas"
        else -> "Productos"
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEEEEEE))
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { navController.popBackStack() }) {
                Text("Atras")
            }
            Spacer(modifier = Modifier.width(12.dp))
            Text(text = titulo, fontSize = 18.sp)
        }

        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(productos) { producto ->
                ProductoFila(producto)
            }
        }
    }
}

@Composable
private fun ProductoFila(producto: ProductoMercado) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(producto.imagen),
            contentDescription = producto.nombre,
            modifier = Modifier.size(90.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = producto.nombre, fontSize = 14.sp)
            Spacer(modifier = Modifier.height(4.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = producto.precio,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                if (producto.descuento != null) {
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = producto.descuento,
                        color = Color(0xFF2E7D32),
                        fontSize = 13.sp
                    )
                }
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = producto.envioTexto,
                color = if (producto.envioGratis) Color(0xFF2E7D32) else Color.DarkGray,
                fontSize = 12.sp
            )
        }
    }
}
