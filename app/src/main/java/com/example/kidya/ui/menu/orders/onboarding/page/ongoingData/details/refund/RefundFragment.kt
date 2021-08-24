package com.example.kidya.ui.menu.orders.onboarding.page.ongoingData.details.refund

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.MainActivity
import com.example.kidya.R
import com.example.kidya.databinding.FragmentRefundBinding

class RefundFragment : Fragment() {
    private var _binding: FragmentRefundBinding? = null
    private val binding get() = _binding!!
    private lateinit var mainActivity: MainActivity
    val adapter = RefundAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainActivity = requireActivity() as MainActivity
        _binding = FragmentRefundBinding.inflate(inflater, container, false)
        val root: View = binding.root

        init()
        binding.send.setOnClickListener {
            Toast.makeText(requireContext(), "Заявка была отправлена", Toast.LENGTH_SHORT).show()
        }
        return root
    }

    private fun init() = with(binding){
        refundRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        refundRecycler.adapter = adapter

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