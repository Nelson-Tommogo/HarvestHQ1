//package com.example.harvesthq.components
//
//import android.annotation.SuppressLint
//import androidx.compose.foundation.background
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Email
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material.icons.filled.Settings
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.runtime.saveable.rememberSaveable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.colorResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.example.harvesthq.R
//
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun BottomNav(navController: NavHostController) {
//    val white = colorResource(id = R.color.white)
//    val green2 = colorResource(id = R.color.green2)
//    val items = listOf(
//        Icons.Default.Home to "Home",
//        Icons.Default.Search to "Community",
//        Icons.Default.Email to "Articles",
//        Icons.Default.Settings to "Settings"
//    )
//
//    var selectedItemIndex by rememberSaveable {
//        mutableStateOf(0)
//    }
//
//    Scaffold(
//        bottomBar = {
//            BottomAppBar(
//                modifier = Modifier.background(Color.Red),
//                contentColor = Color.Black
//            ) {
//                items.forEachIndexed { index, (icon, title) ->
//                    bottomnav(
//                        selected = selectedItemIndex == index,
//                        onClick = {
//                            selectedItemIndex = index
//                            // Handle navigation
//                        },
//                        label = { Text
//                            (title) },
//                        icon = {
//                            Icon(
//                                imageVector = icon,
//                                contentDescription = title,
//                                tint = if (selectedItemIndex == index) white else green2
//                            )
//                        }
//                    )
//                }
//            }
//        },
//        content = {
//            // Your content goes here
//        }
//    )
//}
//
//@Composable
//fun Text() {
//    TODO("Not yet implemented")
//}
//
//@Preview
//@Composable
//fun BottomNavPreview() {
//    val navController = rememberNavController()
//    BottomNav(navController = navController)
//}
