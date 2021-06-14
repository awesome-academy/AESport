package com.suntraining.aesport.data.source

import com.suntraining.aesport.data.model.CountriesResponse

interface CountryDataSource {
    suspend fun getAllCountries() : CountriesResponse
}
