package com.chicman.android.features.details

import androidx.navigation.fragment.navArgs
import com.chicman.android.R
import com.chicman.android.base.BaseFragment
import com.chicman.android.databinding.FragmentDetailsBinding

class DetailsFragment : BaseFragment<FragmentDetailsBinding>() {

    private val args: DetailsFragmentArgs by navArgs()
    private val name: String? by lazy { args.contentName }

    override fun getLayoutId(): Int = R.layout.fragment_details

    override fun setupData() {
        binding.contentName = name?.trim() ?: ""
    }
}
