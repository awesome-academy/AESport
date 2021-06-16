package com.suntraining.aesport.ui.home

import android.view.View
import android.widget.AdapterView
import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.data.model.Countries
import com.suntraining.aesport.data.model.Leagues
import com.suntraining.aesport.data.model.Sports
import com.suntraining.aesport.databinding.FragmentHomeBinding
import com.suntraining.aesport.ui.home.adapter.LeagueAdapter
import com.suntraining.aesport.ui.home.adapter.SportAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    private var country: Countries? = null
    private val sportAdapter = SportAdapter(this::clickItemSport)
    private val leagueAdapter = LeagueAdapter(this::clickItemLeague)

    override val layoutResource get() = R.layout.fragment_home
    override val viewModel: HomeViewModel by viewModel()

    override fun initViews() {
        viewBinding.recyclerLeagues.adapter = leagueAdapter
    }

    override fun initData() {
        viewBinding.apply {
            lifecycleOwner = viewLifecycleOwner
            homeVM = viewModel
            recyclerSports.adapter = sportAdapter
        }
    }

    override fun initActions() {
        viewBinding.spinnerCountries.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long,
                ) {
                    country = parent?.getItemAtPosition(position) as Countries?
                    country?.let {
                        viewModel.countryName.value = it.name
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
    }

    private fun clickItemSport(sports: Sports) {
    }

    private fun clickItemLeague(leagues: Leagues) {
    }
}
