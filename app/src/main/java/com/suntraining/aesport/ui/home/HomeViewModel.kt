package com.suntraining.aesport.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.viewModelScope
import com.suntraining.aesport.base.BaseViewModel
import com.suntraining.aesport.data.model.Countries
import com.suntraining.aesport.data.model.Leagues
import com.suntraining.aesport.data.model.Sports
import com.suntraining.aesport.data.repository.CountryRepository
import com.suntraining.aesport.data.repository.LeagueRepository
import com.suntraining.aesport.data.repository.SportRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(
    private val sportRepo: SportRepository,
    private val countryRepo: CountryRepository,
    private val leagueRepo: LeagueRepository,
) : BaseViewModel() {
    private val _sports = MutableLiveData<List<Sports>>()
    val sports: LiveData<List<Sports>>
        get() = _sports
    private val _countries = MutableLiveData<List<Countries>>()
    val countries: LiveData<List<Countries>>
        get() = _countries
    var countryName = MutableLiveData<String>()
    val leagueByCountry: LiveData<List<Leagues>>

    init {
        getSports()
        getCountries()
        leagueByCountry =
            Transformations.switchMap(countryName) {
                getLeagueByCountry(it)
            }
    }

    private fun getSports() {
        showLoading()
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val sportsApi = sportRepo.getAllSport()
            _sports.postValue(sportsApi.sports)
            hideLoading()
        }
    }

    private fun getCountries() {
        showLoading()
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val countriesApi = countryRepo.getAllCountries()
            _countries.postValue(countriesApi.countries)
            hideLoading()
        }
    }

    fun getLeagueByCountry(country: String): LiveData<List<Leagues>> {
        showLoading()
        val _leagueByCountry = MutableLiveData<List<Leagues>>()
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val leagueByCountryApi = leagueRepo.getLeaguesByCountry(country)
            _leagueByCountry.postValue(leagueByCountryApi.leagues)
            hideLoading()
        }
        return _leagueByCountry
    }
}
