package com.suntraining.aesport.data.repository

import com.suntraining.aesport.data.model.Leagues
import com.suntraining.aesport.data.source.LeagueDataSource

class LeagueRepositoryImpl(
    private val remote: LeagueDataSource.Remote,
    private val local: LeagueDataSource.Local,
) : LeagueRepository {
    override suspend fun getLeaguesByCountry(country: String) =
        remote.getLeaguesByCountry(country)

    override suspend fun getDetailLeague(idLeague: String) =
        remote.getDetailLeague(idLeague)

    override suspend fun getEventsByLeague(idLeague: String) =
        remote.getEventsByLeague(idLeague)

    override suspend fun getLeaguesBySport(sport: String) =
        remote.getLeaguesBySport(sport)

    override suspend fun getSavedLeagues() =
        local.getSavedLeagues()

    override suspend fun insertLeague(leagues: Leagues) =
        local.insertLeague(leagues)

    override suspend fun deleteGame(leagues: Leagues) =
        local.deleteGame(leagues)

    override suspend fun isFavorite(id: Long) =
        local.isFavorite(id)
}
