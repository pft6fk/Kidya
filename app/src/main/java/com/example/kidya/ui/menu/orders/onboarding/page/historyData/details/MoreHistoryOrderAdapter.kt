package com.example.kidya.ui.menu.orders.onboarding.page.historyData.details

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemOrderProductBinding
import com.example.kidya.ui.basket.BasketData
import com.example.kidya.ui.basket.MockBasket

class MoreHistoryOrderAdapter : RecyclerView.Adapter<MoreHistoryOrderAdapter.Holder>() {
    val basket_list = MockBasket.putBasket()
    var onItemClick: (() -> Unit)? = null
    inner class Holder(item: View): RecyclerView.ViewHolder(item){
        init {
            itemView.setOnClickListener {
                onItemClick?.invoke()
            }
        }

        val binding = ItemOrderProductBinding.bind(item)

        fun Bind(take: BasketData) = with(binding){
            basketImg.setImageResource(take.img)
            basketProductBrand.text = take.brand
            basketProductColor.text = take.color
            basketProductPrice.text = take.cost
            basketProductType.text = take.type
            basketSize.text = take.size
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_order_product, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.Bind(basket_list[position])
    }

    override fun getItemCount(): Int {
        return basket_list.size
    }

}