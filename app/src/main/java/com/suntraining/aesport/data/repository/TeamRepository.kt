package com.suntraining.aesport.data.repository

import com.suntraining.aesport.data.model.TeamResponse

interface TeamRepository {
    suspend fun getTeamsByLeague(idLeague: String): TeamResponse
}
