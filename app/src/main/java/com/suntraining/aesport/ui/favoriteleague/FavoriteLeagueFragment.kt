package com.suntraining.aesport.ui.favoriteleague

import androidx.navigation.fragment.findNavController
import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.data.model.Leagues
import com.suntraining.aesport.databinding.FragmentFavoriteLeagueBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class FavoriteLeagueFragment : BaseFragment<FragmentFavoriteLeagueBinding,
        FavoriteLeagueViewModel>() {

    private val favoriteAdapter = FavoriteAdapter(::onItemClick, ::onDeleteClick)

    override val layoutResource get() = R.layout.fragment_favorite_league
    override val viewModel: FavoriteLeagueViewModel by viewModel()

    override fun initViews() {
    }

    override fun initData() {
        viewBinding.apply {
            lifecycleOwner = viewLifecycleOwner
            favoriteVM = viewModel
            recyclerFavorites.adapter = favoriteAdapter
        }
    }

    override fun initActions() {
    }

    private fun onDeleteClick(leagues: Leagues) {
        viewModel.deleteLeagueSaved(leagues)
    }

    private fun onItemClick(leagues: Leagues) {
        val action =
            FavoriteLeagueFragmentDirections.actionFavoriteFragmentToDetailLeagueFragment(leagues)
        findNavController().navigate(action)
    }
}
