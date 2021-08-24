package com.example.kidya.ui.menu.orders.onboarding.page.ongoingData.details.refund

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemOrderProductBinding
import com.example.kidya.databinding.ItemRefundProductBinding
import com.example.kidya.ui.basket.BasketData
import com.example.kidya.ui.basket.MockBasket

class RefundAdapter : RecyclerView.Adapter<RefundAdapter.Holder>() {
    val basket_list = MockBasket.putBasket()
    var onItemClick: (() -> Unit)? = null

    var currentSelected = -1

    inner class Holder(item: View): RecyclerView.ViewHolder(item){

        val binding = ItemRefundProductBinding.bind(item)

        fun Bind(take: BasketData, index: Int) = with(binding){
            basketImg.setImageResource(take.img)
            basketProductBrand.text = take.brand
            basketProductColor.text = take.color
            basketProductPrice.text = take.cost
            basketProductType.text = take.type
            basketSize.text = take.size

            //using setonlonglistener for refund text
            constraintLayout.setOnLongClickListener {
                selectedItemRefund(index)
            }

            if (take.selected == true){//make text visible or not
                makeRefund.visibility = View.VISIBLE
            }
            else{
                makeRefund.visibility = View.GONE
            }
        }

        //function for onlongclick listener
        //this has been made from https://www.youtube.com/watch?v=HzKIQXWveJ4
        fun selectedItemRefund(index: Int) : Boolean {
            for (item in basket_list){
                item.selected = false
            }

            basket_list.get(index).selected = true
            currentSelected = index
            notifyDataSetChanged()
            return true
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_refund_product, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.Bind(basket_list[position], position )
    }

    override fun getItemCount(): Int {
        return basket_list.size
    }

}