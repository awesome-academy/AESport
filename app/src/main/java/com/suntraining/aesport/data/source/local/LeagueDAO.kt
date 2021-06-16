package com.suntraining.aesport.data.source.local

import androidx.room.*
import com.suntraining.aesport.data.model.Leagues

@Dao
interface LeagueDAO {
    @Query("SELECT * FROM leagues")
    suspend fun getSavedLeagues(): List<Leagues>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertLeague(leagues: Leagues)

    @Delete
    suspend fun deleteGame(leagues: Leagues)

    @Query("SELECT * FROM leagues WHERE id =:id")
    fun isFavorite(id: Long): Leagues
}
