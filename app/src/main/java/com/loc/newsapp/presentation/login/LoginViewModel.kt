package com.loc.newsapp.presentation.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val _isLoggedIn = MutableLiveData<Boolean>()
    val isLoggedIn: LiveData<Boolean>
        get() = _isLoggedIn

    fun login(username: String, password: String) {
        // Dummy logic for authentication, replace with your actual authentication logic
        val isCorrectCredentials = username == "admin" && password == "password"
        _isLoggedIn.value = isCorrectCredentials
    }
}