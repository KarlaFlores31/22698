package com.example.a22698.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
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
import com.example.a22698.matematicas.Best
import com.example.a22698.matematicas.Cambiarnumero
import com.example.a22698.matematicas.Otravez
import com.example.a22698.matematicas.Perder
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
    var activo by remember { mutableStateOf(value = true)}
    var irJuego by remember { mutableStateOf(false) }
    var perderJuego by remember { mutableStateOf(value = false) }
    var reiniciar by remember { mutableStateOf(value = false) }
    var nombre by remember { mutableStateOf(value = "") }


    if(irJuego){
        Juego()
    }else if (perderJuego){
        JuegoGameover()
    }else if (reiniciar){
        Juegoconfuncionalidad()
    }else{
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFFAF8F0))){
            Column() {
                Perder(score,best,activo,nombre)

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
                                Cambiarnumero({
                                    uno = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(uno,best)
                                },{activo = it})
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    dos = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(dos,best)
                                },{activo = it})
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    tres = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(tres,best)
                                },{activo = it})
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    cuatro = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(cuatro,best)
                                },{activo = it})
                            }
                        }
                        Column(modifier = Modifier
                            .size(width = 300.dp, height = 74.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.Start) {
                            Spacer(modifier = Modifier.height(2.dp))
                            Row() {
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    cinco = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(cinco,best)
                                },{activo = it})
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    seis = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(seis,best)
                                },{activo = it})
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    siete = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(siete,best)
                                },{activo = it})
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    ocho = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(ocho,best)
                                },{activo = it})
                            }
                        }
                        Column(modifier = Modifier
                            .size(width = 300.dp, height = 74.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.Start) {
                            Spacer(modifier = Modifier.height(2.dp))
                            Row() {
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    nueve = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(nueve,best)
                                },{activo = it})
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    diez = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(diez,best)
                                },{activo = it})
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    once = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(once,best)
                                },{activo = it})
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    doce = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(doce,best)
                                },{activo = it})
                            }
                        }
                        Column(modifier = Modifier
                            .size(width = 300.dp, height = 73.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.Start) {
                            Spacer(modifier = Modifier.height(2.dp))
                            Row() {
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    trece = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(trece,best)
                                },{activo = it})
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    catorce = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(catorce,best)
                                },{activo = it})
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    quince = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(quince,best)
                                },{activo = it})
                                Spacer(modifier = Modifier.width(7.5.dp))
                                Cambiarnumero({
                                    dieciseis = it
                                    score = Score(uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciseis)
                                    best = Best(dieciseis,best)
                                },{activo = it})


                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))

                Otravez({reiniciar = it},{irJuego = it}, {perderJuego = it}, {nombre = it},activo, modifier = Modifier
                    .size(width = 180.dp, height = 130.dp)
                    .align(Alignment.CenterHorizontally))
            }
        }
    }

}