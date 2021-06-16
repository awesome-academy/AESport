package com.suntraining.aesport.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseAdapter
import com.suntraining.aesport.base.BaseViewHolder
import com.suntraining.aesport.data.model.Sports
import com.suntraining.aesport.databinding.ItemSportBinding

class SportAdapter(
    private val onItemClick: (Sports) -> Unit
) : BaseAdapter<Sports, SportAdapter.SportViewHolder>(Sports.diffUtil) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = SportViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_sport,
            parent,
            false
        ), onItemClick
    )

    class SportViewHolder(
        private val viewBinding: ItemSportBinding,
        onItemClick: (Sports) -> Unit
    ) : BaseViewHolder<Sports>(viewBinding, onItemClick) {
        override fun bindData(item: Sports) {
            super.bindData(item)
            viewBinding.sport = item
        }
    }
}
