package com.suntraining.aesport.ui.favoriteleague

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.suntraining.aesport.base.BaseViewModel
import com.suntraining.aesport.data.model.Leagues
import com.suntraining.aesport.data.repository.LeagueRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FavoriteLeagueViewModel(
    private val leagueRepo: LeagueRepository,
) : BaseViewModel() {

    private val _leagueSaved = MutableLiveData<List<Leagues>>()
    val leagueSaved: LiveData<List<Leagues>>
        get() = _leagueSaved

    init {
        getLeagueSaved()
    }

    private fun getLeagueSaved() {
        showLoading()
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val leagues = leagueRepo.getSavedLeagues()
            _leagueSaved.postValue(leagues)
            hideLoading()
        }
    }

    fun deleteLeagueSaved(leagues: Leagues) {
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            leagueRepo.deleteGame(leagues)
            getLeagueSaved()
        }
    }
}
