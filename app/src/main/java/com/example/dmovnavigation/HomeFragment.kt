package com.example.dmovnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.dmovnavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding = FragmentHomeBinding.inflate(layoutInflater)

        //action_homeFragment_to_insideHome
        val navController = findNavController()
        binding.buttonToInside.setOnClickListener{
            //navController.navigate(R.id.action_homeFragment_to_insideHome)
        val testArgument = "desde el home"
        val directions = HomeFragmentDirections.actionHomeFragmentToInsideHome(testArgument)
            navController.navigate(directions)
        }

        return binding.root
    }
}