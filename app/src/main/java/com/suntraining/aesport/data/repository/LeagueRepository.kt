package com.suntraining.aesport.data.repository

import com.suntraining.aesport.data.model.LeaguesResponse

interface LeagueRepository {
    suspend fun getLeaguesByCountry(country: String): LeaguesResponse
}
