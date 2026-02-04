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

@Preview(showBackground = true)
@Composable

fun JuegoGameover(){
    val Poppins = FontFamily(Font(R.font.poppinsbold, FontWeight.Bold),
        Font(R.font.poppinsthin, FontWeight.Thin),
        Font(R.font.poppinsblack, FontWeight.Black),
        Font(R.font.poppinslight, FontWeight.Light),
        Font(R.font.poppinsmedium, FontWeight.Medium),
        Font(R.font.poppinsextrabold, FontWeight.ExtraBold),
        Font(R.font.poppinsextralight, FontWeight.ExtraLight),
        Font(R.font.poppinsregular, FontWeight.Normal),
        Font(R.font.poppinssemibold, FontWeight.SemiBold))

    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(0xFFFAF8F0))){
        Column() {
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
                Text(text = "7000 points scored in 476 moves.",
                    fontSize = 10.sp,
                    color = Color(0xFF756452),
                    fontWeight = FontWeight.Normal,
                    fontFamily = Poppins
                )
                Text(text = " 2 powerups used:",
                    fontSize = 10.sp,
                    color = Color(0xFF756452),
                    fontWeight = FontWeight.Bold,
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
            Spacer(modifier = Modifier.height(60.dp))

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
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFEFE4DA), shape = RoundedCornerShape(size = 10.dp))) {
                                Text(text = "2",
                                    color = Color(0xFF756452),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFF67759), shape = RoundedCornerShape(size = 10.dp))){
                                Text(text = "32",
                                    color = Color(0xFFFFFFFF),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFEFE4DA), shape = RoundedCornerShape(size = 10.dp))){
                                Text(text = "2",
                                    color = Color(0xFF756452),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFEBD9B6), shape = RoundedCornerShape(size = 10.dp))){
                                Text(text = "4",
                                    color = Color(0xFF756452),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
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
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFEBD9B6), shape = RoundedCornerShape(size = 10.dp))) {
                                Text(text = "4",
                                    color = Color(0xFF756452),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFF55A36), shape = RoundedCornerShape(size = 10.dp))){
                                Text(text = "64",
                                    color = Color(0xFFFFFFFF),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFEBD9B6), shape = RoundedCornerShape(size = 10.dp))){
                                Text(text = "4",
                                    color = Color(0xFF756452),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFF2CE56), shape = RoundedCornerShape(size = 10.dp))){
                                Text(text = "128",
                                    color = Color(0xFFFFFFFF),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
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
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFF1AE71), shape = RoundedCornerShape(size = 10.dp))) {
                                Text(text = "8",
                                    color = Color(0xFFFFFFFF),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFF4CB48), shape = RoundedCornerShape(size = 10.dp))){
                                Text(text = "256",
                                    color = Color(0xFFFFFFFF),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFF6C93A), shape = RoundedCornerShape(size = 10.dp))){
                                Text(text = "512",
                                    color = Color(0xFFFFFFFF),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFF1AE71), shape = RoundedCornerShape(size = 10.dp))){
                                Text(text = "8",
                                    color = Color(0xFFFFFFFF),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
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
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFEBD9B6), shape = RoundedCornerShape(size = 10.dp))) {
                                Text(text = "4",
                                    color = Color(0xFF756452),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFF1AE71), shape = RoundedCornerShape(size = 10.dp))) {
                                Text(text = "8",
                                    color = Color(0xFFFFFFFF),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFEFE4DA), shape = RoundedCornerShape(size = 10.dp))){
                                Text(text = "2",
                                    color = Color(0xFF756452),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.width(7.5.dp))
                            Box(contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(65.dp)
                                    .background(color = Color(0xFFEBD9B6), shape = RoundedCornerShape(size = 10.dp))) {
                                Text(text = "4",
                                    color = Color(0xFF756452),
                                    fontFamily = Poppins,
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }


                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .size(height = 50.dp, width = 400.dp)
                    .padding(start = 15.dp, end = 15.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .background(color = Color(0xFF998B7C),shape = RoundedCornerShape(size = 12.dp))
                        .size(height = 30.dp, width = 170.dp)
                        .padding(start = 10.dp, end = 10.dp)) {
                    Text(text = "Play Again",
                        color = Color(0xFFF0EEEC),
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal)
                }
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .border(width = 2.dp, color = Color(0xFFCAC0B3), shape = RoundedCornerShape(size = 12.dp))
                        .background(color = Color(0xFFFAF8F0))
                        .size(height = 30.dp, width = 170.dp)
                        .padding(start = 10.dp, end = 10.dp)) {
                    Text(text = "Undo",
                        color = Color(0xFFCAC0B3),
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal)
                }
            }
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .size(height = 20.dp, width = 400.dp)
                    .padding(start = 15.dp, end = 15.dp)) {
                Text(text = "You´r out of undos",
                    fontSize = 10.sp,
                    color = Color(0xFFC0B3A3),
                    fontWeight = FontWeight.Normal,
                    fontFamily = Poppins
                )
            }
        }
    }
}