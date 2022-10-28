package com.example.qulshlq.ui.home.hen_egg.category.chicken

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.qulshlq.R
import com.example.qulshlq.databinding.FragmentChickenCategoryBinding
import com.example.qulshlq.util.viewBinding

class ChickenCategoryFragment : Fragment(R.layout.fragment_chicken_category) {
    private val binding by viewBinding { FragmentChickenCategoryBinding.bind(it) }
    private lateinit var chickenAdapter: ChickenAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        chickenAdapter = ChickenAdapter()
        binding.chickenRecView.adapter = chickenAdapter
        chickenAdapter.onClickListener {title->
            val bundle = bundleOf(
                "title" to title,
                "categoryId" to "J"
            )
            findNavController().navigate(R.id.action_henEgg_to_formulaContainerFragment, bundle)
        }
    }
}