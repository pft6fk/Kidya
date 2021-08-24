package com.example.kidya.ui.basket

import com.example.kidya.R

data class BasketData (val img: Int, val type: String, val brand: String, val color: String, val size: String, val cost: String, var selected: Boolean? = false )

class MockBasket{
    companion object{
        fun putBasket(): List<BasketData>{
            val data = ArrayList<BasketData>()
            data.add(BasketData(R.drawable.carrot_jmp,"Футболка", "LC WAIKIKI","Красный","L","250 000 сум"))
            data.add(BasketData(R.drawable.red_jmp,"Футболка", "LC WAIKIKI","Красный","L","250 000 сум"))
            return data
        }
    }
}
