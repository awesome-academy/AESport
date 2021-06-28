package com.suntraining.aesport.ui.detailplayer

import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.databinding.FragmentDetailPlayerBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailPlayerFragment : BaseFragment<FragmentDetailPlayerBinding, DetailPlayerViewModel>() {

    override val layoutResource = R.layout.fragment_detail_player
    override val viewModel: DetailPlayerViewModel by viewModel()
    override fun initViews() {
    }

    override fun initData() {
    }

    override fun initActions() {
    }

}
