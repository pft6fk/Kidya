package com.example.kidya.ui.favourite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kidya.MainActivity
import com.example.kidya.R
import com.example.kidya.databinding.FragmentFavouriteBinding


class FavouriteFragment : Fragment() {

    private lateinit var mainActivity: MainActivity
    private var _binding: FragmentFavouriteBinding? = null
    private val binding get() = _binding!!
    var adapter = FavouriteAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mainActivity = requireActivity() as MainActivity
        _binding = FragmentFavouriteBinding.inflate(inflater, container, false)
        val root: View = binding.root

        adapter.onItemClick = {
            findNavController().navigate(R.id.action_navigation_favourite_to_productFragment)
        }

        init()
        return root
    }
    fun init() = with(binding){
        favouriteRecycler.layoutManager = GridLayoutManager(requireContext(), 2)
        favouriteRecycler.adapter = adapter
    }


    override fun onResume() {
        super.onResume()
        mainActivity.putTitle("Избранное")
    }


}