package com.example.harvesthq.navigation

import AnimatedLogo
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.harvesthq.Auth.signup

sealed class Screen(val route: String) {
    object Logo : Screen("logo")
    object SignUp : Screen("signup")
}

@Composable
fun SetupNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Logo.route) {
        composable(Screen.Logo.route) {
            AnimatedLogo {
                navController.navigate(Screen.SignUp.route)
            }
        }
        composable(Screen.SignUp.route) {
            signup()
        }
    }
}
