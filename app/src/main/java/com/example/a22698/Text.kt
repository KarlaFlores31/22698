package com.example.a22698

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun MyTextView(){
    val myFontColor = Color.Magenta
    val tamanoFuente = 50.sp

    Text( text = stringResource(R.string.puessi),
        color = myFontColor,
        fontSize = 70.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.W200,
        fontFamily = FontFamily.Serif,
        letterSpacing = 5.sp,
        lineHeight = tamanoFuente,
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.Center,
        maxLines = 10,
        minLines = 5,
        overflow = TextOverflow.Ellipsis
    )
}