package com.example.harvesthq.Auth

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
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
            .fillMaxSize(),
        color = green1
    ) {
        NormalTextComponent(value = stringResource(R.string.Title))
    }
}
@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    signup()
}