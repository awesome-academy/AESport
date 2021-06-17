package com.suntraining.aesport.data.source.remote

import com.suntraining.aesport.data.source.LeagueDataSource
import com.suntraining.aesport.data.source.remote.utils.ApiService

class LeagueRemoteDataSource(
    private val apiService: ApiService
) : LeagueDataSource.Remote {
    override suspend fun getLeaguesByCountry(country: String) =
        apiService.getLeaguesByCountry(country)

    override suspend fun getDetailLeague(idLeague: String) =
        apiService.getDetailLeague(idLeague)

    override suspend fun getEventsByLeague(idLeague: String) =
        apiService.getEventsInLeague(idLeague)
}
