package com.example.qulshlq.ui.home.hen_egg.category.chicken

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.qulshlq.R
import com.example.qulshlq.databinding.ChickenItemBinding

class ChickenAdapter : RecyclerView.Adapter<ChickenAdapter.ViewHolder>() {
    private var onclick: (title: String) -> Unit = {}
    fun onClickListener(onclick: (title: String) -> Unit) {
        this.onclick = onclick
    }
    var categoryList: ArrayList<String> = arrayListOf("6-21", "22-56", "57-112", "113-119")

    inner class ViewHolder(private val binding: ChickenItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun getBook(position: Int) {
            binding.tvTitle.text = "${categoryList[position]}\n${binding.root.context.getString(R.string.den)}"
            binding.container.setOnClickListener {
                onclick.invoke(categoryList[position])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val chickenItemBinding =
            ChickenItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(chickenItemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.getBook(position)
    }

    override fun getItemCount(): Int = categoryList.size
}