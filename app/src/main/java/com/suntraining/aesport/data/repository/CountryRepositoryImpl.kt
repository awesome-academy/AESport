package com.suntraining.aesport.data.repository

import com.suntraining.aesport.data.source.CountryDataSource

class CountryRepositoryImpl(
    private val remote: CountryDataSource
) : CountryRepository {
    override suspend fun getAllCountries() = remote.getAllCountries()
}
