package com.suntraining.aesport.ui.search

import androidx.navigation.fragment.findNavController
import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.data.model.Team
import com.suntraining.aesport.databinding.FragmentSearchTeamBinding
import com.suntraining.aesport.ui.detailleague.adapter.TeamAdapter
import com.suntraining.aesport.utils.hideKeyboard
import org.koin.androidx.viewmodel.ext.android.viewModel

class SearchTeamFragment : BaseFragment<FragmentSearchTeamBinding, SearchViewModel>() {

    private val teamAdapter = TeamAdapter(::onCLickItemTeam)

    override val layoutResource get() = R.layout.fragment_search_team
    override val viewModel: SearchViewModel by viewModel()

    override fun initViews() {
    }

    override fun initData() = with(viewBinding) {
        lifecycleOwner = viewLifecycleOwner
        searchVM = viewModel
        recyclerTeams.adapter = teamAdapter
    }

    override fun initActions() = with(viewBinding) {
        buttonSearch.setOnClickListener {
            viewModel.getTeamsByKey(editSearch.text.toString())
            editSearch.hideKeyboard()
        }
    }

    private fun onCLickItemTeam(team: Team) {
        val action =
            SearchFragmentDirections.actionSearchFragmentToDetailTeamFragment(team)
        findNavController().navigate(action)
    }
}
