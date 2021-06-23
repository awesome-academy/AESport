package com.suntraining.aesport.data.model

import com.google.gson.annotations.SerializedName

data class EventsTeamResponse(
    @SerializedName("results")
    val results: List<Event>,
)
