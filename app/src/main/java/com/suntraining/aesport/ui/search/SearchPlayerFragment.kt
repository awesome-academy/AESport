package com.suntraining.aesport.ui.search

import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.data.model.Player
import com.suntraining.aesport.databinding.FragmentSearchPlayerBinding
import com.suntraining.aesport.ui.search.adapter.PlayerAdapter
import com.suntraining.aesport.utils.hideKeyboard
import org.koin.androidx.viewmodel.ext.android.viewModel

class SearchPlayerFragment : BaseFragment<FragmentSearchPlayerBinding, SearchViewModel>() {

    private val playerAdapter = PlayerAdapter(::clickItemPlayer)

    override val layoutResource get() = R.layout.fragment_search_player
    override val viewModel: SearchViewModel by viewModel()

    override fun initViews() {
    }

    override fun initData() = with(viewBinding) {
        lifecycleOwner = viewLifecycleOwner
        searchVM = viewModel
        recyclerPlayers.adapter = playerAdapter
    }

    override fun initActions() = with(viewBinding) {
        buttonSearch.setOnClickListener {
            viewModel.getPlayersByKey(editSearch.text.toString())
            editSearch.hideKeyboard()
        }
    }

    private fun clickItemPlayer(player: Player) {
    }
}
