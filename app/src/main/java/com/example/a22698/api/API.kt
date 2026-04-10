package com.example.a22698.api

class API {
    private val service = RetrofitHelper.getRetrofitService()

    suspend fun getImageAleatoria(): String{
        val response =
            service.imagenAleatoria()

        val msg: String
        if (response.body()?.status.equals("success")) {
            msg = response.body()?.message ?: ""
        }else{
            msg = "Fail"
        }
        return msg
    }
}

