package com.example.anushmp.evalsub27092021

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("search")
    fun getResults(@Query("term") searchterm : String): Call<Response>

}