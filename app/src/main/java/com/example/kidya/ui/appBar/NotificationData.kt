package com.example.kidya.ui.appBar


data class NotificationData(val title : String, val date : String, val content : String)

class EnterData{
    companion object{
        fun putNews():List<NotificationData>{
            val data = ArrayList<NotificationData>()
            data.add(NotificationData("Lorem ipsum dolor sit amet, consectetur adipiscing elit. ", "10.10.2021", "CONTEXT"))
            data.add(NotificationData("Lorem ipsum dolor sit amet, consectetur adipiscing elit. ", "10.10.2021", "CONTEXT"))
            data.add(NotificationData("Lorem ipsum dolor sit amet, consectetur adipiscing elit. ", "10.10.2021", "CONTEXT"))
            data.add(NotificationData("Lorem ipsum dolor sit amet, consectetur adipiscing elit. ", "10.10.2021", "CONTEXT"))

            return data
        }
    }
}
