package com.example.kidya.ui.menu.messages

import com.example.kidya.R

data class ChatsData(val sender: String, val messageStart: String, val numberMessage: String, val senderAvatar: Int, val time: String)

class MockData{
    companion object{
        fun putChat():List<ChatsData>{
            val data = ArrayList<ChatsData>()
            data.add(ChatsData("ADIDAS Uzbekistan","Amet minim mollit non deserunt","1", R.drawable.ava, "09:41"))
            data.add(ChatsData("LC WAIKIKI","Amet minim mollit non deserunt ","2", R.drawable.ava1, "09:41"))
            data.add(ChatsData("Erkatoy Kids Shop","Amet minim mollit non deserunt ","10", R.drawable.ava2, "09:41"))
            return data
        }
    }
}

