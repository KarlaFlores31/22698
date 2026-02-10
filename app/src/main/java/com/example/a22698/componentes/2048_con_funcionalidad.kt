package com.example.a22698.componentes

import androidx.compose.material.icons.Icons
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.content.contentReceiver
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bento
import androidx.compose.material.icons.filled.Dehaze
import androidx.compose.material.icons.filled.RestartAlt
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a22698.R
import com.example.a22698.matematicas.Best
import com.example.a22698.matematicas.Cambiarnumero
import com.example.a22698.matematicas.Score

@Preview(showBackground = true)
@Composable

fun Juegoconfuncionalidad(){
    val Poppins = FontFamily(Font(R.font.poppinsbold, FontWeight.Bold),
        Font(R.font.poppinsthin, FontWeight.Thin),
        Font(R.font.poppinsblack, FontWeight.Black),
        Font(R.font.poppinslight, FontWeight.Light),
        Font(R.font.poppinsmedium, FontWeight.Medium),
        Font(R.font.poppinsextrabold, FontWeight.ExtraBold),
        Font(R.font.poppinsextralight, FontWeight.ExtraLight),
        Font(R.font.poppinsregular, FontWeight.Normal),
        Font(R.font.poppinssemibold, FontWeight.SemiBold))

    var uno by remember { mutableStateOf(value = 0)}
    var dos by remember { mutableStateOf(value = 0)}
    var tres by remember { mutableStateOf(value = 0)}
    var cuatro by remember { mutableStateOf(value = 0)}
    var cinco by remember { mutableStateOf(value = 0)}
    var seis by remember { mutableStateOf(value = 0)}
    var siete by remember { mutableStateOf(value = 0)}
    var ocho by remember { mutableStateOf(value = 0)}
    var nueve by remember { mutableStateOf(value = 0)}
    var diez by remember { mutableStateOf(value = 0)}
    var once by remember { mutableStateOf(value = 0)}
    var doce by remember { mutableStateOf(value = 0)}
    var trece by remember { mutableStateOf(value = 0)}
    var catorce by remember { mutableStateOf(value = 0)}
    var quince by remember { mutableStateOf(value = 0)}
    var dieciseis by remember { mutableStateOf(value = 0)}

    var score by remember { mutableStateOf(value = 0) }
    var best by remember { mutableStateOf(value = 0) }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(0xFFFAF8F0))){
        Column() {
            Spacer(modifier = Modifier.height(30.dp))
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .size(height = 80.dp, width = 400.dp)
                    .padding(start = 15.dp, end = 15.dp)) {
                Icon(imageVector = Icons.Default.Dehaze,
                    contentDescription = "Tres lineas",
                    modifier = Modifier
                        .size(30.dp)
                        .padding(start = 5.dp),
                    tint = Color(0xFF756452)
                )
                Text(text = "2048",
                    fontSize = 40.sp,
                    color = Color(0xFF756452),
                    fontWeight = FontWeight.Bold,
                    fontFamily = Poppins
                )
                Icon(imageVector = Icons.Default.RestartAlt,
                    contentDescription = "Reiniciar",
                    modifier = Modifier
                        .size(35.dp)
                        .padding(5.dp),
                    tint = Color(0xFF756452)
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .size(height = 50.dp, width = 400.dp)
                    .padding(start = 15.dp, end = 15.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .background(color = Color(0xFFEAE7DA),shape = RoundedCornerShape(size = 12.dp))
                        .size(height = 30.dp, width = 170.dp)
                        .padding(start = 10.dp, end = 10.dp)) {
                    Text(text = "SCORE",
                        color = Color(0xFF988876),
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold)
                    Text(text = score.toString(),
                        color = Color(0xFF988876),
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold)
                }
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .border(width = 2.dp, color = Color(0xFFEAE7DA), shape = RoundedCornerShape(size = 12.dp))
                        .background(color = Color(0xFFFAF8F0))
                        .size(height = 30.dp, width = 170.dp)
                        .padding(start = 10.dp, end = 10.dp)) {
                    Text(text = "BEST",
                        color = Color(0xFF988876),
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold)
                    Text(text = best.toString(),
                        color = Color(0xFF988876),
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.height(70.dp))

            Box(modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .background(color = Color(0xFF9C8A7A), shape = RoundedCornerShape(size = 16.dp))
                    .size(300.dp)){
                Column() {
                    Column(modifier = Modifier
                        .size(width = 300.dp, height = 74.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start) {
                        Spacer(modifier = Modifier.height(2.dp))
                        Row() {
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                uno = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                best = Best(uno,best)
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                dos = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                best = Best(dos,best)
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                tres = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                best = Best(tres,best)
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                cuatro = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                best = Best(cuatro,best)
                            }
                        }
                    }
                    Column(modifier = Modifier
                        .size(width = 300.dp, height = 74.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start) {
                        Spacer(modifier = Modifier.height(2.dp))
                        Row() {
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                cinco = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                seis = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                siete = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                ocho = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                            }
                        }
                    }
                    Column(modifier = Modifier
                        .size(width = 300.dp, height = 74.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start) {
                        Spacer(modifier = Modifier.height(2.dp))
                        Row() {
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                nueve = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                diez = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                once = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                doce = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                            }
                        }
                    }
                    Column(modifier = Modifier
                        .size(width = 300.dp, height = 73.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start) {
                        Spacer(modifier = Modifier.height(2.dp))
                        Row() {
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                trece = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                catorce = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                quince = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Cambiarnumero(){
                                dieciseis = it
                                score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                            }


                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Box(modifier = Modifier
                .size(width = 180.dp, height = 65.dp)
                .align(Alignment.CenterHorizontally)
                .background(color = Color(0xFFEAE7DA), shape = RoundedCornerShape(16.dp))){
                Row() {
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
                                    .background(color = Color(0xFFBAAC9A), shape = RoundedCornerShape(8.dp))){
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
                                    .background(color = Color(0xFFBAAC9A), shape = RoundedCornerShape(8.dp))){
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
            }
        }
    }
}