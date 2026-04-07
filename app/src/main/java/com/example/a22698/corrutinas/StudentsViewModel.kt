package com.example.a22698.corrutinas

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Thread.sleep

class StudentsViewModel: ViewModel() {

    var winner by mutableStateOf("")
    var isLoading by mutableStateOf(false)
        private set
    var lista = mutableListOf<String>()
    init {
        lista = mutableListOf("Zuri","Beto","Fabi")
    }
    fun getWinner (){
        isLoading = true
        try {
            viewModelScope.launch {
                winner = ""
                changePerson()
            }
        }
        catch (e: Exception){
            Log.e("Error_Background", "Error en modulo studentsViewModel $e")
        }finally {
            isLoading = false
        }
    }

    suspend fun changePerson(){
        withContext(Dispatchers.IO){
            isLoading = true
            sleep(5000)
            winner = "Zuri Grillo"
            isLoading = false
        }
    }
}