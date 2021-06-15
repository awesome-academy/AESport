package com.suntraining.aesport.di

import com.suntraining.aesport.data.source.remote.utils.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    single { get<Retrofit>().create(ApiService::class.java) }
}
