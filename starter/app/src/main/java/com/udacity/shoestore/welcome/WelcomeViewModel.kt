package com.udacity.shoestore.welcome

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WelcomeViewModel : ViewModel() {

    private val _navigateToInstruction = MutableLiveData<Boolean>()
    val navigateToWelcome: LiveData<Boolean>
        get() = _navigateToInstruction

    fun onContinueClicked() {
        _navigateToInstruction.value = true
    }

    fun onNavigationDone() {
        _navigateToInstruction.value = false
    }
}