package com.example.harvesthq.app

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.harvesthq.navigation.Topbar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun settings() {
    Column(
        modifier = Modifier.fillMaxSize(),
        content = {
            Topbar()
        }
    )
}


@Preview
@Composable
fun settingPreview(){
    settings()
}