package com.example.kidya.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.MainActivity
import com.example.kidya.R
import com.example.kidya.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null
    lateinit var mainActivity: MainActivity

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    var clotheAdapter = clotheAdapter()
    var clotheAdapterSale = clotheAdapterSale()
    var popularCategoryAdapter = PopularCategoryAdapter()
    var homeNewsRecyclerAdapter = HomeNewsRecyclerAdapter()
    var brandAdapter = BrandAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainActivity = requireActivity() as MainActivity
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        clotheAdapter.onItemClick = {
            findNavController().navigate(R.id.action_navigation_home_to_productFragment)
        }

        popularCategoryAdapter.onItemClick={
            findNavController().navigate(R.id.action_navigation_home_to_subcategory)
        }

        clotheAdapterSale.onItemClick = {
            findNavController().navigate(R.id.action_navigation_home_to_productFragment)
        }

        homeNewsRecyclerAdapter.onItemClick = {
            findNavController().navigate(R.id.action_navigation_home_to_insideNewsFragment)
        }



        init()

        return root
    }
    private fun init(){
        binding.apply {
            saleRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            saleRecycler.adapter = clotheAdapterSale

            newArrivalsRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            newArrivalsRecycler.adapter = clotheAdapter

            brandRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            brandRecycler.adapter = brandAdapter

            recommendedRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            recommendedRecycler.adapter = clotheAdapter

            popularCategory.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            popularCategory.adapter = popularCategoryAdapter

            newsRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            newsRecycler.adapter = homeNewsRecyclerAdapter

            recommendedRecycler1.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            recommendedRecycler1.adapter = clotheAdapter
        }
    }

    override fun onStop() {
        super.onStop()
        mainActivity.appBarHomeGone()
    }

    override fun onResume() {
        super.onResume()
        mainActivity.appBarHomeVisible()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}