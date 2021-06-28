package com.suntraining.aesport.data.source

import com.suntraining.aesport.data.model.DetailLeagueResponse
import com.suntraining.aesport.data.model.EventResponse
import com.suntraining.aesport.data.model.Leagues
import com.suntraining.aesport.data.model.LeaguesResponse

interface LeagueDataSource {
    interface Remote {
        suspend fun getLeaguesByCountry(country: String): LeaguesResponse
        suspend fun getDetailLeague(idLeague: String): DetailLeagueResponse
        suspend fun getEventsByLeague(idLeague: String): EventResponse
        suspend fun getLeaguesBySport(sport: String): LeaguesResponse
    }

    interface Local {
        suspend fun getSavedLeagues(): List<Leagues>
        suspend fun insertLeague(leagues: Leagues)
        suspend fun deleteGame(leagues: Leagues)
        suspend fun isFavorite(id: Long): Leagues
    }
}
