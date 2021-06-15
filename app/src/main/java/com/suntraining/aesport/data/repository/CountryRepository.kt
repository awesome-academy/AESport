package com.suntraining.aesport.data.repository

import com.suntraining.aesport.data.model.CountriesResponse

interface CountryRepository {
    suspend fun getAllCountries() : CountriesResponse
}
