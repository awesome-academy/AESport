package com.suntraining.aesport.ui.detailleague.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseAdapter
import com.suntraining.aesport.base.BaseViewHolder
import com.suntraining.aesport.data.model.Team
import com.suntraining.aesport.databinding.ItemTeamBinding

class TeamAdapter(
    private val onItemClick: (Team) -> Unit,
) : BaseAdapter<Team, TeamAdapter.TeamViewHolder>(Team.diffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        TeamViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_team,
                parent,
                false
            ), onItemClick
        )

    class TeamViewHolder(
        private val viewBinding: ItemTeamBinding,
        onItemClick: (Team) -> Unit,
    ) : BaseViewHolder<Team>(viewBinding, onItemClick) {
        override fun bindData(item: Team) {
            super.bindData(item)
            viewBinding.team = item
        }
    }
}
