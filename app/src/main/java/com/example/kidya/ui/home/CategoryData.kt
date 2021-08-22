package com.example.kidya.ui.home

import com.example.kidya.R

data class CategoryData(val img: Int)

class MockCategoryData{
    companion object{
        fun getImgResourceList():List<CategoryData>{
            val data = ArrayList<CategoryData>()
            data.add(CategoryData(R.drawable.ic_top))
            data.add(CategoryData(R.drawable.ic_socks))
            data.add(CategoryData(R.drawable.ic_shirt))
            data.add(CategoryData(R.drawable.ic_skirt))

            return data

        }
    }

}
