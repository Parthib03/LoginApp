package com.example.loginappjetpack

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class SignedInViewModel(private val repository: SignedInRepository) : ViewModel() {
    private val _apiData = MutableLiveData<ApiResponse>()
    val apiData: LiveData<ApiResponse> get() = _apiData

    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> get() = _errorMessage

    init {
        fetchApiData()
    }

    private fun fetchApiData() {
        viewModelScope.launch {
            repository.fetchApiData { result ->
                result.onSuccess {
                    _apiData.value = it
                    _errorMessage.value = null  // Clear any previous error message
                }.onFailure {
                    _errorMessage.value = "Failed to load data: ${it.message}"  // Set error message
                }
            }
        }
    }
}
