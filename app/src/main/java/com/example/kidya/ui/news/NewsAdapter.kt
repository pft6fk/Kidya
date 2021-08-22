package com.example.kidya.ui.news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemNewsAppbarBinding

class NewsAdapter  : RecyclerView.Adapter<NewsAdapter.NewsHolder>() {
    val brand_list = NewsDataHelper.getNewsList()
    var onItemClick: (() -> Unit)? = null
    inner class NewsHolder(item: View): RecyclerView.ViewHolder(item) {
        init{
            itemView.setOnClickListener {
                onItemClick?.invoke()
            }
        }
        val binding = ItemNewsAppbarBinding.bind(item)
        fun bind(card: NewsData) = with(binding){
            cardvewNewsImg.setImageResource(R.drawable.img)
            cardvewNewsDate.text = card.date
            cardviewNewsTitle.text = card.heading
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news_appbar, parent, false)

        return NewsHolder(view)
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        holder.bind(brand_list[position])
    }

    override fun getItemCount(): Int {
        return brand_list.size
    }
}