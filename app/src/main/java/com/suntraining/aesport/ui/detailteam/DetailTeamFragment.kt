package com.suntraining.aesport.ui.detailteam

import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.databinding.FragmentDetailTeamBinding
import com.suntraining.aesport.ui.detailleague.adapter.EventAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailTeamFragment : BaseFragment<FragmentDetailTeamBinding, DetailTeamViewModel>() {

    private val eventsAdapter = EventAdapter()
    private val arg: DetailTeamFragmentArgs by navArgs()

    override val layoutResource get() = R.layout.fragment_detail_team
    override val viewModel: DetailTeamViewModel by viewModel()

    override fun initViews() {
    }

    override fun initData() {
        viewModel.getDetailTeam(arg.team.id)
        viewBinding.apply {
            lifecycleOwner = viewLifecycleOwner
            detailTeamVM = viewModel
            recyclerEvents.adapter = eventsAdapter
        }
    }

    override fun initActions() {
        viewBinding.buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}
