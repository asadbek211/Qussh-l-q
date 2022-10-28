package com.example.qulshlq.ui.home.hen_meat.category

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.qulshlq.R
import com.example.qulshlq.databinding.FragmentHenMeatCategoryBinding
import com.example.qulshlq.util.viewBinding

class HenMeatCategoryFragment : Fragment(R.layout.fragment_hen_meat_category) {
    private lateinit var henMeatCategoryAdapter: HenMeatCategoryAdapter
    private val binding by viewBinding { FragmentHenMeatCategoryBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        henMeatCategoryAdapter = HenMeatCategoryAdapter()
        binding.henRecView.adapter = henMeatCategoryAdapter
        henMeatCategoryAdapter.onClickListener {title->
            val bundle = bundleOf(
                "title" to title,
                "categoryId" to "BJ"
            )
            findNavController().navigate(R.id.action_henMeat_to_formulaContainerFragment,bundle)
        }
    }
}