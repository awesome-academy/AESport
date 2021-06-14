package com.suntraining.aesport.data.model

import com.google.gson.annotations.SerializedName

data class CountriesResponse (
    @SerializedName("countries")
    val countries : List<Countries>
)
