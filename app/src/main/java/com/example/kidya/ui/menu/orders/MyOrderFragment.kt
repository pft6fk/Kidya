package com.example.kidya.ui.menu.orders

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kidya.MainActivity
import com.example.kidya.R
import com.example.kidya.databinding.FragmentMyOrderBinding

class MyOrderFragment : Fragment() {
    private var _binding: FragmentMyOrderBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMyOrderBinding.inflate(inflater, container, false)
        val root: View = binding.root
        // Inflate the layout for this fragment


        return root
    }


}