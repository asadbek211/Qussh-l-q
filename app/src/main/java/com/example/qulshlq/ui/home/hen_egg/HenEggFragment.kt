package com.example.qulshlq.ui.home.hen_egg

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsetsController
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.qulshlq.R
import com.example.qulshlq.databinding.FragmentHenEggBinding
import com.example.qulshlq.util.viewBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import java.util.*

class HenEggFragment : Fragment(R.layout.fragment_hen_egg) {
    private val binding by viewBinding { FragmentHenEggBinding.bind(it) }
    private var fragments: MutableList<Fragment> = Vector()
    private lateinit var addStationFragmentStateAdapter: AddStationFragmentStateAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().window.statusBarColor =
            ContextCompat.getColor(requireActivity(), R.color.secondary_color)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            requireActivity().window.decorView.windowInsetsController?.setSystemBarsAppearance(
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
                0
            )
        }
        addStationFragmentStateAdapter = AddStationFragmentStateAdapter(
            requireActivity(), fragments
        )
        binding.viewPager.offscreenPageLimit = 2
        binding.viewPager.adapter = addStationFragmentStateAdapter
        val list: ArrayList<String> = arrayListOf(getString(R.string.chicken),getString(R.string.hens))
        TabLayoutMediator(
            binding.tabLayout,
            binding.viewPager
        ) { tab: TabLayout.Tab, position: Int ->
            tab.text = list[position]
        }.attach()
        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}