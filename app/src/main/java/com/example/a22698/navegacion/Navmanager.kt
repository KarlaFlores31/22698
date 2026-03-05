package com.example.a22698.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Preview(showBackground = true)
@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController, startDestination = "inicio"){

    }
}