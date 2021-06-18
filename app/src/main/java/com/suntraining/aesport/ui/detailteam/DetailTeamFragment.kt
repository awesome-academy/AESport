package com.suntraining.aesport.ui.detailteam

import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.databinding.FragmentDetailTeamBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailTeamFragment : BaseFragment<FragmentDetailTeamBinding, DetailTeamViewModel>() {

    override val layoutResource get() = R.layout.fragment_detail_team
    override val viewModel: DetailTeamViewModel by viewModel()

    override fun initViews() {
    }

    override fun initData() {
    }

    override fun initActions() {
    }

}
