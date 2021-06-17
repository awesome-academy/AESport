package com.suntraining.aesport.data.source

import com.suntraining.aesport.data.model.TeamResponse

interface TeamDataSource {
    suspend fun getTeamsByLeague(idLeague: String) : TeamResponse
}
