package com.suntraining.aesport.data.model

import com.google.gson.annotations.SerializedName

data class EventResponse(
    @SerializedName("events") val events : List<Event>
)
