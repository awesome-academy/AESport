package com.suntraining.aesport.data.source.remote

import com.suntraining.aesport.data.source.TeamDataSource
import com.suntraining.aesport.data.source.remote.utils.ApiService

class TeamRemoteDataSource(
    private val apiService: ApiService,
) : TeamDataSource {
    override suspend fun getTeamsByLeague(idLeague: String) =
        apiService.getTeamsInLeague(idLeague)
}
