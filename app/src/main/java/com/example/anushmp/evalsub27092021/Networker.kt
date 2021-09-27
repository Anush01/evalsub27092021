package com.example.anushmp.evalsub27092021

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Networker {

    companion object {

        val baseurl = "https://itunes.apple.com/"

        private val httplogger = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

        fun getRetrofit(): Retrofit{

            return Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(OkHttpClient.Builder().addInterceptor(httplogger).build())
                .build()

        }

    }

}