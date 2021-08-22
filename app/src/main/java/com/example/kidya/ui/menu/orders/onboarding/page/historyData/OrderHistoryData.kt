package com.example.kidya.ui.menu.orders.onboarding.page.historyData

data class OrderHistoryData(val orderNumber: String, val orderCount: String, val totalCost: String, val orderDate: String)

class MockData(){
    companion object{
        fun putOrder(): List<OrderHistoryData> {
            val data = ArrayList<OrderHistoryData>()
            data.add(OrderHistoryData("11447034", "4", "956 000 сум", "05-12-2020"))
            data.add(OrderHistoryData("11447034", "4", "956 000 сум", "05-12-2020"))
            data.add(OrderHistoryData("11447034", "4", "956 000 сум", "05-12-2020"))
            data.add(OrderHistoryData("11447034", "4", "956 000 сум", "05-12-2020"))
            return data
        }
    }
}
