package com.example.kidya.ui.catalog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemPopularCategory1Binding
import com.example.kidya.ui.catalog.MockCategoryData.Companion.getImgResourceList1

class   CategoryAdapter : RecyclerView.Adapter<CategoryAdapter.ImageHolder>() {
    val brand_list = getImgResourceList1()
    var onItemClick : (() -> Unit)? = null
    inner class ImageHolder(item: View): RecyclerView.ViewHolder(item) {
            init{
                itemView.setOnClickListener {
                    onItemClick?.invoke()
                }
            }
            val binding = ItemPopularCategory1Binding.bind(item)
            fun bind(card: CategoryData) = with(binding){
                content.setImageResource(card.img)
                categoryName.text = card.categoryText
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_popular_category1, parent, false)
            return ImageHolder(view)
        }

        override fun onBindViewHolder(holder: ImageHolder, position: Int) {
            holder.bind(brand_list[position])
        }

        override fun getItemCount(): Int {
            return brand_list.size
        }
}