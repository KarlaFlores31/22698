package com.example.a22698.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a22698.ui.theme.Pink40
import com.example.a22698.ui.theme.Pink80
import com.example.a22698.ui.theme.colorprimario


@Preview(showBackground = true)
@Composable


fun Modificador(){
    Text(text = "Zuri pro",
        modifier = Modifier
            .background(colorprimario)
            .padding(2.dp)
            //.background(Color.Gray)
            .padding(vertical = 8.dp)
            //.alpha(alpha = .7f)
            //.blur(.6.dp)
            //.border(2.dp, Color.Red)
            //.shadow(elevation = 5.dp)
            .rotate(180f),
        color = Color(0xFFFFC107),
        fontSize = 12.sp
    )
}

