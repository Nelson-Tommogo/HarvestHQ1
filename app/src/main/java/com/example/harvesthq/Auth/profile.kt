
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.harvesthq.R


@Composable
fun profilepicture(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.green)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            content = {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Picture()
                    DisplayText(name = "Nelson Tommogo", email = "nelsontommogo9@gmail.com")
                }
                Profile()
            }
        )
    }
}




@Composable
fun Profile() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .navigationBarsPadding(),
        color = colorResource(id = R.color.green)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Spacer(modifier = Modifier.height(32.dp))

            // Logout Button with Icon
            ElevatedButton(
                onClick = {
                    // Handle logout logic
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.elevatedButtonColors(
                    contentColor = colorResource(id = R.color.green1)
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start // Align to the start (far left)
                ) {
                    Icon(
                        imageVector = Icons.Default.ExitToApp, // Use built-in logout icon
                        contentDescription = "Logout Icon",
                        modifier = Modifier.size(20.dp),
                        tint = colorResource(id = R.color.green11)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        "Log Out",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 9.dp),
                        color = colorResource(id = R.color.green11)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Picture() {
    RoundCard(modifier = Modifier.padding(16.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(colorResource(id = R.color.green1))
            )

        }
    }
}


@Composable
fun DisplayText(name: String, email: String) {
    Column(
        modifier = Modifier
            .padding(start = 8.dp),
        horizontalAlignment = Alignment.End
    ) {
        Text(
            text = "Name: $name",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = colorResource(id = R.color.green1)
        )

        Text(
            text = "Email: $email",
            fontSize = 16.sp,
            color = colorResource(id = R.color.green1)
        )
    }
}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RoundCard(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Card(
        modifier = modifier
            .size(120.dp)
            .clip(CircleShape)
            .background(color = colorResource(id = R.color.green1))
            .padding(18.dp)
            .shadow(2.dp, shape = CircleShape),
        onClick = {

        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape)
        ) {
            content()
        }
    }
}

@Preview
@Composable
fun ProfilePreview() {
    val navController = rememberNavController()
    profilepicture(navController = navController)
}
