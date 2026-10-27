package com.example.pantodeventaspp.ui.home

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val _state = mutableStateOf(HomeState())
    val state = _state

    init {
        loadProducts()
    }

    private fun loadProducts() {
        _state.value = _state.value.copy(isLoading = true)

        viewModelScope.launch {
            delay(500)
            val products = listOf(
                Product("Laptop", 25000.0, Color(0xFFFFEBEE)),
                Product("Mouse", 450.0, Color(0xFFE3F2FD)),
                Product("Teclado", 1200.0, Color(0xFFE8F5E8)),
                Product("Monitor", 5800.0, Color(0xFFFFF8E1)),
                Product("Tablet", 8900.0, Color(0xFFF3E5F5)),
                Product("Impresora", 3200.0, Color(0xFFE0F2F1))
            )
            _state.value = _state.value.copy(
                products = products,
                isLoading = false
            )
        }
    }
}

data class HomeState(
    val products: List<Product> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)

data class Product(
    val nombre: String,
    val precio: Double,
    val color: Color
)