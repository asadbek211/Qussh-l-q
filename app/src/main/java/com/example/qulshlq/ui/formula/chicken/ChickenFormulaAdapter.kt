package com.example.qulshlq.ui.formula.chicken

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.qulshlq.databinding.HenFormulaItemBinding

class ChickenFormulaAdapter : RecyclerView.Adapter<ChickenFormulaAdapter.ViewHolder>() {
    private var onclick: (position: Int) -> Unit = {}
    fun onClickListener(onclick: (position: Int) -> Unit) {
        this.onclick = onclick
    }
    var categoryList: ArrayList<String> = arrayListOf("50", "100", "500", "1000", "2500", "5000")

    inner class ViewHolder(private val binding: HenFormulaItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun getBook(position: Int) {
            binding.tvTitle.text = "${categoryList[position]}\nKG"
            binding.container.setOnClickListener {
                onclick.invoke(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val henFormulaItemBinding =
            HenFormulaItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(henFormulaItemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.getBook(position)
    }

    override fun getItemCount(): Int = categoryList.size
}