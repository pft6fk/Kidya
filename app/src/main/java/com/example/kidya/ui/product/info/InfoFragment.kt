package com.example.kidya.ui.product.info

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.MainActivity
import com.example.kidya.databinding.FragmentInfoBinding


class InfoFragment : Fragment() {

    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!
    var adapter = InfoAdapter()
    lateinit var mainActivity: MainActivity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInfoBinding.inflate(inflater, container, false)
        val root: View = binding.root
        mainActivity = requireActivity() as MainActivity

        init()
        return root
    }

    private fun init(){
        binding.apply {
            infoRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            infoRecycler.adapter = adapter
//            hiding bottomNavigation
            mainActivity.hideBottomNav()
        }
    }

    override fun onPause() {
        super.onPause()
//        start showing bottomNavigation
        mainActivity.showBottomNav()
    }

    override fun onResume() {
        super.onResume()
        mainActivity.hideBottomNav()
        mainActivity.putTitle("Информация о продукте")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}