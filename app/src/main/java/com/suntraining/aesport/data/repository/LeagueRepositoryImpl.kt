package com.suntraining.aesport.data.repository

import com.suntraining.aesport.data.source.LeagueDataSource

class LeagueRepositoryImpl(
    private val remote: LeagueDataSource.Remote
) : LeagueRepository {
    override suspend fun getLeaguesByCountry(country: String) = remote.getLeaguesByCountry(country)
}
