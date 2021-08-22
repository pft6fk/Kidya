package com.example.kidya.ui.catalog

import com.example.kidya.R

data class CategoryData(val img: Int, val categoryText : String)

class MockCategoryData{
    companion object{
        fun getImgResourceList1():List<CategoryData>{
            val data = ArrayList<CategoryData>()
            data.add(CategoryData(R.drawable.ic_top, "Кофточки"))
            data.add(CategoryData(R.drawable.ic_socks, "Носки"))
            data.add(CategoryData(R.drawable.ic_shirt, "Рубашки"))
            data.add(CategoryData(R.drawable.ic_skirt, "Юбки"))

            data.add(CategoryData(R.drawable.ic_top, "Кофточки"))
            data.add(CategoryData(R.drawable.ic_socks, "Носки"))
            data.add(CategoryData(R.drawable.ic_shirt, "Рубашки"))
            data.add(CategoryData(R.drawable.ic_skirt, "Юбки"))

            data.add(CategoryData(R.drawable.ic_top, "Кофточки"))
            data.add(CategoryData(R.drawable.ic_socks, "Носки"))
            data.add(CategoryData(R.drawable.ic_shirt, "Рубашки"))
            data.add(CategoryData(R.drawable.ic_skirt, "Юбки"))

            data.add(CategoryData(R.drawable.ic_top, "Кофточки"))
            data.add(CategoryData(R.drawable.ic_socks, "Носки"))
            data.add(CategoryData(R.drawable.ic_shirt, "Рубашки"))
            data.add(CategoryData(R.drawable.ic_skirt, "Юбки"))

            return data

        }
    }

}
