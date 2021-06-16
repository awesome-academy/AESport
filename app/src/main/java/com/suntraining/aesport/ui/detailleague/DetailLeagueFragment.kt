package com.suntraining.aesport.ui.detailleague

import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.databinding.FragmentDetailLeagueBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailLeagueFragment : BaseFragment<FragmentDetailLeagueBinding, DetailLeagueViewModel>() {

    override val layoutResource get() = R.layout.fragment_detail_league
    override val viewModel: DetailLeagueViewModel by viewModel()

    override fun initViews() {
    }

    override fun initData() {
    }

    override fun initActions() {
    }

}
