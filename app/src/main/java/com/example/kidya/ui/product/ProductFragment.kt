package com.example.kidya.ui.product

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.MainActivity
import com.example.kidya.R
import com.example.kidya.databinding.FragmentProductBinding
import com.example.kidya.ui.home.clotheAdapter
import com.example.kidya.ui.product.rating.RatingAdapter


class ProductFragment : Fragment() {
    private var _binding : FragmentProductBinding? = null
    private val binding get() = _binding!!
    lateinit var mainActivity: MainActivity
    var adapter = clotheAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainActivity = requireActivity() as MainActivity
        _binding = FragmentProductBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // adapter for list
        val colors = resources.getStringArray(R.array.color)
        val colorAdapter = ArrayAdapter(requireContext(), R.layout.item_dropdown_color, colors)
        binding.autoCompleteColor.setAdapter(colorAdapter)

        val clote_size = resources.getStringArray(R.array.clote_size)
        val sizeAdapter = ArrayAdapter(requireContext(), R.layout.item_dropdown_color, clote_size)
        binding.autoCompleteSize.setAdapter(sizeAdapter)

        binding.frameDelivery.setOnClickListener{
            findNavController().navigate(R.id.action_productFragment_to_deliveryFragment)
        }

        binding.frameInfo.setOnClickListener {
            findNavController().navigate(R.id.action_productFragment_to_infoFragment)
        }

        binding.frameRating.setOnClickListener {
            findNavController().navigate(R.id.action_productFragment_to_ratingFragment)
        }

        adapter.onItemClick = {
            findNavController().navigate(R.id.action_productFragment_self)
        }
        binding.addBasket.setOnClickListener {
            Toast.makeText(requireContext(), "Добавлено в корзину", Toast.LENGTH_SHORT).show()
        }

        binding.chat.setOnClickListener{
            findNavController().navigate(R.id.action_productFragment_to_messagesFragment)
        }

        init()
        return root
    }
    private fun init(){
        binding.shopRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.shopRecycler.adapter = adapter

        binding.sameRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.sameRecycler.adapter = adapter


        mainActivity.hideBottomNav()
    }



    override fun onPause() {
        super.onPause()
        mainActivity.showBottomNav()
    }

    override fun onResume() {
        super.onResume()
        mainActivity.hideBottomNav()
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}


