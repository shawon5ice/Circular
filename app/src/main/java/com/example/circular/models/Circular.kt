package com.example.circular.models

data class Circular(
    val common: Common,
    val data: List<Data>,
    val message: String,
    val statusCode: String
)