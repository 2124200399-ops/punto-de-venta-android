package com.example.pantodeventaspp.ui.register

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class RegisterViewModel : ViewModel() {
    private val _state = mutableStateOf(RegisterState())
    val state = _state

    fun onEmailChange(email: String) {
        _state.value = _state.value.copy(email = email)
    }

    fun onPasswordChange(password: String) {
        _state.value = _state.value.copy(password = password)
    }

    fun register(email: String, password: String, onSuccess: () -> Unit) {
        _state.value = _state.value.copy(isLoading = true, error = null)

        viewModelScope.launch {
            delay(1000)
            if (email.isNotEmpty() && password.length >= 4) {
                _state.value = _state.value.copy(
                    isLoading = false,
                    isSuccess = true
                )
                onSuccess()
            } else {
                _state.value = _state.value.copy(
                    isLoading = false,
                    error = "Datos inválidos"
                )
            }
        }
    }

    fun clearError() {
        _state.value = _state.value.copy(error = null)
    }
}

data class RegisterState(
    val email: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val error: String? = null,
    val isSuccess: Boolean = false
)