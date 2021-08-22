package com.example.kidya.ui.news

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kidya.R
import com.example.kidya.databinding.FragmentInsideNewsBinding
import com.example.kidya.databinding.FragmentNotificationBinding

class InsideNewsFragment : Fragment() {
    private var _binding: FragmentInsideNewsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInsideNewsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Inflate the layout for this fragment
        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}