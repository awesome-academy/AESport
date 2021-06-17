package com.suntraining.aesport.ui.detailleague.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseAdapter
import com.suntraining.aesport.base.BaseViewHolder
import com.suntraining.aesport.data.model.Event
import com.suntraining.aesport.databinding.ItemEventBinding

class EventAdapter : BaseAdapter<Event, EventAdapter.EventViewHolder>(Event.diffUtil) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ) = EventViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_event,
            parent,
            false
        )
    )

    class EventViewHolder(
        private val viewBinding: ItemEventBinding,
    ) : BaseViewHolder<Event>(viewBinding, {}) {
        override fun bindData(item: Event) {
            super.bindData(item)
            viewBinding.event = item
        }
    }
}
