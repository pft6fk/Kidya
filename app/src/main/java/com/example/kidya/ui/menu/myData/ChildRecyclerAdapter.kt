package com.example.kidya.ui.menu.myData

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.databinding.ItemChildBinding
import com.google.android.material.datepicker.MaterialDatePicker

class ChildRecyclerAdapter:RecyclerView.Adapter<ChildRecyclerAdapter.Holder>() {
        val childList = MockData.putData()
        var onItemClick: (() -> Unit)? = null
        inner class Holder(var binding: ItemChildBinding): RecyclerView.ViewHolder(binding.root) {
            init {
                binding.option.setOnClickListener {
                    onItemClick?.invoke()
                }
            }
            fun connect(data: ChildData) = with(binding){
                childName.text = data.name
                childAge.text = data.birthday
                childSex.text = data.sex
            }
        }
    val datePicker = MaterialDatePicker.Builder.datePicker().setTitleText("Select date").setSelection(MaterialDatePicker.todayInUtcMilliseconds()).build()



        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
            val binding = ItemChildBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return Holder(binding)
        }

        override fun onBindViewHolder(holder: Holder, position: Int) {
            holder.connect(childList[position])
        }

        override fun getItemCount(): Int {
            return childList.size
        }
}