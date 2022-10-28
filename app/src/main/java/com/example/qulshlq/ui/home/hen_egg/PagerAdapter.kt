package com.example.qulshlq.ui.home.hen_egg

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.qulshlq.ui.home.hen_egg.category.chicken.ChickenCategoryFragment
import com.example.qulshlq.ui.home.hen_egg.category.hen.HenCategoryFragment

class AddStationFragmentStateAdapter(
    fragmentActivity: FragmentActivity,
    var fragmentList: MutableList<Fragment>
) :
    FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        val fragment: Fragment = when (position) {
            0 -> ChickenCategoryFragment()
            else -> HenCategoryFragment()
        }
        if (fragmentList.size <= position)
            fragmentList.add(fragment)
        else
            fragmentList[position] = fragment
        return fragment
    }

    override fun getItemCount(): Int {
        return 2
    }

}