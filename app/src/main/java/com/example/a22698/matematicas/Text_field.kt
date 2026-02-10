package com.example.a22698.matematicas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Preview(showBackground = true)
@Composable

fun Numbertextfield(modificador: Modifier, fill:(String)-> Unit){
    var number by remember { mutableStateOf(value = "") }

    Column(modifier = modificador.background(color = Color(0xFFFFFFFF))){
        Text(text = "Ingresa un número")
        TextField(value = number,
            placeholder = {Text(text = "Número")},
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color(0xFF000000),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            onValueChange = {
                    textoEscrito ->
                //val uper = textoEscrito.uppercase()
                if (textoEscrito.toIntOrNull() != null){
                    number = textoEscrito.toInt().toString()
                    fill(number)
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable

fun NumbertextfieldPreview(){

    var si by remember { mutableStateOf(value = "") }
    Column() {
        Text(si)
        Numbertextfield(modificador = Modifier.fillMaxWidth()){
            si = it
        }
    }
}