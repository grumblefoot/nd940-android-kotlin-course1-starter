package com.udacity.shoestore.instructions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionDestinationBinding
import com.udacity.shoestore.databinding.FragmentWelcomeDestinationBinding
import com.udacity.shoestore.welcome.WelcomeViewModel
import timber.log.Timber

class InstructionFragment  : Fragment() {

    private val viewModel: InstructionViewModel by viewModels()
    private lateinit var binding: FragmentInstructionDestinationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_instruction_destination, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        viewModel.navigateToShoe.observe(viewLifecycleOwner) { shouldNavigate ->
            if (shouldNavigate) {
                Timber.d("Navigation to shoe Screen")
                findNavController().navigate(R.id.action_instruction_destination_to_shoeFragment)
                viewModel.onNavigationDone()
            }

        }

        return binding.root
        /*
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_instruction_destination, container, false)
        val loginButton: Button = view.findViewById(R.id.instruction_button)
        loginButton.setOnClickListener {
            Timber.d("Into button clicked")
            findNavController().navigate(R.id.action_instruction_destination_to_shoeFragment)
        }

        return view

         */
    }


}