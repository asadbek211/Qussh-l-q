package com.example.qulshlq.ui.formula.chicken

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.qulshlq.R
import com.example.qulshlq.databinding.FragmentChickenFormulaBinding
import com.example.qulshlq.util.viewBinding

class ChickenFormulaFragment : Fragment(R.layout.fragment_chicken_formula) {
    private lateinit var chickenFormulaAdapter: ChickenFormulaAdapter
    private var id: String? = null
    private var categoryId: Int? = null
    private var title: String? = null
    private val binding by viewBinding { FragmentChickenFormulaBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        id = requireArguments().getString("categoryId")
        title = requireArguments().getString("title")
        when (id) {
            "J" -> {
                binding.tvTitle.text = getString(R.string.egg_chicken)
                categoryId = 1
            }
            "BJ" -> {
                binding.tvTitle.text = getString(R.string.broyler)
                categoryId = 2
            }
            "H" -> {
                binding.tvTitle.text = getString(R.string.egg_hen)
                categoryId = 3
            }
        }
        chickenFormulaAdapter = ChickenFormulaAdapter()
        binding.recView1.adapter = chickenFormulaAdapter
        binding.recView2.adapter = chickenFormulaAdapter
        binding.recView3.adapter = chickenFormulaAdapter
        chickenFormulaAdapter.onClickListener {
            val bundle = bundleOf(
                "categoryId" to categoryId,
                "position" to it,
                "chickenDayNumber" to title
            )
            findNavController().navigate(
                R.id.action_formulaContainerFragment_to_ratsionContainerFragment,
                bundle
            )
        }
        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}