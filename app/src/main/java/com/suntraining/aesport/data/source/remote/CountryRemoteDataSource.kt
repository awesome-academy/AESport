package com.suntraining.aesport.data.source.remote

import com.suntraining.aesport.data.source.CountryDataSource
import com.suntraining.aesport.data.source.remote.utils.ApiService

class CountryRemoteDataSource(
    private val apiService: ApiService
) : CountryDataSource {
    override suspend fun getAllCountries() = apiService.getAllCountries()
}
