package com.example.harvesthq.app

import android.window.SplashScreen
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.harvesthq.R

@Composable
fun SplashScreen() {
    val green1Color = colorResource(id = R.color.green3)

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = green1Color
    ) {
        // Your UI content goes here
    }
}
