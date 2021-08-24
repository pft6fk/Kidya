package com.example.kidya.ui.menu.orders.onboarding.page.ongoingData.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.MainActivity
import com.example.kidya.R
import com.example.kidya.databinding.FragmentMoreHistoryOrderBinding
import com.example.kidya.databinding.FragmentMoreOngoingOrderBinding
import com.example.kidya.ui.menu.orders.onboarding.page.historyData.details.MoreHistoryOrderAdapter

class MoreOngoingOrderFragment : Fragment() {


    lateinit var mainActivity: MainActivity
    private var _binding: FragmentMoreOngoingOrderBinding? = null
    private val binding get() = _binding!!
    var adapter = MoreHistoryOrderAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mainActivity = requireActivity() as MainActivity
        _binding = FragmentMoreOngoingOrderBinding.inflate(inflater, container, false)
        val root: View = binding.root

        init()

        binding.makeRefund.setOnClickListener {
            findNavController().navigate(R.id.action_moreOngoingOrderFragment_to_refundFragment)
        }
        return root
    }

    private fun init() = with(binding){
        recycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        recycler.adapter = adapter

    }
    override fun onResume() {
        super.onResume()
        mainActivity.hideBottomNav()
        mainActivity.putTitle("Заказ №11447034")
    }

    override fun onPause() {
        super.onPause()
        mainActivity.showBottomNav()
    }


}