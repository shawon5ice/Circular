package com.example.circular.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.circular.api.CircularService
import com.example.circular.models.Circular

class CircularRepository(private val circularService: CircularService) {
    private val circularLiveData = MutableLiveData<Circular>()
    val circulars : LiveData<Circular>
        get() = circularLiveData

    suspend fun getCirculars(){
        val result = circularService.getCircular()

        if(result?.body() != null){
            circularLiveData.postValue(result.body())
        }
    }
}