package com.example.qulshlq.ui.formula.hen

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.qulshlq.R
import com.example.qulshlq.databinding.FragmentHenFormulaBinding
import com.example.qulshlq.ui.formula.chicken.ChickenFormulaAdapter
import com.example.qulshlq.util.viewBinding

class HenFormulaFragment : Fragment(R.layout.fragment_hen_formula) {
    private lateinit var chickenFormulaAdapter: ChickenFormulaAdapter
    private var id: String? = null
    private var chickenDayNumber: String? = null
    private var categoryId: Int? = null
    private var position: Int? = null
    private val binding by viewBinding { FragmentHenFormulaBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        id = requireArguments().getString("categoryId")
        position = requireArguments().getInt("position")
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
        when (position) {
            0 -> {
                chickenDayNumber = "6-21"
            }
            1 -> {
                chickenDayNumber = "22-56"
            }
            2 -> {
                chickenDayNumber = "57-112"
            }
            3 -> {
                chickenDayNumber = "113-119"
            }
        }
        chickenFormulaAdapter = ChickenFormulaAdapter()
        binding.recView1.adapter = chickenFormulaAdapter
        binding.recView2.adapter = chickenFormulaAdapter
        binding.recView3.adapter = chickenFormulaAdapter
        binding.recView4.adapter = chickenFormulaAdapter
        binding.recView5.adapter = chickenFormulaAdapter
        chickenFormulaAdapter.onClickListener {
            val bundle = bundleOf(
                "categoryId" to categoryId,
                "position" to it,
                "chickenDayNumber" to chickenDayNumber
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