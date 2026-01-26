package com.example.a22698.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a22698.MyTextView

//@Preview(showBackground = true)
@Composable

fun Columnas(){
    Column(verticalArrangement = Arrangement.Center,
        modifier = Modifier.background(Color(color = 0xFF5EA89F)).padding(end = 15.dp),
        horizontalAlignment = Alignment.End) {
        Text(text = "zuri")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "pro")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "pibble")
        MyTextView()
    }
}

@Preview(showBackground = true)
@Composable

fun Separadores(){
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
        Text(text = "hola", modifier = Modifier.fillMaxSize().weight(.25f))
        HorizontalDivider(thickness = 20.dp, color = Color(0xFF5450CB))
        Text(text = "zuri", modifier = Modifier.fillMaxSize().weight(.5f))
        Text(text = "pibble", modifier = Modifier.fillMaxSize().weight(.25f))
        Columnas()
        //Text(text = "belly")
    }
}