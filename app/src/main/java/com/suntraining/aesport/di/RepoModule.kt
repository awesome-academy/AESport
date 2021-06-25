package com.suntraining.aesport.di

import androidx.room.Room
import com.suntraining.aesport.data.repository.*
import com.suntraining.aesport.data.source.*
import com.suntraining.aesport.data.source.local.AppDatabase
import com.suntraining.aesport.data.source.local.AppDatabase.Companion.DATABASE_NAME
import com.suntraining.aesport.data.source.local.LeagueLocalDataSource
import com.suntraining.aesport.data.source.remote.*
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
    single { get<AppDatabase>().leagueDao() }
}

val repositoryModule = module {
    single<SportDataSource> { SportRemoteDataSource(get()) }
    single<SportRepository> { SportRepositoryImpl(get()) }
    single<CountryDataSource> { CountryRemoteDataSource(get()) }
    single<CountryRepository> { CountryRepositoryImpl(get()) }
    single<LeagueDataSource.Remote> { LeagueRemoteDataSource(get()) }
    single<LeagueDataSource.Local> { LeagueLocalDataSource(get()) }
    single<LeagueRepository> { LeagueRepositoryImpl(get(), get()) }
    single<TeamDataSource> { TeamRemoteDataSource(get()) }
    single<TeamRepository> { TeamRepositoryImpl(get()) }
    single<PlayerDataSource> { PlayerRemoteDataSource(get()) }
    single<PlayerRepository> { PlayerRepositoryImpl(get()) }
}
