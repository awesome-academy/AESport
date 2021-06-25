package com.suntraining.aesport.data.source.remote

import com.suntraining.aesport.data.source.TeamDataSource
import com.suntraining.aesport.data.source.remote.utils.ApiService

class TeamRemoteDataSource(
    private val apiService: ApiService,
) : TeamDataSource {
    override suspend fun getTeamsByLeague(idLeague: String) =
        apiService.getTeamsInLeague(idLeague)

    override suspend fun getDetailTeam(idTeam: String) =
        apiService.getDetailTeam(idTeam)

    override suspend fun getEventsByTeam(idTeam: String) =
        apiService.getEventsByTeam(idTeam)

    override suspend fun getTeamsByKeyword(key: String) =
        apiService.getTeamsByKeyword(key)
}
