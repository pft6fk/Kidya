package com.example.kidya.ui.product.rating

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemRatingBinding
import com.example.kidya.ui.product.rating.MockData.Companion.putRating

class RatingAdapter: RecyclerView.Adapter<RatingAdapter.Holder>() {
    val rating_list = putRating()
    inner class Holder(item: View): RecyclerView.ViewHolder(item){
        val binding = ItemRatingBinding.bind(item)
        fun put(put: RatingData) = with(binding){
            numberRating.text = put.number
            progressRating.progress = put.progress.toInt()
            ratingStar.numStars = put.starsNum.toInt()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rating, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.put(rating_list[position])
    }

    override fun getItemCount(): Int {
        return rating_list.size
    }


}