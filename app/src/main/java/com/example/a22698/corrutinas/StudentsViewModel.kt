package com.example.a22698.corrutinas

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import java.lang.Thread.sleep

class StudentsViewModel {

    var winner by mutableStateOf("")

    fun getWinner (){
        winner = ""
        sleep(5000)
        winner = "Zuri Grillo"
    }
}