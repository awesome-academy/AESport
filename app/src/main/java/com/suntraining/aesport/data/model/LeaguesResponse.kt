package com.suntraining.aesport.data.model

import com.google.gson.annotations.SerializedName

data class LeaguesResponse(
    @SerializedName("countrys")
    val leagues: List<Leagues>
)
