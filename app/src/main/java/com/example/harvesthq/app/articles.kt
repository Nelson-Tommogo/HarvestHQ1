package com.example.harvesthq.app


import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.harvesthq.R
import com.example.harvesthq.navigation.Topbar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Articles() {
    Column(
        modifier = Modifier.fillMaxSize(),
        content = {
            Topbar()
            Writer()
            ArticlesBody()
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Writer() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(350.dp)
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
            Text("Articles to be read")

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
fun ArticlesBody() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(350.dp)
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
            Text("Articles Body")

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
fun ArticlePreview() {
    Articles()
}
