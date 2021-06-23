package com.suntraining.aesport.ui.favoriteleague

import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.databinding.FragmentFavoriteLeagueBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class FavoriteLeagueFragment : BaseFragment<FragmentFavoriteLeagueBinding,
        FavoriteLeagueViewModel>() {

    override val layoutResource get() = R.layout.fragment_favorite_league
    override val viewModel: FavoriteLeagueViewModel by viewModel()

    override fun initViews() {
    }

    override fun initData() {
    }

    override fun initActions() {
    }

}
