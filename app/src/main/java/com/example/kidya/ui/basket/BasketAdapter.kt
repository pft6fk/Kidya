package com.example.kidya.ui.basket

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.PopupMenu
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemBasketProductBinding
import com.example.kidya.ui.basket.MockBasket.Companion.putBasket

class BasketAdapter: RecyclerView.Adapter<BasketAdapter.Holder>() {
    val basket_list = putBasket()
    var onItemClick: (() -> Unit)? = null
//    val more: ImageButton = it.
    inner class Holder(var binding: ItemBasketProductBinding): RecyclerView.ViewHolder(binding.root){
        init {
            itemView.setOnClickListener {
                onItemClick?.invoke()
            }
//            binding.menu.setOnClickListener {
//                showMenu(it, requireContext().from, R.menu.popup_more_menu)
//            }
        }


        fun Bind(take: BasketData) = with(binding){
            basketImg.setImageResource(take.img)
            basketProductBrand.text = take.brand
            basketProductColor.text = take.color
            basketProductPrice.text = take.cost
            basketProductType.text = take.type
            basketSize.text = take.size
        }

//        private fun showMenu(c: Context, v: View, popupMoreMenu: Int) {
//            val popup = PopupMenu(c, v)
//            popup.menuInflater.inflate(popupMoreMenu, popup.menu)
//
//            popup.setOnDismissListener {
//                // Respond to popup being dismissed.
//            }
//            // Show the popup menu.
//            popup.show()
//
//        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemBasketProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.Bind(basket_list[position])
    }

    override fun getItemCount(): Int {
        return basket_list.size
    }

}