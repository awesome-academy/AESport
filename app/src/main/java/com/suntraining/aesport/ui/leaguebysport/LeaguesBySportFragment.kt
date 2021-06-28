package com.suntraining.aesport.ui.leaguebysport

import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.data.model.Leagues
import com.suntraining.aesport.databinding.FragmentLeaguesBySportBinding
import com.suntraining.aesport.ui.home.adapter.LeagueAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class LeaguesBySportFragment :
    BaseFragment<FragmentLeaguesBySportBinding, LeaguesBySportViewModel>() {

    private val leaguesAdapter = LeagueAdapter(::onClickItem)
    private val arg: LeaguesBySportFragmentArgs by navArgs()

    override val layoutResource get() = R.layout.fragment_leagues_by_sport
    override val viewModel: LeaguesBySportViewModel by viewModel()

    override fun initViews() {
    }

    override fun initData() {
        viewModel.apply {
            getLeaguesBySport(arg.sport.strSport)
            textTitle.value = arg.sport.strSport
        }
        viewBinding.apply {
            lifecycleOwner = viewLifecycleOwner
            leaguesBySportVM = viewModel
            recyclerLeagues.adapter = leaguesAdapter
        }
    }

    override fun initActions() {
        viewBinding.buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun onClickItem(leagues: Leagues) {
        val action =
            LeaguesBySportFragmentDirections.actionLeaguesBySportFragmentToDetailLeagueFragment(
                leagues)
        findNavController().navigate(action)
    }
}
