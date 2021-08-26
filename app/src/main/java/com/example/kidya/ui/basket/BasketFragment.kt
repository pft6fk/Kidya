package com.example.kidya.ui.basket

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.MainActivity
import com.example.kidya.R
import com.example.kidya.databinding.FragmentBasketBinding

class BasketFragment : Fragment() {

    private lateinit var mainActivity: MainActivity
    private var _binding: FragmentBasketBinding? = null
    private val binding get() = _binding!!
    var adapter = BasketAdapter()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainActivity = requireActivity() as MainActivity
        _binding = FragmentBasketBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.auth.setOnClickListener {
            binding.auth.visibility = View.GONE
            binding.loginForOrder.visibility = View.GONE
            binding.order.visibility = View.VISIBLE
        }

        adapter.onItemClick={
            findNavController().navigate(R.id.action_navigation_basket_to_productFragment)
        }

        //showing popup menu
        adapter.onItemClick={
            showMenu(binding.basketRecycler.findViewById(R.id.menu), R.menu.popup_more_menu)
        }


        binding.order.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_basket_to_orderFragment)
        }
        init()
        return root
    }


    private fun showMenu(v: View, popupMoreMenu: Int) {
        val popup = PopupMenu(requireContext(), v)
        popup.menuInflater.inflate(popupMoreMenu, popup.menu)

        popup.setOnDismissListener {
            // Respond to popup being dismissed.
        }
        // Show the popup menu.
        popup.show()

    }

    private fun init() = with(binding){
        basketRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        basketRecycler.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onResume() {
        super.onResume()
        mainActivity.putTitle("Корзина")
    }
}