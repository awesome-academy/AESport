package com.suntraining.aesport.data.source.remote.utils

import com.suntraining.aesport.data.model.*
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
        @Query(APIConfig.PARAM_SPORT) sport: String,
    ): LeaguesResponse

    /**
     * List all Leagues in a country: <a href="https://www.thesportsdb.com/api/v1/json/1/search_all_leagues.php?c=England">https://www.thesportsdb.com/api/v1/json/1/search_all_leagues.php?c=England</a>
     */
    @GET(APIConfig.BASE_LEAGUES)
    suspend fun getLeaguesByCountry(
        @Query(APIConfig.PARAM_COUNTRY) country: String,
    ): LeaguesResponse

    /**
     * League Details by Id: <a href="https://www.thesportsdb.com/api/v1/json/1/lookupleague.php?id=4346">https://www.thesportsdb.com/api/v1/json/1/lookupleague.php?id=4346</a>
     */
    @GET(APIConfig.BASE_DETAIL_LEAGUE)
    suspend fun getDetailLeague(
        @Query(APIConfig.PARAM_ID) idLeague: String,
    ): DetailLeagueResponse

    /**
     * List All teams details in a league by Id:
     * <a href="https://www.thesportsdb.com/api/v1/json/1/lookup_all_teams.php?id=4328">https://www.thesportsdb.com/api/v1/json/1/lookup_all_teams.php?id=4328</a>
     */
    @GET(APIConfig.BASE_TEAMS)
    suspend fun getTeamsInLeague(
        @Query(APIConfig.PARAM_ID) idLeague: String,
    ): TeamResponse

    /**
     * Last 15 Events by League Id:
     * <a href="https://www.thesportsdb.com/api/v1/json/1/eventspastleague.php?id=4328">https://www.thesportsdb.com/api/v1/json/1/eventspastleague.php?id=4328</a>
     */
    @GET(APIConfig.BASE_EVENTS)
    suspend fun getEventsInLeague(
        @Query(APIConfig.PARAM_ID) idLeague: String,
    ): EventResponse

    /**
     * Team Details by Id
     * <a href="https://www.thesportsdb.com/api/v1/json/1/lookupteam.php?id=133604">https://www.thesportsdb.com/api/v1/json/1/lookupteam.php?id=133604</a>
     */
    @GET(APIConfig.BASE_DETAIL_TEAM)
    suspend fun getDetailTeam(
        @Query(APIConfig.PARAM_ID) idTeam: String,
    ): TeamResponse

    /**
     * Last 5 Events by Team Id
     * <a href="https://www.thesportsdb.com/api/v1/json/1/eventslast.php?id=133602">https://www.thesportsdb.com/api/v1/json/1/eventslast.php?id=133602</a>
     */
    @GET(APIConfig.BASE_EVENTS_TEAM)
    suspend fun getEventsByTeam(
        @Query(APIConfig.PARAM_ID) idTeam: String,
    ): EventsTeamResponse

    /**
     * Search for players by name
     * <a href="https://www.thesportsdb.com/api/v1/json/1/searchplayers.php?p=Danny%20Welbeck">https://www.thesportsdb.com/api/v1/json/1/searchplayers.php?p=Danny%20Welbeck</a>
     */
    @GET(APIConfig.BASE_SEARCH_PLAYER)
    suspend fun getPlayersByKeyword(
        @Query(APIConfig.PARAM_PLAYER) keyWord: String,
    ): PlayerResponse

    /**
     * Search for team by name
     * <a href="https://www.thesportsdb.com/api/v1/json/1/searchteams.php?t=Arsenal">https://www.thesportsdb.com/api/v1/json/1/searchteams.php?t=Arsenal</a>
     */
    @GET(APIConfig.BASE_SEARCH_TEAM)
    suspend fun getTeamsByKeyword(
        @Query(APIConfig.PARAM_TEAM) keyWord: String,
    ): TeamResponse
}
