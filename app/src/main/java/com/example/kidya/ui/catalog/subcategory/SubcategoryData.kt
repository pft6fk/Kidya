package com.example.kidya.ui.catalog.subcategory

data class SubcategoryData(var subcategory: String, val count : String)

class SubCatData{
    companion object{
        fun putSubCategory():List<SubcategoryData>{
            val data = ArrayList<SubcategoryData>()
            data.add(SubcategoryData("Sub-Category 1","99"))
            data.add(SubcategoryData("Sub-Category 2","99"))
            data.add(SubcategoryData("Sub-Category 3","99"))
            data.add(SubcategoryData("Sub-Category 4","99"))
            data.add(SubcategoryData("Sub-Category 5","99"))
            data.add(SubcategoryData("Sub-Category 6","99"))
            data.add(SubcategoryData("Sub-Category 7","99"))
            data.add(SubcategoryData("Sub-Category 8","99"))

            return data
        }
    }
}
