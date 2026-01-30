package com.example.a22698.componentes

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessibilityNew
import androidx.compose.material3.Icon
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a22698.R

@Preview(showBackground = true)
@Composable

fun Imagenes(){

    Column(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(R.drawable.gato_lanza_tomate),
            contentDescription = null,
            Modifier
                .size(250.dp)
                .clip(CircleShape),
            contentScale = ContentScale.FillBounds)
            Icon(imageVector = Icons.Default.AccessibilityNew,
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp))
            //Icon(painter = painterResource(R.drawable.baseline_cruelty_free),
              //  contentDescription = null,
                //tint = Color(color = 0xFFAD4747),
                //Modifier
                  //  .size(100.dp)
            //)

    }
}