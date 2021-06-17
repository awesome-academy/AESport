package com.suntraining.aesport.di

import com.suntraining.aesport.ui.detailleague.DetailLeagueViewModel
import com.suntraining.aesport.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(get(), get(), get()) }
    viewModel { DetailLeagueViewModel(get(), get()) }
}
