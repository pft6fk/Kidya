package com.example.kidya.ui.menu.orders.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kidya.MainActivity
import com.example.kidya.R
import com.example.kidya.databinding.FragmentViewPagerBinding
import com.google.android.material.tabs.TabLayoutMediator

class ViewPagerFragment : Fragment() {
    lateinit var mainActivity: MainActivity
    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mainActivity = requireActivity() as MainActivity
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val adapter = ViewPagerAdapter(requireActivity().supportFragmentManager, lifecycle)
        binding.viewPager2.adapter = adapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager2){
            tab, position ->
            when(position){
                0 ->{
                    tab.text = "История Заказов"
                }
                1  -> {
                    tab.text = "Текущие заказы"
                }
            }
        }.attach()
        return root
    }

    override fun onResume() {
        super.onResume()
        mainActivity.hideBottomNav()
        mainActivity.putTitle("Мои заказы")
    }

    override fun onPause() {
        super.onPause()
        mainActivity.showBottomNav()
    }
}