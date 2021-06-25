package com.suntraining.aesport.data.source

import com.suntraining.aesport.data.model.PlayerResponse

interface PlayerDataSource {
    suspend fun getPlayersByKeyword(keyWord: String): PlayerResponse
}
