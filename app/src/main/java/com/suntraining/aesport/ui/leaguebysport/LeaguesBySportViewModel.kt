package com.suntraining.aesport.ui.leaguebysport

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.suntraining.aesport.base.BaseViewModel
import com.suntraining.aesport.data.model.Leagues
import com.suntraining.aesport.data.repository.LeagueRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LeaguesBySportViewModel(
    private val repo: LeagueRepository,
) : BaseViewModel() {

    private val _leagues = MutableLiveData<List<Leagues>>()
    val leagues: LiveData<List<Leagues>>
        get() = _leagues
    var textTitle = MutableLiveData<String>()

    fun getLeaguesBySport(sport: String) {
        showLoading()
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val leaguesApi = repo.getLeaguesBySport(sport)
            _leagues.postValue(leaguesApi.leagues)
            hideLoading()
        }
    }
}
