package com.example.kidya.ui.news

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.R

import com.example.kidya.databinding.FragmentNewsBinding


class NewsFragment : Fragment(){

    private var _binding: FragmentNewsBinding? = null
    private val binding get() = _binding!!
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        newsAdapter = NewsAdapter()
        newsAdapter.onItemClick={
            findNavController().navigate(R.id.action_newsFragment_to_insideNewsFragment)
        }

        init()
        return root
    }

    private fun init() {
        binding.apply {
            newsRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            newsRecycler.adapter = newsAdapter

        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}