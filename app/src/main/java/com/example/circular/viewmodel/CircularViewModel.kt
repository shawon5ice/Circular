package com.example.circular.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.circular.models.Circular
import com.example.circular.repository.CircularRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CircularViewModel(private val repository: CircularRepository): ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getCirculars()
        }

    }
    val circulars : LiveData<Circular>
        get() = repository.circulars

}