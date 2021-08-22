package com.example.kidya.ui.basket

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.R
import com.example.kidya.databinding.FragmentBasketBinding

class BasketFragment : Fragment() {

    private var _binding: FragmentBasketBinding? = null
    private val binding get() = _binding!!
    var adapter = BasketAdapter()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBasketBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.auth.setOnClickListener {
            binding.auth.visibility = View.GONE
            binding.loginForOrder.visibility = View.GONE
            binding.order.visibility = View.VISIBLE
        }

        adapter.onItemClick={
            findNavController().navigate(R.id.action_navigation_basket_to_productFragment)
        }

        binding.order.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_basket_to_orderFragment)
        }
        init()
        return root
    }

    private fun init() = with(binding){
        basketRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        basketRecycler.adapter = adapter
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}