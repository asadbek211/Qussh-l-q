package com.example.qulshlq.ui.home.hen_egg.category.hen

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsetsController
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.qulshlq.R
import com.example.qulshlq.databinding.FragmentHenCategoryBinding
import com.example.qulshlq.ui.home.hen_egg.category.chicken.ChickenAdapter
import com.example.qulshlq.util.viewBinding

class HenCategoryFragment : Fragment(R.layout.fragment_hen_category) {
    private lateinit var henAdapter: HenAdapter
    private val binding by viewBinding { FragmentHenCategoryBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        henAdapter = HenAdapter()
        binding.henRecView.adapter = henAdapter
        henAdapter.onClickListener {title->
            val bundle = bundleOf(
                "title" to title,
                "categoryId" to "H"
            )
            findNavController().navigate(R.id.action_henEgg_to_formulaContainerFragment,bundle)
        }
    }
}