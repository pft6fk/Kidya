package com.example.kidya.ui.catalog.subcategory.clotheCategory

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.kidya.R
import com.example.kidya.databinding.FragmentBottomSheetFilterBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomSheetFilterFragment : BottomSheetDialogFragment() {
    private var _binding: FragmentBottomSheetFilterBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("ResourceAsColor")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBottomSheetFilterBinding.inflate(inflater, container, false)
        val root: View = binding.root


        // Inflate the layout for this fragment
        return root
    }


}