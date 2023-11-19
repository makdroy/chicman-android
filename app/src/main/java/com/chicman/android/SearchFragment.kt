package com.chicman.android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chicman.android.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    companion object {
        @Suppress("UNUSED")
        @JvmStatic
        fun newInstance() = SearchFragment().apply {
//            arguments = Bundle().apply {
//                putString(ARG_PARAM1, param1)
//                putString(ARG_PARAM2, param2)
//            }
        }
    }

    private var _binding: FragmentSearchBinding? = null
    private val binding: FragmentSearchBinding
        get() = _binding!!

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
////        arguments?.let { }
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

}
