package com.example.kidya.ui.home

import com.example.kidya.R

data class BrandData(val Logo1 : Int, val Logo2 : Int, val Logo3 : Int)

class MockDataBrand(){
    companion object{
        fun getBrandList():List<BrandData>{
            val data=ArrayList<BrandData>()
            data.add(BrandData(R.drawable.brand_adidas,R.drawable.brand_levis, R.drawable.brand_lacoste))
            data.add(BrandData(R.drawable.brand_nike,R.drawable.brand_th, R.drawable.brand_puma))
            data.add(BrandData(R.drawable.brand_nike,R.drawable.brand_micro, R.drawable.brand_timberland))
            return data
        }
    }
}