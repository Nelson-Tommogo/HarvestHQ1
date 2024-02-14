package com.example.harvesthq.app

import android.annotation.SuppressLint
import android.telecom.Call
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.harvesthq.R
import com.example.harvesthq.apiservices.ApiClient
import com.example.harvesthq.apiservices.ApiService
import com.example.harvesthq.apiservices.WeatherResponse
import com.example.harvesthq.navigation.Topbar
import retrofit2.Callback
import retrofit2.Response

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomePage(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.green1)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            content = {
                Topbar()
                Adverts()
                Adds()
                HHQP()
                FOP()
                ADDS()
            }
        )
    }
}


@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun Adds(){
}

@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun ADDS(){
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HHQP(apiKey: String) {
    var cityName by remember { mutableStateOf("Nairobi") }
    var weatherResponse by remember { mutableStateOf<WeatherResponse?>(null) }
    var isLoading by remember { mutableStateOf(false) }
    var isError by remember { mutableStateOf(false) }

    // Trigger API call when the composable is first recomposed
    LaunchedEffect(true) {
        getWeatherData(apiKey, cityName)
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .background(color = colorResource(id = R.color.green1))
            .padding(16.dp),
        onClick = {
            // You can handle click behavior here if needed
        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("HarvestHQ Section")

            // Display weather information or loading/error state
            when {
                isLoading -> {
                    CircularProgressIndicator(
                        modifier = Modifier
                            .size(50.dp)
                            .padding(16.dp)
                    )
                }
                isError -> {
                    Text("Error fetching weather data.")
                }
                else -> {
                    weatherResponse?.let {
                        Text("Temperature: ${it.main.temp}")
                        // Add other fields as needed
                    }
                }
            }
        }
    }
}

@Composable
fun getWeatherData(apiKey: String, city: String) {
    val apiService = ApiClient.getRetrofitInstance().create(ApiService::class.java)

    val call: Call<WeatherResponse> = apiService.getWeather(apiKey, city)

    var isLoading by remember { mutableStateOf(true) }
    var isError by remember { mutableStateOf(false) }
    var weatherResponse by remember { mutableStateOf<WeatherResponse?>(null) }

    call.enqueue(object : Callback<WeatherResponse> {
        override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
            isLoading = false
            if (response.isSuccessful) {
                weatherResponse = response.body()
            } else {
                isError = true
            }
        }

        override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
            isLoading = false
            isError = true
        }
    })
}


// The getWeatherData function remains the same as in the previous example


@Composable
fun ButtonWithText(text: String, backgroundColor: Int) {
    ElevatedButton(
        onClick = {

        },
        modifier = Modifier
            .background(color = colorResource(id = backgroundColor))
            .padding(16.dp)
    ) {
        Text(text)
    }
}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FOP() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .background(color = colorResource(id = R.color.green1))
            .padding(16.dp),
        onClick = {

        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Categories")

            // Nested Cards
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                // First row with two big cards
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    ButtonWithText("Vegetable", R.color.homecards)
                    ButtonWithText("Fruits", R.color.homecards)
                }

                // Second row with three smaller cards
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    ButtonWithText("Weed Control", R.color.homecards)
                    ButtonWithText("Pest Control", R.color.homecards)
                }
            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Adverts() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(color = colorResource(id = R.color.green1))
            .padding(16.dp),
        onClick = {

        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Adverts")

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

            }
        }
    }
}


@Preview
@Composable
fun HomePagePreview() {
    val navController = rememberNavController()
    HomePage(navController = navController)
}
