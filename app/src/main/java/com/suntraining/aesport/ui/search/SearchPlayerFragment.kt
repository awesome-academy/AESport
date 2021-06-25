package com.suntraining.aesport.ui.search

import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.databinding.FragmentSearchPlayerBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SearchPlayerFragment : BaseFragment<FragmentSearchPlayerBinding, SearchViewModel>() {

    override val layoutResource get() = R.layout.fragment_search_player
    override val viewModel: SearchViewModel by viewModel()

    override fun initViews() {
    }

    override fun initData() {
    }

    override fun initActions() {
    }

}
