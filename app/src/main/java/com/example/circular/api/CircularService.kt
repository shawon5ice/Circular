package com.example.circular.api

import com.example.circular.models.Circular
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CircularService {

    @GET("/interviewtest/interviewJson.json")
    suspend fun getCircular(): Response<Circular>
}