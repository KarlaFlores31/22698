package com.example.a22698.matematicas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Dehaze
import androidx.compose.material.icons.filled.RestartAlt
import androidx.compose.material.icons.filled.SwapVert
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a22698.R

@Composable
fun Perder(score:(Int),best:(Int),estado:(Boolean)){
    val Poppins = FontFamily(Font(R.font.poppinsbold, FontWeight.Bold),
        Font(R.font.poppinsthin, FontWeight.Thin),
        Font(R.font.poppinsblack, FontWeight.Black),
        Font(R.font.poppinslight, FontWeight.Light),
        Font(R.font.poppinsmedium, FontWeight.Medium),
        Font(R.font.poppinsextrabold, FontWeight.ExtraBold),
        Font(R.font.poppinsextralight, FontWeight.ExtraLight),
        Font(R.font.poppinsregular, FontWeight.Normal),
        Font(R.font.poppinssemibold, FontWeight.SemiBold))

    if (estado == false){
        Spacer(modifier = Modifier.height(40.dp))
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .size(height = 50.dp, width = 400.dp)
                .padding(start = 15.dp, end = 15.dp)) {
            Text(text = "Game over",
                fontSize = 40.sp,
                color = Color(0xFF756452),
                fontWeight = FontWeight.Bold,
                fontFamily = Poppins
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .size(height = 20.dp, width = 400.dp)
                .padding(start = 15.dp, end = 15.dp)) {
            Text(text = "$score points scored",
                fontSize = 10.sp,
                color = Color(0xFF756452),
                fontWeight = FontWeight.Normal,
                fontFamily = Poppins
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .size(height = 50.dp, width = 400.dp)
                .padding(start = 15.dp, end = 15.dp)) {
            Box(modifier = Modifier
                .size(size = 50.dp)){
                Box(contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(width = 40.dp, height = 40.dp)
                        .background(color = Color(0xFFBAAC9A), shape = RoundedCornerShape(8.dp))){
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription= "atrás",
                        tint = Color(0xFFFBFAF9))
                }
                Box(contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(start = 30.dp,top = 30.dp)
                        .size(size = 20.dp)
                        .background(color = Color(0xFFF8F6EE), shape = RoundedCornerShape(10.dp))){
                    Text(text = "3",
                        fontSize = 15.sp,
                        fontFamily = Poppins,
                        color = Color(0xFFBAAC9A),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Box(modifier = Modifier
                .size(size = 50.dp)){
                Box(contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(width = 40.dp, height = 40.dp)
                        .background(color = Color(0xFFBAAC9A), shape = RoundedCornerShape(8.dp))){
                    Icon(imageVector = Icons.Default.SwapVert,
                        contentDescription= "atrás",
                        tint = Color(0xFFFBFAF9))
                }
                Box(contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(start = 30.dp,top = 30.dp)
                        .size(size = 20.dp)
                        .background(color = Color(0xFFF8F6EE), shape = RoundedCornerShape(10.dp))){
                    Text(text = "2",
                        fontSize = 15.sp,
                        fontFamily = Poppins,
                        color = Color(0xFFBAAC9A),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }else{
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
    }
}