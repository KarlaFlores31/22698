package com.example.a22698.persistencia

import android.provider.ContactsContract
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

@Preview(showBackground = true)
@Composable

fun ProfileView(){
    var nombre by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf(0) }
    var haspet by remember { mutableStateOf(false) }
    val context = LocalContext.current
    val preferences = Preferencias(context)
    val corrutina = rememberCoroutineScope()
    var nombreGuardado = preferences.name.collectAsState("")
    var edadGuardada = preferences.age.collectAsState(0)
    var haspetGuardado = preferences.hasPet.collectAsState(false)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Mi perfil")
        Text(text = "Mis datos guardados son hasta ahora son:")
        Text(text = nombreGuardado.value)
        Text(text = "${edadGuardada.value}" )
        Text(text = "${haspetGuardado.value}" )
        TextField(nombre, onValueChange = {nombre = it })
        TextField(edad.toString(), onValueChange = {
            if (it.isNotBlank() && it.toIntOrNull() != null){
                edad = it.toInt()
            }})
        Switch(checked = haspet, onCheckedChange = {
            haspet = it })

        Button(onClick = {
            corrutina.launch{
                preferences.guardarDatosPersonales(edad,nombre,haspet)
            }}) {
            Text(text = "Guardar")
        }
    }
}