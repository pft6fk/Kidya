package com.example.kidya.ui.catalog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kidya.MainActivity
import com.example.kidya.R
import com.example.kidya.databinding.FragmentDashboardBinding
import com.example.kidya.databinding.FragmentNewsBinding
import com.example.kidya.ui.news.NewsAdapter

class DashboardFragment : Fragment() {

    private lateinit var mainActivity: MainActivity
    private var _binding: FragmentDashboardBinding? = null
    lateinit var categoryAdapter: CategoryAdapter

    private val binding get() = _binding !!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainActivity = requireActivity() as MainActivity
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        categoryAdapter = CategoryAdapter()
        categoryAdapter.onItemClick ={
            findNavController().navigate(R.id.action_navigation_dashboard_to_subcategory)
        }

        init()

        return root
    }
    private fun init(){
        binding.apply {

            fragmentRecyclerCategory.layoutManager = GridLayoutManager(requireContext(), 2)
            fragmentRecyclerCategory.adapter = categoryAdapter

        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onResume() {
        super.onResume()
        mainActivity.putTitle("Категории")
    }
}