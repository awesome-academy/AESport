package com.suntraining.aesport.ui.leaguebysport

import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.databinding.FragmentLeaguesBySportBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class LeaguesBySportFragment :
    BaseFragment<FragmentLeaguesBySportBinding, LeaguesBySportViewModel>() {

    override val layoutResource get() = R.layout.fragment_leagues_by_sport
    override val viewModel: LeaguesBySportViewModel by viewModel()

    override fun initViews() {
    }

    override fun initData() {
    }

    override fun initActions() {
    }

}
