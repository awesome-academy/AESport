package com.suntraining.aesport.data.source.local

import com.suntraining.aesport.data.model.Leagues
import com.suntraining.aesport.data.source.LeagueDataSource

class LeagueLocalDataSource(
    private val leagueDAO: LeagueDAO,
) : LeagueDataSource.Local {
    override suspend fun getSavedLeagues() =
        leagueDAO.getSavedLeagues()

    override suspend fun insertLeague(leagues: Leagues) =
        leagueDAO.insertLeague(leagues)

    override suspend fun deleteGame(leagues: Leagues) =
        leagueDAO.deleteGame(leagues)

    override suspend fun isFavorite(id: Long) =
        leagueDAO.isFavorite(id)
}
