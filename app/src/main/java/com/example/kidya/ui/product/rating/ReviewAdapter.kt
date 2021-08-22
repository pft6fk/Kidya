package com.example.kidya.ui.product.rating

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemReviewBinding
import com.example.kidya.ui.product.info.InfoAdapter
import com.example.kidya.ui.product.rating.MockReviewData.Companion.putReview

class       ReviewAdapter:RecyclerView.Adapter<ReviewAdapter.Holder>() {
    val review_list = putReview()
    inner class Holder(item: View): RecyclerView.ViewHolder(item){
        val binding = ItemReviewBinding.bind(item)
        fun connect(get: ReviewData) = with(binding){
            ratingBar.rating = get.rating.toFloat()
            reviewDate.text = get.date
            reviewText.text = get.Review
            reviewerName.text = get.name
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewAdapter.Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_review, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: ReviewAdapter.Holder, position: Int) {
        holder.connect(review_list[position])
    }

    override fun getItemCount(): Int {
        return review_list.size
    }



}