package com.example.harvesthq.navigation

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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.harvesthq.R


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun topbarcomposable() {
    Column(
        modifier = Modifier.fillMaxSize(),
        content = {
            topbar()

        }
    )
}
@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun topbar() {
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
                .size(26.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.scanqr),
            contentDescription = "scan",
            modifier = Modifier
                .clickable {

                }
                .size(26.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.set),
            contentDescription = "App setting",
            modifier = Modifier
                .clickable {

                }
                .size(26.dp)
        )
    }
}

@Preview
@Composable
fun articlePreview() {
    topbarcomposable()
}