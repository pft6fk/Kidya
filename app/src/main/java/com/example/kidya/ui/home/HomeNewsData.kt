package com.example.kidya.ui.home

import com.example.kidya.R

data class NewsData(val img : Int, val heading : String, val date : String)

class NewsDataHelper{
    companion object{
        fun getResourcesList():List<NewsData>{
            val data = ArrayList<NewsData>()
            data.add(NewsData(R.drawable.news_box1, "Распродажа во всех маназиназ Zara Kids", "10.10.2020"))
            data.add(NewsData(R.drawable.news_box2, "Новая коллекция в Бершка", "10.10.2020"))
            data.add(NewsData(R.drawable.news_box3, "Новая коллекция в Бершка", "10.10.2020"))

            return data
        }
    }
}
