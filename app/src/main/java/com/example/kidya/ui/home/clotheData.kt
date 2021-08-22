package com.example.kidya.ui.home

import com.example.kidya.R

data class clotheData(val imageId: Int, val name_product: String, val priceWithoutStroke: String, val priceWithStroke: String, val sale: String)

class MockData(){
    companion object{
        fun getItemsList():List<clotheData>{
            val data=ArrayList<clotheData>()
            data.add(clotheData(R.drawable.carrot_jmp,"Розовое платье с кружевами","228 000 сум","228 000 сум","15%"))
            data.add(clotheData(R.drawable.red_jmp,"Розовое платье с кружевами","228 000 сум","228 000 сум","15%"))
            data.add(clotheData(R.drawable.carrot_jmp,"Розовое платье с кружевами","228 000 сум","228 000 сум","15%"))
            data.add(clotheData(R.drawable.red_jmp,"Розовое платье с кружевами","228 000 сум","228 000 сум","15%"))

            return data
        }
    }
}