package com.example.kidya.ui.catalog.subcategory

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemSubcategoryBinding
import com.example.kidya.ui.catalog.subcategory.SubCatData.Companion.putSubCategory

class SubcategoryAdapter : RecyclerView.Adapter<SubcategoryAdapter.Holder>(){
    val get_categorylist = putSubCategory()
    var onItemClick : (() -> Unit)? = null
    inner class Holder(item: View): RecyclerView.ViewHolder(item){
        init{
            itemView.setOnClickListener {
                onItemClick?.invoke()
            }
        }
        val binding = ItemSubcategoryBinding.bind(item)
        fun subFun(take: SubcategoryData) = with(binding){
            subcategoryText.text = take.subcategory
            subcategoryCount.text = take.count
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_subcategory, parent,false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.subFun(get_categorylist[position])
    }

    override fun getItemCount(): Int {
        return get_categorylist.size
    }

}