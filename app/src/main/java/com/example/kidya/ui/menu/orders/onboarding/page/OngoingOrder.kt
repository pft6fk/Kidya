package com.example.kidya.ui.menu.orders.onboarding.page

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.R
import com.example.kidya.databinding.FragmentOngoingOrderBinding
import com.example.kidya.databinding.ItemOrderHistoryBinding
import com.example.kidya.ui.menu.orders.onboarding.page.ongoingData.OngoingOrderAdapter

class OngoingOrder : Fragment() {
    private var _binding: FragmentOngoingOrderBinding? = null
    private val binding get() = _binding!!
    var adapter = OngoingOrderAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOngoingOrderBinding.inflate(inflater, container,false)
        val root: View = binding.root
        adapter.onItemClick={
            findNavController().navigate(R.id.action_viewPagerFragment_to_moreOngoingOrderFragment)
        }
        init()
        // Inflate the layout for this fragment
        return root
    }
    private fun init() = with(binding){
        ongoingOrderRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        ongoingOrderRecycler.adapter = adapter
    }


}