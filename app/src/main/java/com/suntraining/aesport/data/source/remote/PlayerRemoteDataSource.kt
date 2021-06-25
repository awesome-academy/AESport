package com.suntraining.aesport.data.source.remote

import com.suntraining.aesport.data.source.PlayerDataSource
import com.suntraining.aesport.data.source.remote.utils.ApiService

class PlayerRemoteDataSource(
    private val apiService: ApiService,
) : PlayerDataSource {
    override suspend fun getPlayersByKeyword(keyWord: String) =
        apiService.getPlayersByKeyword(keyWord)
}
