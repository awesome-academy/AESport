package com.suntraining.aesport.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.suntraining.aesport.data.model.Leagues
import com.suntraining.aesport.data.source.local.AppDatabase.Companion.DATABASE_VERSION
import com.suntraining.aesport.data.source.local.AppDatabase.Companion.EXPORT_SCHEME

@Database(
    entities = [Leagues::class],
    version = DATABASE_VERSION,
    exportSchema = EXPORT_SCHEME
)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        const val DATABASE_NAME = "AESport"
        const val DATABASE_VERSION = 1
        const val EXPORT_SCHEME = false
    }
}
