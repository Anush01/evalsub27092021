package com.example.anushmp.evalsub27092021

import com.google.gson.annotations.SerializedName

data class Response(

    @SerializedName("resultCount") val resultCount : Int,
    @SerializedName("results") val results : List<Results>

)