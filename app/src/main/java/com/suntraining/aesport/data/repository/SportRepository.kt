package com.suntraining.aesport.data.repository

import com.suntraining.aesport.data.model.SportResponse

interface SportRepository {
    suspend fun getAllSport() : SportResponse
}
