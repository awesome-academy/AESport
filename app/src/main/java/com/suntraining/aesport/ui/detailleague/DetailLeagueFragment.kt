package com.suntraining.aesport.ui.detailleague

import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.data.model.Team
import com.suntraining.aesport.databinding.FragmentDetailLeagueBinding
import com.suntraining.aesport.ui.detailleague.adapter.EventAdapter
import com.suntraining.aesport.ui.detailleague.adapter.TeamAdapter
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class DetailLeagueFragment : BaseFragment<FragmentDetailLeagueBinding, DetailLeagueViewModel>() {

    private val teamsAdapter = TeamAdapter(this::clickItemTeam)
    private val eventsAdapter = EventAdapter()
    private val arg: DetailLeagueFragmentArgs by navArgs()

    override val layoutResource get() = R.layout.fragment_detail_league
    override val viewModel: DetailLeagueViewModel by sharedViewModel()

    override fun initViews() {
    }

    override fun initData() {
        viewModel.apply {
            getDetailLeague(arg.league.id.toString())
            checkFavorite(arg.league.id)
        }
        viewBinding.apply {
            lifecycleOwner = viewLifecycleOwner
            detailLeagueVM = viewModel
            recyclerTeams.adapter = teamsAdapter
            recyclerEvents.adapter = eventsAdapter
        }
    }

    override fun initActions() = with(viewBinding) {
        buttonFavorite.setOnClickListener {
            viewModel.insertLeague(arg.league)
        }
        buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun clickItemTeam(team: Team) {
    }
}
