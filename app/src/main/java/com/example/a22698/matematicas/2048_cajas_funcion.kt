package com.example.a22698.matematicas

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a22698.R



fun sumarnumero(valor : Int): Int {
    if (valor == 0) {
        return 2
    } else if (valor < 2049) {
        return valor + valor
    }
    return valor
}

@Composable
fun Cambiarnumero(suma:(Int)-> Unit, activo:(Boolean)-> Unit){
    val Poppins = FontFamily(Font(R.font.poppinsbold, FontWeight.Bold),
        Font(R.font.poppinsthin, FontWeight.Thin),
        Font(R.font.poppinsblack, FontWeight.Black),
        Font(R.font.poppinslight, FontWeight.Light),
        Font(R.font.poppinsmedium, FontWeight.Medium),
        Font(R.font.poppinsextrabold, FontWeight.ExtraBold),
        Font(R.font.poppinsextralight, FontWeight.ExtraLight),
        Font(R.font.poppinsregular, FontWeight.Normal),
        Font(R.font.poppinssemibold, FontWeight.SemiBold))

    var numero by remember { mutableStateOf(value = 0)}
    var estado by remember { mutableStateOf(value = true)}

    if (numero == 0) {
        Button(onClick = {
            numero = sumarnumero(numero) },
            modifier = Modifier
                .size(65.dp)
                .padding(1.5.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFBDAC98)),
            shape = RoundedCornerShape(size = 10.dp)
        ) {
        }
        suma(numero)
    } else if (numero == 2){
        Button(onClick = {
            numero = sumarnumero(numero) },
            modifier = Modifier
                .size(65.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFEFE4DA),
                contentColor = Color(0xFF756452)),
            shape = RoundedCornerShape(size = 10.dp)
        ) {
            Text(text = "2",
                fontFamily = Poppins,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
        suma(numero)
    } else if (numero == 4){
        Button(onClick = {
            numero = sumarnumero(numero) },
            modifier = Modifier
                .size(65.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFEBD9B6),
                contentColor = Color(0xFF756452)),
            shape = RoundedCornerShape(size = 10.dp)
        ) {
            Text(text = "4",
                fontFamily = Poppins,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
        suma(numero)
    } else if (numero == 8){
        Button(onClick = {
            numero = sumarnumero(numero) },
            modifier = Modifier
                .size(65.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF1AD72),
                contentColor = Color(0xFFFFFFFF)),
            shape = RoundedCornerShape(size = 10.dp)
        ) {
            Text(text = "8",
                fontFamily = Poppins,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
        suma(numero)
    } else if (numero == 16){
        Button(onClick = {
            numero = sumarnumero(numero) },
            modifier = Modifier
                .size(65.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF69462),
                contentColor = Color(0xFFFFFFFF)),
            shape = RoundedCornerShape(size = 10.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            Text(text = "16",
                fontFamily = Poppins,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        suma(numero)
    } else if (numero == 32){
        Button(onClick = {
            numero = sumarnumero(numero) },
            modifier = Modifier
                .size(65.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF6785A),
                contentColor = Color(0xFFFFFFFF)),
            shape = RoundedCornerShape(size = 10.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            Text(text = "32",
                fontFamily = Poppins,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        suma(numero)
    } else if (numero == 64){
        Button(onClick = {
            numero = sumarnumero(numero) },
            modifier = Modifier
                .size(65.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF55A37),
                contentColor = Color(0xFFFFFFFF)),
            shape = RoundedCornerShape(size = 10.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            Text(text = "64",
                fontFamily = Poppins,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        suma(numero)
    } else if (numero == 128){
        Button(onClick = {
            numero = sumarnumero(numero) },
            modifier = Modifier
                .size(65.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF2CE53),
                contentColor = Color(0xFFFFFFFF)),
            shape = RoundedCornerShape(size = 10.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            Text(text = "128",
                fontFamily = Poppins,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        suma(numero)
    } else if (numero == 256){
        Button(onClick = {
            numero = sumarnumero(numero) },
            modifier = Modifier
                .size(65.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF8CF49),
                contentColor = Color(0xFFFFFFFF)),
            shape = RoundedCornerShape(size = 10.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            Text(text = "256",
                fontFamily = Poppins,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        suma(numero)
    } else if (numero == 512){
        Button(onClick = {
            numero = sumarnumero(numero) },
            modifier = Modifier
                .size(65.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFCCD36),
                contentColor = Color(0xFFFFFFFF)),
            shape = RoundedCornerShape(size = 10.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            Text(text = "512",
                fontFamily = Poppins,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        suma(numero)
    } else if (numero == 1024){
        Button(onClick = {
            numero = sumarnumero(numero) },
            modifier = Modifier
                .size(65.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFEDC53E),
                contentColor = Color(0xFFFFFFFF)),
            shape = RoundedCornerShape(size = 10.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            Text(text = "1024",
                fontFamily = Poppins,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        suma(numero)
    }
    else{
        Button(onClick = {
            numero = sumarnumero(numero)
            estado = false
            activo(estado)
            numero = numero - 2048},
            modifier = Modifier
                .size(65.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFE0BA01),
                contentColor = Color(0xFFFFFFFF)),
            shape = RoundedCornerShape(size = 10.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            Text(text = "2048",
                fontFamily = Poppins,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        suma(numero)
    }
}

@Preview
@Composable
fun CambiarnumerosPreview(){
    var suma by remember { mutableStateOf(value = 0) }
    var activo by remember { mutableStateOf(value = true) }
    Cambiarnumero({ suma = it }, {activo = it})
    Text(text = suma.toString())
    Text(text = activo.toString())

}