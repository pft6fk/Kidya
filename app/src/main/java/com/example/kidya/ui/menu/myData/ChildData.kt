package com.example.kidya.ui.menu.myData

data class ChildData(val name: String, val birthday: String, val sex: String)

class MockData(){
    companion object{
        fun putData(): List<ChildData>{
            val data = ArrayList<ChildData>()
            data.add(ChildData("Devon Lane", "10 лет", "Девочка"))
            data.add(ChildData("Annette Black", "12 лет", "Мальчик"))
            return data
        }
    }
}
