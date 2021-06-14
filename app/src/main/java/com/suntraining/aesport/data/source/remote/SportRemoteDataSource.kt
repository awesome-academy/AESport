package com.suntraining.aesport.data.source.remote

import com.suntraining.aesport.data.source.SportDataSource
import com.suntraining.aesport.data.source.remote.utils.ApiService

class SportRemoteDataSource(
    private val apiService: ApiService
) : SportDataSource {
    override suspend fun getAllSport() = apiService.getAllSport()
}
