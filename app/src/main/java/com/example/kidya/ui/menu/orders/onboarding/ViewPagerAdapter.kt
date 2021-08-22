package com.example.kidya.ui.menu.orders.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kidya.ui.menu.orders.onboarding.page.OngoingOrder
import com.example.kidya.ui.menu.orders.onboarding.page.OrderHistory

class ViewPagerAdapter(fm: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fm, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {
                OrderHistory()
            }
            1 -> {
                OngoingOrder()
            }
            else -> {
                Fragment()
            }
        }
    }

}