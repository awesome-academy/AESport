package com.suntraining.aesport.ui.detailleague

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.suntraining.aesport.base.BaseViewModel
import com.suntraining.aesport.data.model.DetailLeague
import com.suntraining.aesport.data.model.Event
import com.suntraining.aesport.data.model.Leagues
import com.suntraining.aesport.data.model.Team
import com.suntraining.aesport.data.repository.LeagueRepository
import com.suntraining.aesport.data.repository.TeamRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailLeagueViewModel(
    private val leagueRepo: LeagueRepository,
    private val teamRepo: TeamRepository,
) : BaseViewModel() {

    private val _detail = MutableLiveData<List<DetailLeague>>()
    val detail: LiveData<List<DetailLeague>>
        get() = _detail
    private val _teams = MutableLiveData<List<Team>>()
    val teams: LiveData<List<Team>>
        get() = _teams
    private val _events = MutableLiveData<List<Event>>()
    val events: LiveData<List<Event>>
        get() = _events
    private val _isFavorite = MutableLiveData<Boolean>()
    val isFavorite: LiveData<Boolean>
        get() = _isFavorite

    fun getDetailLeague(id: String) {
        showLoading()
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val detailLeagueApi = leagueRepo.getDetailLeague(id)
            getTeamsInLeague(id)
            getEventsInLeague(id)
            _detail.postValue(detailLeagueApi.leagues)
            hideLoading()
        }
    }

    private fun getTeamsInLeague(id: String) {
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val teamsInLeagueApi = teamRepo.getTeamsByLeague(id)
            _teams.postValue(teamsInLeagueApi.teams)
        }
    }

    private fun getEventsInLeague(id: String) {
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val eventsApi = leagueRepo.getEventsByLeague(id)
            _events.postValue(eventsApi.events)
        }
    }

    fun checkFavorite(id: Long) {
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val leagueFavorite = leagueRepo.isFavorite(id)
            _isFavorite.postValue(leagueFavorite != null)
        }
    }

    fun insertLeague(leagues: Leagues) {
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            if (isFavorite.value == true) {
                leagueRepo.deleteGame(leagues)
                _isFavorite.postValue(false)
            } else {
                leagueRepo.insertLeague(leagues)
                _isFavorite.postValue(true)
            }
        }
    }
}
