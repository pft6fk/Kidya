package com.example.kidya.ui.menu.messages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.MainActivity
import com.example.kidya.R
import com.example.kidya.databinding.FragmentMessagesBinding


class MessagesFragment : Fragment() {
    private var _binding: FragmentMessagesBinding? = null
    private val binding get() = _binding!!
    var adapter = ChatsAdapter()
    lateinit var mainActivity: MainActivity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainActivity = requireActivity() as MainActivity
        _binding = FragmentMessagesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        adapter.onItemClick={
            Toast.makeText(requireContext(), "Works fine", Toast.LENGTH_SHORT).show()
//            findNavController().navigate()
        }
        init()
        // Inflate the layout for this fragment
        return root
    }

    private fun init() = with(binding){
        chatRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        chatRecycler.adapter = adapter
    }

    override fun onPause() {
        super.onPause()
        mainActivity.showBottomNav()
    }

    override fun onResume() {
        super.onResume()
        mainActivity.hideBottomNav()
        mainActivity.putTitle("Сообщение")
    }
}