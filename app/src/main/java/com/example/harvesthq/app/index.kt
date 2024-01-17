package com.example.harvesthq.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.harvesthq.R
import com.example.harvesthq.navigation.Topbar


@Composable
fun show() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.green1)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            content = {
                Topbar()
                index()
                indexpage()
            }
        )
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun indexpage() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(color = colorResource(id = R.color.green1))
            .padding(16.dp),
        shape = RoundedCornerShape(36.dp),
        onClick = {

        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Agricultural adds")

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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun index() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(600.dp)
            .background(color = colorResource(id = R.color.green1))
            .padding(16.dp),
        shape = RoundedCornerShape(36.dp),
        onClick = {

        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Farmers Location here")

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
fun indexPreview(){
    show()
}
