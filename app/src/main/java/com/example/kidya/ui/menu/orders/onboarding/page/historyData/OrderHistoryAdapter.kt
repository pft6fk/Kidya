package com.example.kidya.ui.menu.orders.onboarding.page.historyData

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.databinding.ItemOrderHistoryBinding

class OrderHistoryAdapter:RecyclerView.Adapter<OrderHistoryAdapter.Holder>(){
    val info_list = MockData.putOrder()
    var onItemClick: (() -> Unit)? = null
    inner class Holder(var binding: ItemOrderHistoryBinding): RecyclerView.ViewHolder(binding.root) {
        init {
            binding.more.setOnClickListener {
                onItemClick?.invoke()
            }
        }
        fun connect(data: OrderHistoryData) = with(binding){
            orderNumber.text = data.orderNumber
            orderDate.text = data.orderDate
            priceProduct.text = data.totalCost
            numberProduct.text = data.orderCount
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemOrderHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.connect(info_list[position])
    }

    override fun getItemCount(): Int {
        return info_list.size
    }

}