package com.example.kidya.ui.basket.order

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kidya.MainActivity
import com.example.kidya.R
import com.example.kidya.databinding.FragmentMakeOrderBinding

//надо передать параметры, научись

class MakeOrderFragment : Fragment() {
    private var _binding: FragmentMakeOrderBinding? = null
    private val binding get() = _binding!!
    lateinit var mainActivity: MainActivity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainActivity = requireActivity() as MainActivity
        _binding = FragmentMakeOrderBinding.inflate(inflater, container, false)
        val root: View = binding.root
    // Inflate the layout for this fragment
        binding.makeOrder.setOnClickListener {
            findNavController().navigate(R.id.action_orderFragment_to_viewPagerFragment)
        }
        return root
}

    override fun onPause() {
        super.onPause()
        mainActivity.showBottomNav()
    }

    override fun onResume() {
        super.onResume()
        mainActivity.hideBottomNav()
    }

}