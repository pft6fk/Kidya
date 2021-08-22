package com.example.kidya.ui.catalog.subcategory.clotheCategory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kidya.R
import com.example.kidya.databinding.FragmentClotheCategoryBinding
import com.example.kidya.ui.home.clotheAdapter
import com.google.android.material.bottomsheet.BottomSheetDialog

class ClotheCategoryFragment : Fragment() {

    private var _binding: FragmentClotheCategoryBinding? = null
    private val binding get() = _binding!!
    lateinit var adapter : clotheAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentClotheCategoryBinding.inflate(inflater, container, false)
        val root: View = binding.root
        adapter = clotheAdapter()
        adapter.onItemClick={
            findNavController().navigate(R.id.action_clotheCategoryFragment_to_productFragment)
        }
        
        init()


        binding.sortBy.setOnClickListener {
            findNavController().navigate(R.id.action_clotheCategoryFragment_to_bottomSheetFilterFragment)
        }

        return root
    }

    private fun init() {
        binding.apply {
            cloteCategoryRecyclre.layoutManager = GridLayoutManager(requireContext(),2)
            cloteCategoryRecyclre.adapter = adapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}