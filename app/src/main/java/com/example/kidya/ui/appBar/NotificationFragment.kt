package com.example.kidya.ui.appBar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.R
import com.example.kidya.databinding.FragmentNotificationBinding

class NotificationFragment : Fragment() {
    private var _binding: FragmentNotificationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNotificationBinding.inflate(inflater, container,false)
        val root: View = binding.root

//        init()
        return root
    }

//    private fun init() = with(binding){
//        notificationRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
//         notificationRecycler.adapter = NotificationAdapter()
//    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}








