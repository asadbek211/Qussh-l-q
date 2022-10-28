package com.example.qulshlq.ui.formula.chicken.chicken_ratsion

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.qulshlq.databinding.ChickenProductsItemBinding
import com.example.qulshlq.databinding.ChickenRatsionItemBinding
import com.example.qulshlq.ui.formula.chicken.chicken_ratsion.model.ProductsModel
import com.example.qulshlq.ui.formula.chicken.chicken_ratsion.model.RatsionModel

class ChickenProductAdapter : RecyclerView.Adapter<ChickenProductAdapter.ViewHolder>() {
    private var onclick: (position: Int) -> Unit = {}
    fun onClickListener(onclick: (position: Int) -> Unit) {
        this.onclick = onclick
    }

    var productsList: ArrayList<ProductsModel> = arrayListOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ChickenProductsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun getBook(productsModel: ProductsModel,position: Int) {
            binding.image.setImageResource(productsModel.image)
            binding.tvProductName.text = productsModel.name
            binding.tvProductAmount.text = "${productsModel.amount}\nKg"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val chickenProductsItemBinding =
            ChickenProductsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(chickenProductsItemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.getBook(productsList[position],position)
    }

    override fun getItemCount(): Int = productsList.size
}