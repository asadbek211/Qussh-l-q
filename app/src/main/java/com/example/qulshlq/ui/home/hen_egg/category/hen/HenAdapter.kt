package com.example.qulshlq.ui.home.hen_egg.category.hen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.qulshlq.R
import com.example.qulshlq.databinding.ChickenItemBinding
import com.example.qulshlq.databinding.HenItemBinding

class HenAdapter : RecyclerView.Adapter<HenAdapter.ViewHolder>() {
    private var onclick: (title: String) -> Unit = {}
    fun onClickListener(onclick: (title: String) -> Unit) {
        this.onclick = onclick
    }
    var categoryList: ArrayList<String> = arrayListOf("17", "18-45", "46-65", "66+")

    inner class ViewHolder(private val binding: HenItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun getBook(position: Int) {
            binding.tvTitle.text = "${categoryList[position]}\n${binding.root.context.getString(R.string.hafta)}"
            binding.container.setOnClickListener {
                onclick.invoke(categoryList[position])
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val henItemBinding =
            HenItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(henItemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.getBook(position)
    }

    override fun getItemCount(): Int = categoryList.size
}