package com.suntraining.aesport.data.source.remote.utils

import com.suntraining.aesport.data.model.CountriesResponse
import com.suntraining.aesport.data.model.LeaguesResponse
import com.suntraining.aesport.data.model.SportResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    /**
     * List all sports: <a href="https://www.thesportsdb.com/api/v1/json/1/all_sports.php">https://www.thesportsdb.com/api/v1/json/1/all_sports.php</a>
     */
    @GET(APIConfig.BASE_SPORT)
    suspend fun getAllSport(): SportResponse

    /**
     * List all countries: <a href="https://www.thesportsdb.com/api/v1/json/1/all_countries.php">https://www.thesportsdb.com/api/v1/json/1/all_countries.php</a>
     */
    @GET(APIConfig.BASE_COUNTRY)
    suspend fun getAllCountries(): CountriesResponse

    /**
     * List league from sport: <a href="https://www.thesportsdb.com/api/v1/json/1/search_all_leagues.php?s=Soccer">https://www.thesportsdb.com/api/v1/json/1/search_all_leagues.php?s=Soccer</a>
     */
    @GET(APIConfig.BASE_LEAGUES)
    suspend fun getLeaguesBySport(
        @Query(APIConfig.PARAM_SPORT) sport : String
    ): LeaguesResponse

    /**
     * List all Leagues in a country: <a href="https://www.thesportsdb.com/api/v1/json/1/search_all_leagues.php?c=England">https://www.thesportsdb.com/api/v1/json/1/search_all_leagues.php?c=England</a>
     */
    @GET(APIConfig.BASE_LEAGUES)
    suspend fun getLeaguesByCountry(
        @Query(APIConfig.PARAM_COUNTRY) country : String
    ): LeaguesResponse
}
