package com.suntraining.aesport.data.model

import com.google.gson.annotations.SerializedName

data class DetailLeagueResponse(
    @SerializedName("leagues")
    val leagues: List<DetailLeague>,
)
