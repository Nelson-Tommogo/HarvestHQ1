package com.example.harvesthq.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.harvesthq.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavComposable(navController: NavHostController) {
    val white = colorResource(id = R.color.white)
    val green1 = colorResource(id = R.color.green1)
    val green2 = colorResource(id = R.color.green2)
    val green11 = colorResource(id = R.color.green11)
    val items = listOf(
        Icons.Default.Home to "Home",
        Icons.Default.Search to "Community",
        Icons.Default.Email to "Articles",
        Icons.Default.Settings to "Settings"
    )

    var selectedItemIndex by rememberSaveable {
        mutableStateOf(0)
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.green1) // Set the background color to red
    ) {
        Scaffold(
            bottomBar = {
                BottomAppBar(
                    modifier = Modifier.background(Color.Red), // Set the background color to red
                    contentColor = Color.Black // Set the text color to black
                ) {
                    items.forEachIndexed { index, (icon, title) ->
                        IconButton(
                            onClick = {
                                selectedItemIndex = index
                                // Handle navigation
                            },
                            modifier = Modifier.weight(1f),
                            content = {
                                Icon(
                                    imageVector = icon,
                                    contentDescription = title
                                )
                            }
                        )
                    }
                }
            },
            content = {
                // Your content goes here
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
