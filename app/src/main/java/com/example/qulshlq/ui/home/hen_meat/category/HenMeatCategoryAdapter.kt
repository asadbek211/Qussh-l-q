package com.example.qulshlq.ui.home.hen_meat.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.qulshlq.R
import com.example.qulshlq.databinding.ChickenItemBinding
import com.example.qulshlq.databinding.HenMeatItemBinding

class HenMeatCategoryAdapter : RecyclerView.Adapter<HenMeatCategoryAdapter.ViewHolder>() {
    private var onclick: (title: String) -> Unit = {}
    fun onClickListener(onclick: (title: String) -> Unit) {
        this.onclick = onclick
    }
    var categoryList: ArrayList<String> = arrayListOf("1-4", "1-4", "5+")

    inner class ViewHolder(private val binding: HenMeatItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun getBook(position: Int) {
            if(position==0){
                binding.tvTitle.text = "${categoryList[position]}\n${binding.root.context.getString(R.string.den)}"
            }else{
                binding.tvTitle.text = "${categoryList[position]}\n${binding.root.context.getString(R.string.hafta)}"
            }

            binding.container.setOnClickListener {
                if (position==0){
                    onclick.invoke("${categoryList[position]}k")
                }else if (position==1){
                    onclick.invoke("${categoryList[position]}h")
                }else{
                    onclick.invoke(categoryList[position])
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val henMeatItemBinding =
            HenMeatItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(henMeatItemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.getBook(position)
    }

    override fun getItemCount(): Int = categoryList.size
}