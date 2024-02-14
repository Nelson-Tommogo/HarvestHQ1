package com.example.harvesthq.apiservices

data class WeatherResponse(
    val main: Main,
    // Add other fields as needed
)

data class Main(
    val temp: Double,
    // Add other fields as needed
)
