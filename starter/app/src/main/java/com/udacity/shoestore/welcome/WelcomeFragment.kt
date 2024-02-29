package com.udacity.shoestore.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentWelcomeDestinationBinding
import timber.log.Timber

class WelcomeFragment : Fragment() {

    private val viewModel: WelcomeViewModel by viewModels()
    private lateinit var binding: FragmentWelcomeDestinationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_welcome_destination, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        viewModel.navigateToWelcome.observe(viewLifecycleOwner) { shouldNavigate ->
            if (shouldNavigate) {
                Timber.d("Navigation to Instruction Screen")
                findNavController().navigate(R.id.action_welcome_destination_to_instruction_destination)
                viewModel.onNavigationDone()
            }

        }

        return binding.root
    }
        /*
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome_destination, container, false)
        val loginButton: Button = view.findViewById(R.id.welcome_button)
        loginButton.setOnClickListener {
            Timber.d("Welcome button clicked")
            findNavController().navigate(R.id.action_welcome_destination_to_instruction_destination)
        }

        return view
         */


}