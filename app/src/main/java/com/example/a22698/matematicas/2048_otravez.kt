package com.example.a22698.matematicas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bento
import androidx.compose.material.icons.filled.SwapVert
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a22698.R

@Composable
fun Otravez(reiniciar:(Boolean) -> Unit, pantalla1:(Boolean) ->Unit, pantalla2:(Boolean) ->Unit, nombre: (String) -> Unit, estado: Boolean, modifier: Modifier){

    var irJuego by remember { mutableStateOf(false) }
    var perderJuego by remember { mutableStateOf(value = false) }
    var reiniciarJuego by remember { mutableStateOf(value = false) }
    var jugador by remember { mutableStateOf(value = "jugador") }


    val Poppins = FontFamily(Font(R.font.poppinsbold, FontWeight.Bold),
        Font(R.font.poppinsthin, FontWeight.Thin),
        Font(R.font.poppinsblack, FontWeight.Black),
        Font(R.font.poppinslight, FontWeight.Light),
        Font(R.font.poppinsmedium, FontWeight.Medium),
        Font(R.font.poppinsextrabold, FontWeight.ExtraBold),
        Font(R.font.poppinsextralight, FontWeight.ExtraLight),
        Font(R.font.poppinsregular, FontWeight.Normal),
        Font(R.font.poppinssemibold, FontWeight.SemiBold))

    if (estado){
        Box(modifier = modifier){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Row(horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                    .size(width = 180.dp, height = 65.dp)
                    .background(color = Color(0xFFEAE7DA), shape = RoundedCornerShape(16.dp))) {
                    Spacer(modifier = Modifier.width(5.dp))
                    Column(modifier = Modifier
                        .size(width = 50.dp, height = 65.dp)) {
                        Column(modifier = Modifier
                            .padding(start = 5.dp, top = 2.dp)
                            .size(width = 50.dp, height = 50.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center) {
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(width = 40.dp, height = 40.dp)
                                    .background(color = Color(0xFFBAAC9A),
                                        shape = RoundedCornerShape(8.dp))
                                    .clickable{
                                        irJuego = true
                                        pantalla1(irJuego)
                                    }){
                                Icon(imageVector = Icons.Default.ArrowBack,
                                    contentDescription= "atrás",
                                    tint = Color(0xFFFBFAF9))
                            }
                        }
                        Box(contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(width = 65.dp, height = 5.dp)){
                            Row() {
                                Spacer(modifier = Modifier.width(6.dp))
                                Box(modifier = Modifier
                                    .size(width = 15.dp, height = 3.dp)
                                    .background(color = Color(0xFFBAAC9A), shape = RoundedCornerShape(1.dp))){
                                }
                                Spacer(modifier = Modifier.width(5.dp))
                                Box(modifier = Modifier
                                    .size(width = 15.dp, height = 3.dp)
                                    .background(color = Color(0xFFBAAC9A), shape = RoundedCornerShape(1.dp))){
                                }
                            }
                        }

                    }
                    Spacer(modifier = Modifier.width(3.dp))
                    Column(modifier = Modifier
                        .size(width = 55.dp, height = 65.dp)) {
                        Column(modifier = Modifier
                            .padding(start = 5.dp, top = 2.dp)
                            .size(width = 50.dp, height = 50.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center) {
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(width = 40.dp, height = 40.dp)
                                    .background(color = Color(0xFFBAAC9A),
                                        shape = RoundedCornerShape(8.dp))
                                    .clickable{
                                        perderJuego = true
                                        pantalla2(perderJuego)
                                    }){
                                Icon(imageVector = Icons.Default.SwapVert,
                                    contentDescription= "cambiar",
                                    tint = Color(0xFFFBFAF9))
                            }
                        }
                        Box(contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(width = 50.dp, height = 5.dp)){
                            Row() {
                                Spacer(modifier = Modifier.width(10.dp))
                                Box(modifier = Modifier
                                    .size(width = 15.dp, height = 3.dp)
                                    .background(color = Color(0xFFBAAC9A), shape = RoundedCornerShape(1.dp))){
                                }
                                Spacer(modifier = Modifier.width(5.dp))
                                Box(modifier = Modifier
                                    .size(width = 15.dp, height = 3.dp)
                                    .background(color = Color(0xFFDCD5C6), shape = RoundedCornerShape(1.dp))){
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.width(3.dp))

                    Column(modifier = Modifier
                        .size(width = 55.dp, height = 65.dp)) {
                        Column(modifier = Modifier
                            .padding(start = 5.dp, top = 2.dp)
                            .size(width = 50.dp, height = 50.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center) {
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(width = 40.dp, height = 40.dp)
                                    .background(color = Color(0xFFDCD5C6), shape = RoundedCornerShape(8.dp))){
                                Icon(imageVector = Icons.Default.Bento,
                                    contentDescription= "Agregar",
                                    tint = Color(0xFFFBFAF9))
                            }
                        }
                        Box(contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(width = 50.dp, height = 5.dp)){
                            Row() {
                                Spacer(modifier = Modifier.width(10.dp))
                                Box(modifier = Modifier
                                    .size(width = 15.dp, height = 3.dp)
                                    .background(color = Color(0xFFDCD5C6), shape = RoundedCornerShape(1.dp))){
                                }
                                Spacer(modifier = Modifier.width(5.dp))
                                Box(modifier = Modifier
                                    .size(width = 15.dp, height = 3.dp)
                                    .background(color = Color(0xFFDCD5C6), shape = RoundedCornerShape(1.dp))){
                                }
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))

                Box(modifier = Modifier
                    .size(width = 300.dp, height = 40.dp)){
                    Row(verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .size(width = 300.dp, height = 40.dp)) {
                        Text(text = "Introduce tu nombre: ",
                            fontFamily = Poppins,
                            color = Color(0xFF756452),
                            fontWeight = FontWeight.Bold)

                        BasicTextField(modifier = Modifier
                            .size(width = 100.dp, height = 20.dp)
                            .background(color = Color(0xFFE8E5D8), shape = RoundedCornerShape(size = 10.dp))
                            .padding(start = 10.dp ),
                            value = jugador,
                            onValueChange = { nuevoNombre -> jugador = nuevoNombre
                                nombre(nuevoNombre)
                            },
                            textStyle = TextStyle(
                                fontSize = 13.sp,
                                fontFamily = Poppins,
                                color = Color(0xFF756452),
                            ))
                    }
                }
            }
        }
    }else{
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .size(height = 50.dp, width = 400.dp)
                .padding(start = 15.dp, end = 15.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)) {
                Box(contentAlignment = Alignment.Center,
                    modifier = Modifier
                    .background(color = Color(0xFF998B7C),shape = RoundedCornerShape(size = 12.dp))
                    .size(height = 30.dp, width = 170.dp)
                        .clickable{
                            reiniciarJuego = true
                            reiniciar(reiniciarJuego)
                        }){
                    Text(text = "Play Again",
                        color = Color(0xFFF0EEEC),
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal)
                }
            }
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .border(width = 2.dp, color = Color(0xFFCAC0B3), shape = RoundedCornerShape(size = 12.dp))
                    .background(color = Color(0xFFFAF8F0))
                    .size(height = 30.dp, width = 170.dp)
                    .padding(start = 10.dp, end = 10.dp)) {
                Text(text = "Undo",
                    color = Color(0xFFCAC0B3),
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold)
            }
        }
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .size(height = 20.dp, width = 400.dp)
                .padding(start = 15.dp, end = 15.dp)) {
            Text(text = "You´re out of undos",
                fontSize = 10.sp,
                color = Color(0xFFC0B3A3),
                fontWeight = FontWeight.Normal,
                fontFamily = Poppins
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OtravezPreview(){

    var reiniciar by remember { mutableStateOf(value = false) }
    var pantalla1 by remember { mutableStateOf(value = false)}
    var pantalla2 by remember { mutableStateOf(value = false)}
    var activo by remember { mutableStateOf(value = true)}
    var nombre by remember { mutableStateOf(value = "") }

    Otravez({reiniciar = it},{pantalla1 = it},{pantalla2 = it}, {nombre = it},activo, modifier = Modifier
        .size(width = 180.dp, height = 120.dp)
        .background(color = Color(0xFFEAE7DA), shape = RoundedCornerShape(16.dp)))
}
