package com.example.harvesthq.navigation

import AnimatedLogo
import Login
import SignupScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.harvesthq.Auth.reset
import com.example.harvesthq.app.HomePage
import com.example.harvesthq.components.BottomNavComposable
import profilepicture

sealed class Screen(val route: String) {
    object Logo : Screen("logo")
    object SignUp : Screen("signup")
    object LogIn : Screen("login")
    object reset : Screen("resetpassword")
    object Home : Screen("BottomNavBar")
    object homescreen : Screen("Home")
    object setting : Screen("profile")

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
            Login(navController = navController){s, s2 ->  }
        }
        composable(Screen.reset.route){
            reset(navController = navController){s->
            }
        }
        composable(Screen.Home.route){
            BottomNavComposable(navController = navController)
        }
        composable(Screen.homescreen.route){
            HomePage(navController = navController)
        }
        composable(Screen.setting.route){
            profilepicture(navController = navController)
        }
    }
}




