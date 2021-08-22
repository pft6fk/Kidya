package com.example.kidya.ui.product.rating

data class ReviewData(val name: String, val date: String, val Review: String, val rating: String)

class MockReviewData{
    companion object{
        fun putReview(): List<ReviewData>{
            val data = ArrayList<ReviewData>()
            data.add(ReviewData("Guy Hawkins", "05-12-2020", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Netus amet convallis sem eu posuere consequat. Ornare sagittis potenti vulputate vel nunc aliquet. Venenatis.","4"))
            data.add(ReviewData("Guy Hawkins", "05-12-2020", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Netus amet convallis sem eu posuere consequat. Ornare sagittis potenti vulputate vel nunc aliquet. Venenatis.","4"))
            data.add(ReviewData("Guy Hawkins", "05-12-2020", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Netus amet convallis sem eu posuere consequat. Ornare sagittis potenti vulputate vel nunc aliquet. Venenatis.","4"))
            data.add(ReviewData("Guy Hawkins", "05-12-2020", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Netus amet convallis sem eu posuere consequat. Ornare sagittis potenti vulputate vel nunc aliquet. Venenatis.","4"))
            return data
        }
    }
}
