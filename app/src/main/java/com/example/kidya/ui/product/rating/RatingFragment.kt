package com.example.kidya.ui.product.rating

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.MainActivity
import com.example.kidya.R
import com.example.kidya.databinding.FragmentRatingBinding

class RatingFragment : Fragment() {

    private var _binding: FragmentRatingBinding? = null
    private val binding get() = _binding!!
    var adapter = ReviewAdapter()
    var ratingAdapter = RatingAdapter()

    lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainActivity = requireActivity() as MainActivity
        _binding = FragmentRatingBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.buttonReview.setOnClickListener {
            findNavController().navigate(R.id.action_ratingFragment_to_makeReviewFragment)
        }
        init()
        return root
    }

    private fun init() = with(binding){
        reviewRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        reviewRecycler.adapter = adapter

        ratingRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        ratingRecycler.adapter = ratingAdapter
    }
    override fun onPause() {
        super.onPause()
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



