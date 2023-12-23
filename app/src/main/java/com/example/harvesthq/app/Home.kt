package com.example.harvesthq.app

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
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
fun HomePage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        content = {
            AppBar()
            Adverts()
            Adds()
            HHQP()
            FOP()
            ADDS()
        }
    )
}

@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun Adds(){
}

@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun ADDS(){

}

@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun AppBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(color = colorResource(id = R.color.homecards))
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(id = R.drawable.harvesthqlogo),
            contentDescription = "Harvest Logo",
            modifier = Modifier.size(100.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.search),
            contentDescription = "Search",
            modifier = Modifier
                .clickable {
                }
                .size(36.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.scanqr),
            contentDescription = "scan",
            modifier = Modifier
                .clickable {

                }
                .size(36.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.set),
            contentDescription = "App setting",
            modifier = Modifier
                .clickable {

                }
                .size(36.dp)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HHQP() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
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
            Text("HarvestHQ Section")

            // Nested Cards
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

            }
        }
    }
}

@Composable
fun ButtonWithText(text: String, backgroundColor: Int) {
    ElevatedButton(
        onClick = {},
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

            // Nested Cards
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
    HomePage()
}
