package com.example.a22698.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable

fun Filas(){
    Row(modifier = Modifier.fillMaxWidth() , horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically) {
        Text(text = "uno")
        VerticalDivider()
        Column() {
            Text(text = "dos")
            Text(text = "cuatro")
            Text(text = "cinco")
        }
        Column() {
            Text(text = "tres")
            Row(){
                Text("", Modifier.width(15.dp).height(15.dp).background(color = Color(0xFFE91E63)))
                Column(){
                Text("", Modifier.width(30.dp).height(15.dp).background(color = Color(0xFF3F51B5)))
                }
            }
            Row(){
                Text("", Modifier.width(30.dp).height(15.dp).background(color = Color(0xFF3F51B5)))
                Column(){
                    Text("", Modifier.width(15.dp).height(15.dp).background(color = Color(0xFFE91E63)))
                }
            }
        }
    }
}