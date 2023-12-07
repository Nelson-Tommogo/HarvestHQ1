package com.example.harvesthq.navigation

import AnimatedLogo
import Login
import SignupScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

sealed class Screen(val route: String) {
    object Logo : Screen("logo")
    object SignUp : Screen("signup")
    object LogIn : Screen("login")

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
            SignupScreen(navController = navController) { s, s2, s3, s4 ->
                // Handle signup logic here
            }
        }
        composable(Screen.LogIn.route) {
            Login { s, s2, s3, s4 ->  }
        }
    }
}
