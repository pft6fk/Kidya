package com.example.kidya.ui.menu.orders.onboarding.page

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.R
import com.example.kidya.databinding.FragmentOrderHistoryBinding
import com.example.kidya.ui.menu.orders.onboarding.page.historyData.OrderHistoryAdapter

class OrderHistory : Fragment() {
    private var _binding: FragmentOrderHistoryBinding? = null
    private val binding get() = _binding!!
    val adapter = OrderHistoryAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOrderHistoryBinding.inflate(inflater, container, false)
        val root: View = binding.root


        init()
        adapter.onItemClick={
            findNavController().navigate(R.id.action_viewPagerFragment_to_moreHistoryOrderFragment)
        }
        // Inflate the layout for this fragment
        return root
    }

    private fun init(){
        binding.historyOrderRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.historyOrderRecycler.adapter = adapter
    }


}