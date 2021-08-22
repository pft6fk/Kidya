package com.example.kidya.ui.product.rating

data class RatingData(val starsNum: String, val progress: String, val number: String)

class MockData{
    companion object{
        fun putRating(): List<RatingData>{
            val data = ArrayList<RatingData>()
            data.add(RatingData("5", "70", "12"))
            data.add(RatingData("4", "30", "5"))
            data.add(RatingData("3", "20", "3"))
            data.add(RatingData("2", "5", "1"))
            data.add(RatingData("1", "1", "0"))

            return data
        }
    }
}
