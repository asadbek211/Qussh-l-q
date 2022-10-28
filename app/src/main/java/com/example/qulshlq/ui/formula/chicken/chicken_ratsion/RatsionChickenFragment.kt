package com.example.qulshlq.ui.formula.chicken.chicken_ratsion

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.qulshlq.R
import com.example.qulshlq.databinding.FragmentChickenRatsionBinding
import com.example.qulshlq.ui.formula.chicken.chicken_ratsion.model.ProductsModel
import com.example.qulshlq.ui.formula.chicken.chicken_ratsion.model.RatsionModel
import com.example.qulshlq.util.productImageList
import com.example.qulshlq.util.ratsion
import com.example.qulshlq.util.viewBinding

class RatsionChickenFragment : Fragment(R.layout.fragment_chicken_ratsion) {
    private lateinit var ratsionAdapter: ChickenRatsionAdapter
    private lateinit var chickenProductAdapter: ChickenProductAdapter
    private var categoryId: Int? = null
    private var categoryName: String? = null
    private var chickenDayNumber: String? = null
    private var position: Int? = null
    private val binding by viewBinding { FragmentChickenRatsionBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        categoryId = requireArguments().getInt("categoryId")
        chickenDayNumber = requireArguments().getString("chickenDayNumber")
        position = requireArguments().getInt("position")
        when (categoryId) {
            1 -> {
                categoryName = getString(R.string.egg_chicken)

            }
            2 -> {
                categoryName = getString(R.string.broyler)
            }
            3 -> {
                categoryName = getString(R.string.egg_hen)
            }
        }
        binding.tvTitle.text = categoryName
        var titleText = ""
        when (position) {
            0 -> {
                titleText = getText("50 kg")
            }
            1 -> {
                titleText = getText("100 kg")
            }
            2 -> {
                titleText = getText("500 kg")
            }
            3 -> {
                titleText = getText("1000 kg")
            }
            4 -> {
                titleText = getText("2500 kg")
            }
            5 -> {
                titleText = getText("5000 kg")
            }
        }
        binding.tvTitle2.text = titleText
        ratsionAdapter = ChickenRatsionAdapter()
        chickenProductAdapter = ChickenProductAdapter()
        binding.recView.adapter = ratsionAdapter
        binding.productRecView.adapter = chickenProductAdapter
        var productsList:ArrayList<ProductsModel> = arrayListOf()
        for (element in productImageList){
            productsList.add(ProductsModel(element,"Bug'doy yormasi",655))
        }
        chickenProductAdapter.productsList = productsList
        ratsionAdapter.ratsionList = chickenDayNumber?.let { ratsion(requireContext(), it) }!!
        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }
    private fun getText(text:String):String{
        var getText = ""
        when(categoryId){
            1->{
                getText = "$chickenDayNumber ${getString(R.string.den2)} $text${getString(R.string.ratsion)}"
            }
            2->{
                if (chickenDayNumber=="1-4k"){
                    getText = "${chickenDayNumber?.replace("k","")} ${getString(R.string.den4)} $text${getString(R.string.ratsion)}"
                }else if (chickenDayNumber=="1-4h"){
                    getText = "${chickenDayNumber?.replace("h","")} ${getString(R.string.den3)} $text${getString(R.string.ratsion)}"
                }else{
                    getText = "$chickenDayNumber ${getString(R.string.den3)} $text${getString(R.string.ratsion)}"
                }
            }
            3->{
                getText = "$chickenDayNumber ${getString(R.string.hen_ratsion)} $text${getString(R.string.ratsion)}"
            }
        }
        return getText
    }
}