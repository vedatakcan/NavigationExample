package com.vedatakcan.navigationexample.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.vedatakcan.navigationexample.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSendToDetailFragmentId.setOnClickListener {

            val message = binding.inputMessageId.text.toString()

            val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(message)
            findNavController().navigate(action)

        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Bellek sızıntısını önlemek için binding'i sıfırlıyoruz.
    }

}