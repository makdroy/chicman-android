package com.chicman.android

import androidx.navigation.fragment.findNavController
import com.chicman.android.base.BaseFragment
import com.chicman.android.databinding.FragmentStoreBinding

class StoreFragment : BaseFragment<FragmentStoreBinding>() {

    override fun getLayoutId(): Int = R.layout.fragment_store

    override fun initView() {
        super.initView()
        binding.btnNavigate.setOnClickListener {
            // get parent nav controller
            val navControllerHost = ((parentFragment)?.parentFragment)?.findNavController()

            // call action
            navControllerHost?.navigate(
                HostFragmentDirections.actionHostFragmentToDetailsFragment(
                    contentName = "Store Fragment"
                )
            )
        }
    }
}
