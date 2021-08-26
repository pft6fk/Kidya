package com.example.kidya.ui.menu.myData

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.kidya.R
import com.example.kidya.databinding.FragmentBottomSheetFilterBinding
import com.example.kidya.databinding.FragmentChildAddBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.button.MaterialButton

class ChildAddFragment : BottomSheetDialogFragment() {
    private var _binding: FragmentChildAddBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChildAddBinding.inflate(inflater, container, false)
        val root = binding.root

        //dismiss when button clicked
        binding.addChild.setOnClickListener {
            Toast.makeText(requireContext(), "Добвалено", Toast.LENGTH_SHORT).show()
            dismiss()
        }

        // Inflate the layout for this fragment
        return root
    }


}