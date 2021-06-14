package com.suntraining.aesport.data.source

import com.suntraining.aesport.data.model.SportResponse

interface SportDataSource {
    suspend fun getAllSport() : SportResponse
}
