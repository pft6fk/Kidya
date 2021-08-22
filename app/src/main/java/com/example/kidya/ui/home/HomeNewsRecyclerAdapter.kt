package com.example.kidya.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemNewsBinding

class HomeNewsRecyclerAdapter  : RecyclerView.Adapter<HomeNewsRecyclerAdapter.NewsHolder>() {
    val brand_list = NewsDataHelper.getResourcesList()
    var onItemClick : (() -> Unit)? = null
    inner class NewsHolder(item: View): RecyclerView.ViewHolder(item) {
        init{
            itemView.setOnClickListener {
                onItemClick?.invoke()
            }
        }
        val binding = ItemNewsBinding.bind(item)
        fun bind(card: NewsData) = with(binding){
            img.setImageResource(card.img)
            newsHeading.text = card.heading
            newsDate.text = card.date
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewsHolder(view)
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        holder.bind(brand_list[position])
    }

    override fun getItemCount(): Int {
        return brand_list.size
    }
}