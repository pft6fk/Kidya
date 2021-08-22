package com.example.kidya.ui.menu.orders.onboarding.page.ongoingData

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.databinding.ItemOngoingOrderBinding

class OngoingOrderAdapter : RecyclerView.Adapter<OngoingOrderAdapter.Holder>(){
    val order_list = MockData.putOrder()
    var onItemClick: (() -> Unit)? = null
    inner class Holder(var binding: ItemOngoingOrderBinding): RecyclerView.ViewHolder(binding.root) {
        init {
            binding.more.setOnClickListener {
                onItemClick?.invoke()
            }
        }
        fun connect(data: OngoingOrderData) = with(binding){
            orderNumber.text = data.orderNumber
            orderDate.text = data.orderDate
            priceProduct.text = data.totalCost
            numberProduct.text = data.orderCount
//
//            point1.setImageResource(data.pointComplete)
//            point2.setImageResource(data.pointWait)
//            point3.setImageResource(data.pointWait)
//            point4.setImageResource(data.pointWait)
//            point5.setImageResource(data.pointWait)
//            orderLine1.setImageResource(data.lineComplete)
//            orderLine2.setImageResource(data.colorWait)
//            orderLine3.setImageResource(data.colorWait)
//            orderLine4.setImageResource(data.colorWait)
//            textProcessed.setTextColor(data.colorComplete)
//            textGathered.setTextColor(data.colorWait)
//            textWaiting.setTextColor(data.colorWait)
//            textInWay.setTextColor(data.colorWait)
//            textDelivered.setTextColor(data.colorWait)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemOngoingOrderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.connect(order_list[position])
    }

    override fun getItemCount(): Int {
        return order_list.size
    }

}