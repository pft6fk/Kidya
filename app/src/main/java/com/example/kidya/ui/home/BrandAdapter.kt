package com.example.kidya.ui.home

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemPopularBrendsBinding
import com.example.kidya.ui.home.MockDataBrand.Companion.getBrandList

class BrandAdapter: RecyclerView.Adapter<BrandAdapter.BrandHolder>() {
    val brand_list = getBrandList()
    class BrandHolder(item:View): RecyclerView.ViewHolder(item) {
        val binding = ItemPopularBrendsBinding.bind(item)
        fun bind(card: BrandData) = with(binding){
            logo1.setImageResource(card.Logo1)
            logo2.setImageResource(card.Logo2)
            logo3.setImageResource(card.Logo3)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrandHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_popular_brends, parent, false)
        return BrandHolder(view)
    }

    override fun onBindViewHolder(holder: BrandHolder, position: Int) {
        holder.bind(brand_list[position])
    }

    override fun getItemCount(): Int {
        return brand_list.size
    }

//    fun clotheAdd(item: clotheData){
//        clothe_list.add(item)
//        notifyDataSetChanged()
//    }



}