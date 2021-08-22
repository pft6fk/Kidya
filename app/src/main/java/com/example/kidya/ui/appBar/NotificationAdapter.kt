package com.example.kidya.ui.appBar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemNotificationBinding

import com.example.kidya.ui.appBar.EnterData.Companion.putNews

class NotificationAdapter : RecyclerView.Adapter<NotificationAdapter.ImageHolder>(){
    val brand_list = putNews()
    class ImageHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = ItemNotificationBinding.bind(item)
        fun notifyBind(card: NotificationData) = with(binding){
            titleNews.text = card.title
            dateNews.text = card.date
            shortContentNews.text = card.content
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_notification, parent, false)
        return ImageHolder(view)
    }

    override fun onBindViewHolder(holder: ImageHolder, position: Int) {
        holder.notifyBind(brand_list[position])
    }

    override fun getItemCount(): Int {
        return brand_list.size
    }
}