package com.example.harvesthq.Auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.harvesthq.R
import com.example.harvesthq.components.NormalTextComponent


@Composable
fun signup() {
    val green = colorResource(id = R.color.green)
    val green1 = colorResource(id = R.color.green1)
    val green2 = colorResource(id = R.color.green2)
    val green3 = colorResource(id = R.color.green3)
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = green)
            .padding(16.dp)
            .offset(x = 130.dp),
        color = green,
        contentColor = Color.Black
    )
    {
        NormalTextComponent(value = stringResource(R.string.Title))
    }
}
@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    signup()
}