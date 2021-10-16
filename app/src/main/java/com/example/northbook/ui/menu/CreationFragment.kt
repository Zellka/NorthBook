package com.example.northbook.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.northbook.adapter.CreatPagerAdapter
import com.example.northbook.adapter.SectionPagerAdapter
import com.example.northbook.databinding.FragmentCreationBinding

class CreationFragment : Fragment() {

    private var _binding: FragmentCreationBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCreationBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.viewPager.adapter = CreatPagerAdapter(this.requireContext(), childFragmentManager)
        binding.tabsC.setupWithViewPager(binding.viewPager)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}