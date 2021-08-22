package com.example.kidya.ui.menu.orders.onboarding.page.ongoingData

import com.example.kidya.R


data class OngoingOrderData(val orderNumber: String, val orderCount: String, val totalCost: String, val orderDate: String, val colorComplete: Int, val pointComplete: Int, val pointWait: Int, val colorWait: Int, val lineComplete: Int)

class MockData(){
    companion object{
        fun putOrder(): List<OngoingOrderData> {
            val data = ArrayList<OngoingOrderData>()
            data.add(OngoingOrderData("11447034", "4", "956 000 сум", "05-12-2020", R.color.mainColor, R.drawable.ic_passed_point, R.drawable.ic_waiting_point, R.color.textColor, R.drawable.ic_passwd_line))
            data.add(OngoingOrderData("11447034", "4", "956 000 сум", "05-12-2020", R.color.mainColor, R.drawable.ic_passed_point, R.drawable.ic_waiting_point, R.color.textColor, R.drawable.ic_passwd_line))
            data.add(OngoingOrderData("11447034", "4", "956 000 сум", "05-12-2020", R.color.mainColor, R.drawable.ic_passed_point, R.drawable.ic_waiting_point, R.color.textColor, R.drawable.ic_passwd_line))
            data.add(OngoingOrderData("11447034", "4", "956 000 сум", "05-12-2020", R.color.mainColor, R.drawable.ic_passed_point, R.drawable.ic_waiting_point, R.color.textColor, R.drawable.ic_passwd_line))
            return data
        }
    }
}
