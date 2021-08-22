package com.example.kidya.ui.home

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemProductBinding
import com.example.kidya.ui.home.MockData.Companion.getItemsList

class clotheAdapterSale: RecyclerView.Adapter<clotheAdapterSale.clotheHolder>() {
    val clothe_list = getItemsList()
    var onItemClick : (() -> Unit)? = null
    inner class clotheHolder(item:View): RecyclerView.ViewHolder(item) {
        init{
            itemView.setOnClickListener {
                onItemClick?.invoke()
            }
        }
        val binding = ItemProductBinding.bind(item)
        fun bind(card: clotheData) = with(binding){
            image.setImageResource(card.imageId)
            price.text = card.priceWithoutStroke
            strokedPrice.text = card.priceWithStroke
            productName.text = card.name_product
            salePercent.text = card.sale
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): clotheHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return clotheHolder(view)
    }

    override fun onBindViewHolder(holder: clotheHolder, position: Int) {
        holder.bind(clothe_list[position])
    }

    override fun getItemCount(): Int {
        return clothe_list.size
    }



}