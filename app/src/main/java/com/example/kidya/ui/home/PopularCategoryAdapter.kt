package com.example.kidya.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemPopularCategoryBinding
import com.example.kidya.ui.home.MockCategoryData.Companion.getImgResourceList

class PopularCategoryAdapter : RecyclerView.Adapter<PopularCategoryAdapter.ImageHolder>() {
    val brand_list = getImgResourceList()
    var onItemClick : (() -> Unit)? = null
    inner class ImageHolder(item: View): RecyclerView.ViewHolder(item) {
            init{
                itemView.setOnClickListener {
                    onItemClick?.invoke()
                }
            }
            val binding = ItemPopularCategoryBinding.bind(item)
            fun bind(card: CategoryData) = with(binding){
                content.setImageResource(card.img)
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_popular_category, parent, false)
            return ImageHolder(view)
        }

        override fun onBindViewHolder(holder: ImageHolder, position: Int) {
            holder.bind(brand_list[position])
        }

        override fun getItemCount(): Int {
            return brand_list.size
        }
}