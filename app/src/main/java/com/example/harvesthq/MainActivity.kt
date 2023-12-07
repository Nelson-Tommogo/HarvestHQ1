package com.example.harvesthq

import AnimatedLogo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.harvesthq.navigation.SetupNavigation
import com.example.harvesthq.ui.UI.HarvestHQTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HarvestHQTheme {
                // Create a NavController
                val navController = rememberNavController()

                // Set up navigation
                SetupNavigation(navController)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    HarvestHQTheme {
        // Preview your main screen
        AnimatedLogo {}
    }
}
