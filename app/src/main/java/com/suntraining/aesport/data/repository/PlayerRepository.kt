package com.suntraining.aesport.data.repository

import com.suntraining.aesport.data.model.PlayerResponse

interface PlayerRepository {
    suspend fun getPlayersByKeyword(keyWord: String): PlayerResponse
}
