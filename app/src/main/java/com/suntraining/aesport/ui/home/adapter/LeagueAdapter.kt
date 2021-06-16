package com.suntraining.aesport.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseAdapter
import com.suntraining.aesport.base.BaseViewHolder
import com.suntraining.aesport.data.model.Leagues
import com.suntraining.aesport.databinding.ItemLeagueBinding

class LeagueAdapter(
    private val onItemClick: (Leagues) -> Unit,
) : BaseAdapter<Leagues, LeagueAdapter.LeaguesViewHolder>(Leagues.diffUtil) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ) = LeaguesViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_league,
            parent,
            false
        ), onItemClick
    )

    class LeaguesViewHolder(
        private val viewBinding: ItemLeagueBinding,
        onItemClick: (Leagues) -> Unit,
    ) : BaseViewHolder<Leagues>(viewBinding, onItemClick) {
        override fun bindData(item: Leagues) {
            super.bindData(item)
            viewBinding.league = item
        }
    }
}
