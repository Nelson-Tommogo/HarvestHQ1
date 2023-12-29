
package com.example.harvesthq.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.harvesthq.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BottomNavComposable(navController: NavHostController) {
    val appbarcolor = colorResource(id = R.color.green10)
    val green1 = colorResource(id = R.color.green1)
    val green2 = colorResource(id = R.color.green2)
    val green11 = colorResource(id = R.color.green11)

    val bottomAppBarHeight = 80.dp

    val items = listOf(
        Icons.Default.Home to "Home",
        Icons.Default.ShoppingCart to "Shop",
        Icons.Default.Email to "HQs",
        Icons.Default.Settings to "Settings"
    )

    var selectedItemIndex by rememberSaveable {
        mutableStateOf(0)
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = green2,
    ) {
        Scaffold(
            bottomBar = {
                BottomAppBar(
                    modifier = Modifier
                        .background(appbarcolor)
                        .height(bottomAppBarHeight),
                    contentColor = green1
                ) {
                    items.forEachIndexed { index, (icon, title) ->
                        IconButton(
                            onClick = {
                                selectedItemIndex = index
                                when (index) {
                                    0 -> navController.navigate("Home")
                                    1 -> navController.navigate("shop")
                                    2 -> navController.navigate("hqs")
                                    3 -> navController.navigate("settings")
                                }
                            },
                            modifier = Modifier.weight(1f),
                            content = {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Icon(
                                        imageVector = icon,
                                        contentDescription = title,
                                        tint = if (selectedItemIndex == index) appbarcolor else green11
                                    )
                                    Spacer(modifier = Modifier.height(-15.dp))
                                    Text(
                                        text = title,
                                        color = if (selectedItemIndex == index) appbarcolor else green11,
                                        fontSize = 12.sp
                                    )
                                }
                            }
                        )
                    }
                }
            },
            modifier = Modifier.background(color = appbarcolor),
            content = {

            }
        )
    }
}



@Preview
@Composable
fun BottomNavComposablePreview() {
    val navController = rememberNavController()
    BottomNavComposable(navController = navController)
}