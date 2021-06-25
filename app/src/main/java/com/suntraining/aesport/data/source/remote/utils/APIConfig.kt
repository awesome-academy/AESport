package com.suntraining.aesport.data.source.remote.utils

object APIConfig {

    const val BASE_URL = "https://www.thesportsdb.com/api/v1/json/1/"
    const val BASE_COUNTRY = "all_countries.php"
    const val BASE_SPORT = "all_sports.php"
    const val BASE_LEAGUES = "search_all_leagues.php"
    const val BASE_DETAIL_LEAGUE = "lookupleague.php"
    const val BASE_TEAMS = "lookup_all_teams.php"
    const val BASE_EVENTS = "eventspastleague.php"
    const val BASE_DETAIL_TEAM = "lookupteam.php"
    const val BASE_EVENTS_TEAM = "eventslast.php"
    const val BASE_SEARCH_TEAM = "searchteams.php"
    const val BASE_SEARCH_PLAYER = "searchplayers.php"

    const val PARAM_SPORT = "s"
    const val PARAM_COUNTRY = "c"
    const val PARAM_TEAM = "t"
    const val PARAM_PLAYER = "p"
    const val PARAM_ID = "id"
}
