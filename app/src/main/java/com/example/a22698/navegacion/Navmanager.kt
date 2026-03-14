package com.example.a22698.navegacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable


@Serializable
object Home

@Serializable
object Reporte

@Serializable
data class ReportModel(val seccion : String, val numero : Int, val encargado : String)

@Preview(showBackground = true)
@Composable
fun NavManager(innerPadding : PaddingValues = PaddingValues(all = 16.dp)){
    val navController = rememberNavController()
    NavHost(navController, startDestination = Home, modifier = Modifier.padding(innerPadding)){

        composable <Home>{
            Homeview(navController)
        }
        composable <Reporte>{
            Reportview(navController)
        }
        composable <ReportModel>{
            val datos : ReportModel = it.toRoute()
            Pdfview(datos)
        }
    }
}

