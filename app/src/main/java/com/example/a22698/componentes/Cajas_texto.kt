package com.example.a22698.componentes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a22698.matematicas.Numbertextfield

@Preview(showBackground = true)
@Composable

fun CajasTexto (){
    var number by remember {
        mutableStateOf(value = "")
    }
    var number2 by remember {
        mutableStateOf(value = "")
    }
    var result by remember {
        mutableStateOf(value = "")
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(all = 16.dp),
        verticalArrangement = Arrangement.Center) {
        Row(modifier = Modifier
            .fillMaxWidth()) {
            Numbertextfield(modificador = Modifier .fillMaxWidth().weight(2f)){
                number = it
            }
            Spacer(modifier = Modifier.fillMaxWidth().weight(weight = 1f))
            Numbertextfield(modificador = Modifier .fillMaxWidth().weight(2f)){
                number2 = it
            }
        }
        Spacer(modifier = Modifier.height(height = 16.dp))
        Row(horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()) {
            Text(text = "Borrar todo",
                modifier = Modifier.clickable(
                    onClick = {
                        number = ""
                        number2 = ""
                        result = ""
                    }
                ))
        }
        Row(horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()) {
            OutlinedButton(onClick = {
                if (number.toIntOrNull() != null && number2.toIntOrNull() != null){
                    result = (number.toInt() - number2.toInt()).toString()
                }else{
                    result = "Favor ingrese solo números"
                }
            },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffffffff),
                    contentColor = Color(0xFF000000)),
                border = BorderStroke(1.dp, color = Color(0xFF000000))
            ) {
                Text(text = "Restar")
            }
            IconButton(onClick = {
                if (number.toIntOrNull() != null && number2.toIntOrNull() != null){
                    result = (number.toInt() + number2.toInt()).toString()
                }else{
                    result = "Favor ingrese solo números"
                }
            }) {
                Icon(imageVector = Icons.Default.Add,
                    contentDescription = "Sumar")
            }
        }
        Row(horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()) {
            Button(onClick = {
                if (number.toIntOrNull() != null && number2.toIntOrNull() != null){
                    result = (number.toInt() * number2.toInt()).toString()
                }else{
                    result = "Favor ingrese solo números"
                }
            }, colors = ButtonDefaults.buttonColors(containerColor = Color(
                0xFF282828
            )
            )) {
                Text(text = "Multiplicar")
            }
            TextButton(onClick = {
                if (number.toIntOrNull() != null && number2.toIntOrNull() != null){
                    result = (number.toInt() / number2.toInt()).toString()
                }else{
                    result = "Favor ingrese solo números"
                }
            }) {
                Text(text = "Dividir",
                    color = Color(0xFF000000)
                )
            }
        }
        Spacer(modifier = Modifier.height(height = 16.dp))
        Text(text = result)
    }
}