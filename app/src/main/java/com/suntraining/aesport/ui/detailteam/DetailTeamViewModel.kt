package com.suntraining.aesport.ui.detailteam

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.suntraining.aesport.base.BaseViewModel
import com.suntraining.aesport.data.model.Event
import com.suntraining.aesport.data.model.Team
import com.suntraining.aesport.data.repository.TeamRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailTeamViewModel(
    private val teamRepo: TeamRepository,
) : BaseViewModel() {

    private val _detailTeam = MutableLiveData<List<Team>>()
    val detailTeam: LiveData<List<Team>>
        get() = _detailTeam
    private val _events = MutableLiveData<List<Event>>()
    val events: LiveData<List<Event>>
        get() = _events

    fun getDetailTeam(id: String) {
        showLoading()
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val detailTeamApi = teamRepo.getDetailTeam(id)
            getEventsByTeam(id)
            _detailTeam.postValue(detailTeamApi.teams)
            hideLoading()
        }
    }

    private fun getEventsByTeam(id: String) {
        viewModelScope.launch(Dispatchers.IO + exceptionHandler) {
            val eventsApi = teamRepo.getEventsByTeam(id)
            _events.postValue(eventsApi.results)
            hideLoading()
        }
    }
}
