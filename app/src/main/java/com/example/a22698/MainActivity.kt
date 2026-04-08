package com.example.a22698

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
// import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
// import androidx.compose.material3.Text
// import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
// import androidx.compose.ui.tooling.preview.Preview
import com.example.a22698.actividad4.MercadoNav
// import com.example.a22698.actividad3.EdadNavManager
// import com.example.a22698.listas.Listvista
// import com.example.a22698.navegacion.NavManager
// import com.example.a22698.persistencia.ProfileView
import com.example.a22698.ui.theme._22698Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _22698Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    /*Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/

                    // ProfileView()
                    MercadoNav(innerPadding = innerPadding)
                    // EdadNavManager(innerPadding = innerPadding)
                }
            }
        }
    }
}
/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _22698Theme {
        Greeting("Android")
    }
}

 */
