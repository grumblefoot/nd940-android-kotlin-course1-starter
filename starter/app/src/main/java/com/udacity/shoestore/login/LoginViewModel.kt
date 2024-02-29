package com.udacity.shoestore.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val _navigateToWelcome = MutableLiveData<Boolean>()
    val navigateToWelcome: LiveData<Boolean>
        get() = _navigateToWelcome

    fun onLoginClicked() {
        _navigateToWelcome.value = true
    }

    fun onNewUserClicked() {
        _navigateToWelcome.value = true
    }

    fun onNavigationDone() {
        _navigateToWelcome.value = false
    }

}