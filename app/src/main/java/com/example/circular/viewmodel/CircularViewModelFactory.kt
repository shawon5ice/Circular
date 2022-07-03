package com.example.circular.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.circular.repository.CircularRepository

class CircularViewModelFactory(private val repository: CircularRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return  return CircularViewModel(repository) as T
    }
}