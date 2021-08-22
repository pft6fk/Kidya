package com.example.kidya.ui.product.delivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kidya.MainActivity
import com.example.kidya.databinding.FragmentDeliveryBinding


class DeliveryFragment : Fragment() {
    private var _binding : FragmentDeliveryBinding? = null
    private val binding get() = _binding!!
    lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainActivity = requireActivity() as MainActivity
        _binding = FragmentDeliveryBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }
    override fun onPause() {
        super.onPause()
//        start showing bottomNavigation
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

