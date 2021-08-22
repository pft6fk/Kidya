package com.example.kidya.ui.news

import com.example.kidya.R

data class NewsData(val img : Int, val heading : String, val date : String)

class NewsDataHelper{
    companion object{
        fun getNewsList():List<NewsData>{
            val data = ArrayList<NewsData>()
            data.add(NewsData(R.drawable.img, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Imperdiet varius nec laoreet nullam eget sem diam lectus.", "10.10.2020"))
            data.add(NewsData(R.drawable.img1, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Imperdiet varius nec laoreet nullam eget sem diam lectus.", "10.10.2020"))
            data.add(NewsData(R.drawable.img2, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Imperdiet varius nec laoreet nullam eget sem diam lectus.", "10.10.2020"))

            return data
        }
    }
}
