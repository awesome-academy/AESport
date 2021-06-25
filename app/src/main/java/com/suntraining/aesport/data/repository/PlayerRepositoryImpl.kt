package com.suntraining.aesport.data.repository

import com.suntraining.aesport.data.source.PlayerDataSource

class PlayerRepositoryImpl(
    private val remote: PlayerDataSource,
) : PlayerRepository {
    override suspend fun getPlayersByKeyword(keyWord: String) =
        remote.getPlayersByKeyword(keyWord)
}
