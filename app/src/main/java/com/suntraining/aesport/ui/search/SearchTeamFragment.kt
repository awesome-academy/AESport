package com.suntraining.aesport.ui.search

import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.databinding.FragmentSearchTeamBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SearchTeamFragment : BaseFragment<FragmentSearchTeamBinding, SearchViewModel>() {

    override val layoutResource get() = R.layout.fragment_search_team
    override val viewModel: SearchViewModel by viewModel()

    override fun initViews() {
    }

    override fun initData() {
    }

    override fun initActions() {
    }

}
