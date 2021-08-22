package com.example.kidya.ui.product.info

data class InfoData(val type: String, val data: String)

class MockInfoData(){
    companion object{
        fun takeInfo():List<InfoData>{
            val data = ArrayList<InfoData>()
            data.add(InfoData("Состав", "100% хлопок"))
            data.add(InfoData("Комплектация", "Платье"))
            data.add(InfoData("Вес", "100 гр"))
            data.add(InfoData("Вид застёжки", "Без застёжки"))
            data.add(InfoData("Длина рукова", "Без рукавов"))
            data.add(InfoData("Назначение", "Повседневное"))
            data.add(InfoData("Цвет", "Синий"))
            data.add(InfoData("Материал", "Трикотажный"))
            return data
        }
    }
}
