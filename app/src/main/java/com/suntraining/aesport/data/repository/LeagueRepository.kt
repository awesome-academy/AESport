package com.suntraining.aesport.data.repository

import com.suntraining.aesport.data.model.DetailLeagueResponse
import com.suntraining.aesport.data.model.EventResponse
import com.suntraining.aesport.data.model.Leagues
import com.suntraining.aesport.data.model.LeaguesResponse

interface LeagueRepository {
    suspend fun getLeaguesByCountry(country: String): LeaguesResponse
    suspend fun getDetailLeague(idLeague: String): DetailLeagueResponse
    suspend fun getEventsByLeague(idLeague: String): EventResponse
    suspend fun getSavedLeagues(): List<Leagues>
    suspend fun insertLeague(leagues: Leagues)
    suspend fun deleteGame(leagues: Leagues)
    suspend fun isFavorite(id: Long): Leagues
}
