package com.suntraining.aesport.ui.favoriteleague

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseAdapter
import com.suntraining.aesport.base.BaseViewHolder
import com.suntraining.aesport.data.model.Leagues
import com.suntraining.aesport.databinding.ItemFavoriteLeagueBinding

class FavoriteAdapter(
    private val onItemClick: (Leagues) -> Unit,
    private val onDeleteClick: (Leagues) -> Unit,
) : BaseAdapter<Leagues, FavoriteAdapter.FavoriteViewHolder>(Leagues.diffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        FavoriteViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_favorite_league,
                parent,
                false
            ), onItemClick, onDeleteClick
        )

    class FavoriteViewHolder(
        private val viewBinding: ItemFavoriteLeagueBinding,
        onItemClick: (Leagues) -> Unit,
        onDeleteClick: (Leagues) -> Unit,
    ) : BaseViewHolder<Leagues>(viewBinding, onItemClick) {

        init {
            viewBinding.imageLeague.setOnClickListener {
                item?.let(onDeleteClick)
            }
        }

        override fun bindData(item: Leagues) {
            super.bindData(item)
            viewBinding.league = item
        }
    }
}
