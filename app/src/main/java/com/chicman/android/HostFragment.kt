package com.chicman.android

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.chicman.android.base.BaseFragment
import com.chicman.android.databinding.FragmentHostBinding

class HostFragment : BaseFragment<FragmentHostBinding>() {

    override fun getLayoutId(): Int = R.layout.fragment_host

    override fun initView() {
        super.initView()
        childFragmentManager
            .findFragmentById(R.id.navBottomNavigationContainer)
            ?.let { (it as? NavHostFragment)?.navController }
            ?.also { binding.bottomNavigation.setupWithNavController(it) }
    }
}
