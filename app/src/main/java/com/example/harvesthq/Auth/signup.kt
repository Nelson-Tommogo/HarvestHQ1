
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.harvesthq.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavHostController, onSignup: (String, String, String, String) -> Unit) {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val white = colorResource(id = R.color.white)
    val green1 = colorResource(id = R.color.green1)
    val green2 = colorResource(id = R.color.green2)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Text fields for entering user details
        Image(
            painter = painterResource(id = R.drawable.harvesthqlogohrs),
            contentDescription = "logo",
            modifier = Modifier
                .size(260.dp)
                .clip(shape = MaterialTheme.shapes.medium)
                .padding(bottom = 0.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "Sign Up",
            fontSize = 24.sp, // Adjust the size as needed
            fontWeight = FontWeight.Bold, // Adjust the weight as needed
            modifier = Modifier.padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = firstName,
            onValueChange = { firstName = it },
            label = { Text("First Name") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            textStyle = LocalTextStyle.current.copy(color = green1),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                cursorColor = green2,
                unfocusedLabelColor = Color.Gray,

                ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = lastName,
            onValueChange = { lastName = it },
            label = { Text("Last Name") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            textStyle = LocalTextStyle.current.copy(color = green1),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                cursorColor = green2,
                unfocusedLabelColor = Color.Gray,

                ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            textStyle = LocalTextStyle.current.copy(color = green1),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                cursorColor = green2,
                unfocusedLabelColor = Color.Gray,

                ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            textStyle = LocalTextStyle.current.copy(color = green1),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                cursorColor = green2,
                unfocusedLabelColor = Color.Gray,

            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )



        // Button for signup
        ElevatedButton(
            {
                onSignup(firstName, lastName, email, password)
                // Navigate to the login screen
                navController.navigate("login") // "login" is the route to your login screen
            },
            Modifier.fillMaxWidth(),
            colors = ButtonDefaults.elevatedButtonColors(
                contentColor = colorResource(id = R.color.green1)
            )
        ) {
            Text("Sign Up")
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun SignupScreenPreview() {
//    HarvestHQTheme {
//        SignupScreen { s, s2, s3, s4 ->  }
//    }
//}
