package com.suntraining.aesport.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.suntraining.aesport.base.BaseViewModel
import com.suntraining.aesport.data.model.Player
import com.suntraining.aesport.data.model.Team
import com.suntraining.aesport.data.repository.PlayerRepository
import com.suntraining.aesport.data.repository.TeamRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SearchViewModel(
    private val teamRepo: TeamRepository,
    private val playerRepo: PlayerRepository,
) : BaseViewModel() {

    private val _teams = MutableLiveData<List<Team>>()
    val teams: LiveData<List<Team>>
        get() = _teams
    private val _players = MutableLiveData<List<Player>>()
    val players: LiveData<List<Player>>
        get() = _players

    fun getTeamsByKey(key: String) {
        showLoading()
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val teamsFromApi = teamRepo.getTeamsByKeyword(key)
            _teams.postValue(teamsFromApi.teams)
            hideLoading()
        }
    }

    fun getPlayersByKey(key: String) {
        showLoading()
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val playersFromApi = playerRepo.getPlayersByKeyword(key)
            _players.postValue(playersFromApi.player)
            hideLoading()
        }
    }
}
