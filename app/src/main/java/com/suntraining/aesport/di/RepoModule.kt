package com.suntraining.aesport.di

import androidx.room.Room
import com.suntraining.aesport.data.source.local.AppDatabase
import com.suntraining.aesport.data.source.local.AppDatabase.Companion.DATABASE_NAME

import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dbLocalModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            AppDatabase::class.java,
            DATABASE_NAME
        ).build()
    }
}

val repositoryModule = module {
}
