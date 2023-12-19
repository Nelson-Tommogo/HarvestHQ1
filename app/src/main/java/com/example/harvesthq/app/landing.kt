package com.example.harvesthq.app


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.harvesthq.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home() {
    Column {
        StuckAppBar()
        ContainerForAgriculturalProducts()
        ContainerForFrequentlyOrderedProducts()
    }
}

@Composable
fun StuckAppBar() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(color = colorResource(id = R.color.green1))
            .padding(16.dp),
    ) {

        Image(
            painter = painterResource(id = R.drawable.harvesthqlogo),
            contentDescription = "Harvest Logo",
            modifier = Modifier.size(100.dp)
        )

        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Search",
            modifier = Modifier.clickable {
                // Handle search click
            }
                .size(56.dp)
        )

        Icon(
            imageVector = Icons.Default.Settings,
            contentDescription = "Settings",
            modifier = Modifier
                .clickable {
                    // Handle settings click
                }
                .size(36.dp)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AgriculturalProducts() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(color = colorResource(id = R.color.green))
            .padding(16.dp),
        onClick = {

        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("HarvestHQ Products")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FrequentlyOrderedProducts() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.green))
            .padding(16.dp),
        onClick = {
            // Handle click
        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Frequently Ordered Products")
        }
    }
}

@Preview
@Composable
fun HomePreview() {
    val navController = rememberNavController()
    HomePage()
}
