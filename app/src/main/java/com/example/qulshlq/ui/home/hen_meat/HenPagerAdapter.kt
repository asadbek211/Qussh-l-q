package com.example.qulshlq.ui.home.hen_meat

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.qulshlq.ui.home.hen_meat.category.HenMeatCategoryFragment

class HenPagerAdapter(
    fragmentActivity: FragmentActivity,
    var fragmentList: MutableList<Fragment>
) :
    FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        val fragment: Fragment = HenMeatCategoryFragment()
        if (fragmentList.size <= position)
            fragmentList.add(fragment)
        else
            fragmentList[position] = fragment
        return fragment
    }

    override fun getItemCount(): Int {
        return 1
    }

}