package com.suntraining.aesport.data.source

import com.suntraining.aesport.data.model.EventsTeamResponse
import com.suntraining.aesport.data.model.TeamResponse

interface TeamDataSource {
    suspend fun getTeamsByLeague(idLeague: String) : TeamResponse
    suspend fun getDetailTeam(idTeam : String) : TeamResponse
    suspend fun getEventsByTeam(idTeam: String) : EventsTeamResponse
}
