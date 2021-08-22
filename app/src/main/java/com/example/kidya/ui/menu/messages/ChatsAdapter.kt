package com.example.kidya.ui.menu.messages

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kidya.R
import com.example.kidya.databinding.ItemChatBinding

class ChatsAdapter: RecyclerView.Adapter<ChatsAdapter.Holder>() {
    var onItemClick : (() -> Unit)? = null
    val rating_list = MockData.putChat()
    inner class Holder(item: View): RecyclerView.ViewHolder(item){
        val binding = ItemChatBinding.bind(item)
        init {
            itemView.setOnClickListener {
                onItemClick?.invoke()
            }
        }
        fun put(put: ChatsData) = with(binding){
            senderImg.setImageResource(put.senderAvatar)
            senderMessage.text = put.messageStart
            senderName.text = put.sender
            messageNum.text = put.numberMessage
            time.text = put.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.put(rating_list[position])
    }

    override fun getItemCount(): Int {
        return rating_list.size
    }

}