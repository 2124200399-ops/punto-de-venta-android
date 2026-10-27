package com.example.pantodeventaspp.ui.login

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {
    private val _state = mutableStateOf(LoginState())
    val state = _state

    fun onEmailChange(email: String) {
        _state.value = _state.value.copy(email = email)
    }

    fun onPasswordChange(password: String) {
        _state.value = _state.value.copy(password = password)
    }

    fun login(email: String, password: String, onSuccess: () -> Unit) {
        _state.value = _state.value.copy(isLoading = true, error = null)

        viewModelScope.launch {
            delay(1000)
            if (email == "erodriguezvargas22@gmail.com" && password == "1234") {
                _state.value = _state.value.copy(isLoading = false)
                onSuccess()
            } else {
                _state.value = _state.value.copy(
                    isLoading = false,
                    error = "Credenciales incorrectas"
                )
            }
        }
    }

    fun clearError() {
        _state.value = _state.value.copy(error = null)
    }
}

data class LoginState(
    val email: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val error: String? = null
)