package com.suntraining.aesport.data.repository

import com.suntraining.aesport.data.model.EventsTeamResponse
import com.suntraining.aesport.data.model.TeamResponse

interface TeamRepository {
    suspend fun getTeamsByLeague(idLeague: String): TeamResponse
    suspend fun getDetailTeam(idTeam: String): TeamResponse
    suspend fun getEventsByTeam(idTeam: String): EventsTeamResponse
    suspend fun getTeamsByKeyword(key: String): TeamResponse
}
