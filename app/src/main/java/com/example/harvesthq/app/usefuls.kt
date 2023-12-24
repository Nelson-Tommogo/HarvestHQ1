
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.*
import com.example.harvesthq.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "home"
            ) {
                addHome(navController)
                addSearch(navController)
                addScan(navController)
                addSettings(navController)
                addHHQPDetails(navController)
                addFOPDetails(navController)
            }
        }
    }
}

fun NavGraphBuilder.addHome(navController: NavController) {
    composable("home") {
        HomePageone(navController)
    }
}

fun NavGraphBuilder.addSearch(navController: NavController) {
    composable("search") {
        // Add code for the search destination if needed
    }
}

fun NavGraphBuilder.addScan(navController: NavController) {
    composable("scan") {
        // Add code for the scan destination if needed
    }
}

fun NavGraphBuilder.addSettings(navController: NavController) {
    composable("settings") {
        // Add code for the settings destination if needed
    }
}

fun NavGraphBuilder.addHHQPDetails(navController: NavController) {
    composable("hhqp_details") {
        // Add code for the HHQP details destination if needed
    }
}

fun NavGraphBuilder.addFOPDetails(navController: NavController) {
    composable("fop_details") {
        // Add code for the FOP details destination if needed
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePageone(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Harvest HQ") },
                navigationIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.harvesthqlogo),
                        contentDescription = "Harvest Logo",
                        modifier = Modifier.clickable {
                            navController.navigate("home")
                        }.padding(8.dp)
                    )
                }
            )
        },
        content = {
            Column(
                modifier = Modifier.fillMaxSize(),
                content = {
                    Advertsone()
                    Addsone()
                    HHQPone(navController)
                    FOPone(navController)
                    ADDSone()
                }
            )
        }
    )
}

@Composable
fun AppBarone(navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(color = colorResource(id = R.color.homecards))
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.harvesthqlogo),
            contentDescription = "Harvest Logo",
            modifier = Modifier
                .clickable {
                    navController.navigate("home")
                }
                .weight(2f) // Adjust the weight as needed
        )
        Image(
            painter = painterResource(id = R.drawable.search),
            contentDescription = "Search",
            modifier = Modifier
                .clickable {
                    // Add your action here
                }
                .size(26.dp)
                .weight(1f) // Adjust the weight as needed
        )
        Image(
            painter = painterResource(id = R.drawable.scanqr),
            contentDescription = "QRCODE",
            modifier = Modifier
                .clickable {
                    // Add your action here
                }
                .size(26.dp)
                .weight(1f) // Adjust the weight as needed
        )
        Image(
            painter = painterResource(id = R.drawable.set),
            contentDescription = "setting",
            modifier = Modifier
                .clickable {
                    // Add your action here
                }
                .size(26.dp)
                .weight(1f) // Adjust the weight as needed
        )
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HHQPone(navController: NavController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .background(color = colorResource(id = R.color.green1))
            .padding(16.dp),
        onClick = {
            navController.navigate("hhqp_details")
        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("HarvestHQ Section")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FOPone(navController: NavController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .background(color = colorResource(id = R.color.green1))
            .padding(16.dp),
        onClick = {
            navController.navigate("fop_details")
        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Categories")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Advertsone() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(color = colorResource(id = R.color.green1))
            .padding(16.dp),
        onClick = {
            // Handle card click if needed
        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Adverts")
        }
    }
}

@Composable
fun Addsone() {
    // Your Adds composable content here
}

@Composable
fun ADDSone() {
    // Your ADDS composable content here
}

@Preview
@Composable
fun HomePagePreview() {
    val navController = rememberNavController()
    HomePageone(navController)
}
