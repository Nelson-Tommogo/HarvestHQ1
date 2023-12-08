//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material.icons.filled.Send
//import androidx.compose.material.icons.filled.Settings
//import androidx.compose.material3.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.example.harvesthq.R
//
//
//@Composable
//fun Bottomnav(value: String) {
//    Column(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        // Your existing content
//        Text(
//            text = value,
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(80.dp),
//            style = MaterialTheme.typography.bodySmall // Use a text style from MaterialTheme
//        )
//
//        // Bottom Navigation
//        BottomNavigation(
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(MaterialTheme.colorScheme.primary)
//        ) {
//            BottomNavigationItem(
//                icon = { Icon(Icons.Default.Home, contentDescription = "Home Icon") },
//                label = { Text(text = stringResource(id = R.string.Home)) },
//                selected = false, // Set selected to true for the active tab
//                onClick = {
//                /* Handle navigation to Home */
//                }
//            )
//            BottomNavigationItem(
//                icon = { Icon(Icons.Default.Search, contentDescription = "Articles") },
//                label = { Text(text = stringResource(id = R.string.articles)) },
//                selected = false,
//                onClick = {
//                }
//            )
//            BottomNavigationItem(
//                icon = { Icon(Icons.Default.Send, contentDescription = "Articles") },
//                label = { Text(text = stringResource(id = R.string.community)) },
//                selected = false,
//                onClick = {
//                }
//            )
//            BottomNavigationItem(
//                icon = { Icon(Icons.Default.Settings, contentDescription = "Profile") },
//                label = { Text(text = stringResource(id = R.string.profile)) },
//                selected = false,
//                onClick = {
//                }
//            )
//        }
//    }
//}
//
//@Preview
//@Composable
//fun DefaultPreviewOfBottomNavigation() {
//    Surface {
//        Bottomnav(value = "Bottom Nav Bar")
//    }
//}
