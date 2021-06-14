package com.suntraining.aesport.data.model

import com.google.gson.annotations.SerializedName

data class SportResponse(
    @SerializedName("sports")
    var sports: List<Sports>
)
