package com.suntraining.aesport.ui.search.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseAdapter
import com.suntraining.aesport.base.BaseViewHolder
import com.suntraining.aesport.data.model.Player
import com.suntraining.aesport.databinding.ItemPlayerBinding

class PlayerAdapter(
    private val onItemClick: (Player) -> Unit,
) : BaseAdapter<Player, PlayerAdapter.PlayerViewHolder>(Player.diffUtil) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ) = PlayerViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_player,
            parent,
            false
        ), onItemClick
    )

    class PlayerViewHolder(
        private val viewBinding: ItemPlayerBinding,
        onItemClick: (Player) -> Unit,
    ) : BaseViewHolder<Player>(viewBinding, onItemClick) {

        override fun bindData(item: Player) {
            super.bindData(item)
            viewBinding.player = item
        }
    }
}
