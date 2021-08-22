package com.example.kidya.ui.favourite

import com.example.kidya.R



data class FavouriteData (val imageId: Int, val name_product: String, val priceWithoutStroke: String, val priceWithStroke: String, val sale: String)

class EnterData{
    companion object{
        fun putFavInfo():List<FavouriteData>{
            val data = ArrayList<FavouriteData>()
            data.add(FavouriteData(R.drawable.carrot_jmp,"Розовое платье с кружевами","228 000 сум","228 000 сум","15%"))
            data.add(FavouriteData(R.drawable.red_jmp,"Розовое платье с кружевами","228 000 сум","228 000 сум","15%"))
            data.add(FavouriteData(R.drawable.carrot_jmp,"Розовое платье с кружевами","228 000 сум","228 000 сум","15%"))
            data.add(FavouriteData(R.drawable.red_jmp,"Розовое платье с кружевами","228 000 сум","228 000 сум","15%"))
            data.add(FavouriteData(R.drawable.carrot_jmp,"Розовое платье с кружевами","228 000 сум","228 000 сум","15%"))
            data.add(FavouriteData(R.drawable.red_jmp,"Розовое платье с кружевами","228 000 сум","228 000 сум","15%"))

            return data
        }
    }
}
