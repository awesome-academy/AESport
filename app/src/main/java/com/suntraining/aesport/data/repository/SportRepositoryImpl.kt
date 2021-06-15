package com.suntraining.aesport.data.repository

import com.suntraining.aesport.data.source.SportDataSource

class SportRepositoryImpl(
    private val remote: SportDataSource
) : SportRepository {
    override suspend fun getAllSport() = remote.getAllSport()
}
