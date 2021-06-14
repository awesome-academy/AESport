package com.suntraining.aesport.data.source

import com.suntraining.aesport.data.model.LeaguesResponse

interface LeagueDataSource {
    interface Remote {
        suspend fun getLeaguesByCountry(country: String): LeaguesResponse
    }
}
