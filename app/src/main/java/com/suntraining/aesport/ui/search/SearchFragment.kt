package com.suntraining.aesport.ui.search

import com.google.android.material.tabs.TabLayoutMediator
import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseFragment
import com.suntraining.aesport.databinding.FragmentSearchBinding
import com.suntraining.aesport.ui.search.adapter.SearchViewPagerAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class SearchFragment : BaseFragment<FragmentSearchBinding, SearchViewModel>() {

    private val searchTeamFragment = SearchTeamFragment()
    private val searchPlayerFragment = SearchPlayerFragment()
    private val searchViewPagerAdapter by lazy {
        SearchViewPagerAdapter(childFragmentManager, lifecycle).apply {
            addFragment(searchTeamFragment, resources.getString(R.string.title_team))
            addFragment(searchPlayerFragment, resources.getString(R.string.title_player))
        }
    }
    override val layoutResource get() = R.layout.fragment_search
    override val viewModel: SearchViewModel by viewModel()

    override fun initViews() {
        viewBinding.apply {
            viewPagerSearch.adapter = searchViewPagerAdapter
            TabLayoutMediator(tabSearch, viewPagerSearch
            ) { tab, position ->
                tab.text = searchViewPagerAdapter.getTabTitle(position)
            }.attach()
        }

    }

    override fun initData() {
        viewBinding.apply {
            lifecycleOwner = viewLifecycleOwner
            searchVM = viewModel
        }
    }

    override fun initActions() {
    }
}
