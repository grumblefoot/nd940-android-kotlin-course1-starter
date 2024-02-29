package com.udacity.shoestore.instructions

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InstructionViewModel : ViewModel() {

    private val _navigateToShoe = MutableLiveData<Boolean>()
    val navigateToShoe: LiveData<Boolean>
        get() = _navigateToShoe

    fun onContinueClicked() {
        _navigateToShoe.value = true
    }

    fun onNavigationDone() {
        _navigateToShoe.value = false
    }
}