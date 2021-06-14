package com.suntraining.aesport.ui.main

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.suntraining.aesport.R
import com.suntraining.aesport.base.BaseActivity
import com.suntraining.aesport.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layoutId get() = R.layout.activity_main

    override fun initViews() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentNavHost) as NavHostFragment
        val navController = navHostFragment.navController
        viewBinding.bottomNavigationView.apply {
            selectedItemId = R.id.navigation_home
            setupWithNavController(navController)
        }
    }
}
