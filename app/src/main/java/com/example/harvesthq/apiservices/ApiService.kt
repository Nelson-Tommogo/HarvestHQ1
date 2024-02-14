package com.example.harvesthq.apiservices

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("weather")
    fun getWeather(
        @Query("c3b8ee6517dbf30fa4329694683ac2a0\n") apiKey: String,
        @Query("Nairobi") city: String
    ): Call<WeatherResponse>
}