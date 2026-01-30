package com.example.a22698.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable

fun Cajas(){
    Box(Modifier .fillMaxSize()) {
        CajaInterna(Alignment.TopStart)
        CajaInterna(Alignment.BottomCenter)
    }
}


@Composable

fun CajaInterna(alineacion : Alignment){
    Box(Modifier .fillMaxSize(), contentAlignment = alineacion) {
        Box(Modifier.size(300.dp)){
            Text(text = "1",
                Modifier.background(Color(0xFFF44336)).align(Alignment.TopStart),
                fontSize = 35.sp, color = Color(0xFFE0DFDF))
            Text(text = "2",
                Modifier.background(Color(0xFFFF9800)).align(Alignment.TopCenter),
                fontSize = 35.sp, color = Color(0xFFE0DFDF))
            Text(text = "3",
                Modifier.background(Color(0xFFFFEB3B)).align(Alignment.TopEnd),
                fontSize = 35.sp, color = Color(0xFF000000))
            Text(text = "4",
                Modifier.background(Color(0xFF8BC34A)).align(Alignment.CenterStart),
                fontSize = 35.sp, color = Color(0xFF3D3D3D))
            Text(text = "5",
                Modifier.background(Color(0xFF4CAF50)).align(Alignment.Center),
                fontSize = 35.sp, color = Color(0xFFFFFFFF))
            Text(text = "6",
                Modifier.background(Color(0xFF2196F3)).align(Alignment.CenterEnd),
                fontSize = 35.sp, color = Color(0xFFE0DFDF))
            Text(text = "7",
                Modifier.background(Color(0xFF3F51B5)).align(Alignment.BottomStart),
                fontSize = 35.sp, color = Color(0xFFE0DFDF))
            Text(text = "8",
                Modifier.background(Color(0xFF673AB7)).align(Alignment.BottomCenter),
                fontSize = 35.sp, color = Color(0xFFE0DFDF))
            Text(text = "9",
                Modifier.background(Color(0xFF9C27B0)).align(Alignment.BottomEnd),
                fontSize = 35.sp, color = Color(0xFFE0DFDF))
        }
    }
}

