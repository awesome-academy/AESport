package com.suntraining.aesport.data.repository

import com.suntraining.aesport.data.source.TeamDataSource

class TeamRepositoryImpl(
    private val remote: TeamDataSource,
) : TeamRepository {
    override suspend fun getTeamsByLeague(idLeague: String) =
        remote.getTeamsByLeague(idLeague)
}
