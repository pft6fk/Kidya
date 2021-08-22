package com.example.kidya.ui.favourite

import android.graphics.Color
import android.provider.CalendarContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemProductBinding



class FavouriteAdapter : RecyclerView.Adapter<FavouriteAdapter.imageHolder>(){
    var onItemClick: (() -> Unit)? = null
    val clothe_list = EnterData.putFavInfo()
    inner class imageHolder(item:View): RecyclerView.ViewHolder(item) {
        init{
            itemView.setOnClickListener {
                onItemClick?.invoke()
            }
        }
        val binding = ItemProductBinding.bind(item)
        fun bind(card: FavouriteData) = with(binding){
            image.setImageResource(card.imageId)
            price.text = card.priceWithoutStroke
            strokedPrice.text = card.priceWithStroke
            productName.text = card.name_product
            salePercent.visibility = View.GONE
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): imageHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return imageHolder(view)

    }

    override fun onBindViewHolder(holder: imageHolder, position: Int) {
        holder.bind(clothe_list[position])
    }

    override fun getItemCount(): Int {
        return clothe_list.size
    }

}