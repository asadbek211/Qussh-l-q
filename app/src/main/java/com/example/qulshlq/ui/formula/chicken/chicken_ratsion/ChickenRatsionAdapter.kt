package com.example.qulshlq.ui.formula.chicken.chicken_ratsion

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.qulshlq.databinding.ChickenRatsionItemBinding
import com.example.qulshlq.ui.formula.chicken.chicken_ratsion.model.RatsionModel

class ChickenRatsionAdapter : RecyclerView.Adapter<ChickenRatsionAdapter.ViewHolder>() {
    private var onclick: (position: Int) -> Unit = {}
    fun onClickListener(onclick: (position: Int) -> Unit) {
        this.onclick = onclick
    }

    var ratsionList: List<RatsionModel> = arrayListOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ChickenRatsionItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun getBook(ratsionModel: RatsionModel, position: Int) {
            binding.tvTitle.text = ratsionModel.productAmount
            binding.tvTitle2.text = ratsionModel.productName
            binding.container.setOnClickListener {
                onclick.invoke(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val chickenRatsionItemBinding =
            ChickenRatsionItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(chickenRatsionItemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.getBook(ratsionList[position], position)
    }

    override fun getItemCount(): Int = ratsionList.size
}