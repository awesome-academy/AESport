package com.suntraining.aesport

import android.app.Application
import com.suntraining.aesport.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(
                listOf(
                    dbLocalModule,
                    repositoryModule,
                    apiModule,
                    networkModule,
                    viewModelModule
                )
            )
        }
    }
}
