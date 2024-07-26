package com.example.loginappjetpack

data class ApiResponse(
    val success: Boolean,
    val data: ApiData
)

data class ApiData(
    val logoImage: String,
    val title: String,
    val headline: String
)
