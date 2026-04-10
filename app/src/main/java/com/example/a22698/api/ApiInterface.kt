package com.example.a22698.api

import android.media.Image
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("breeds/image/random")
    suspend fun imagenAleatoria(): Response<ImageRandom>


}