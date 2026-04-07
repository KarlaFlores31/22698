package com.example.a22698.actividad4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a22698.R

@Preview(showBackground = true)
@Composable
fun CategoriaactView(){
    val variables = Mercado_model("ACCESORIOS PARA BELLEZA", R.drawable.belleza)
    Categoriaact(variables)
}


@Composable
fun Categoriaact(categoria : Mercado_model,selected:() -> Unit){
    Row(modifier = Modifier.size(width = 300.dp, height = 200.dp)){
        Card(modifier = Modifier.size(width = 200.dp, height = 100.dp)
            .background(color = Color.White), shape = RectangleShape,
            colors = CardDefaults.cardColors(
            containerColor = Color(0xffffffff))) {
            Column() {
                Button(onClick = {
                    selected() }) {

                }
                Box(){
                    Text(text = categoria.texto,
                        fontSize = 10.sp,
                        modifier = Modifier.
                    padding(8.dp))
                }
                Box(){
                    Image(painter = painterResource(categoria.categoria),
                        contentDescription = "Belleza categoría",
                        contentScale = ContentScale.Crop)
                }
            }
        }
    }
}