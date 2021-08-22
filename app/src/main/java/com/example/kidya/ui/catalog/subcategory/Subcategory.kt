package com.example.kidya.ui.catalog.subcategory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.R
import com.example.kidya.databinding.FragmentSubcategoryBinding

class Subcategory : Fragment() {
    val subcategoryAdapter: SubcategoryAdapter = SubcategoryAdapter()
    private var _binding: FragmentSubcategoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSubcategoryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        init()
        subcategoryAdapter.onItemClick={
            findNavController().navigate(R.id.action_subcategory_to_ClotheCategoryFragment)
        }

        return root
    }

    private fun init() {
        binding.apply {
            subcategoryRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            subcategoryRecycler.adapter = subcategoryAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}