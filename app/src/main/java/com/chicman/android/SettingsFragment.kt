package com.chicman.android

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chicman.android.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    companion object {
        @Suppress("UNUSED")
        @JvmStatic
        fun newInstance() = SettingsFragment()
    }

    private lateinit var settingsVm: SettingsViewModel

    private var _binding: FragmentSettingsBinding? = null
    private val binding: FragmentSettingsBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewModel()
    }

    private fun setupViewModel() {
        settingsVm = ViewModelProvider(requireActivity())[SettingsViewModel::class.java]
    }

}
