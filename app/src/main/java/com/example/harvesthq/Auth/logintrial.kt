
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.harvesthq.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Logintrial(navController: NavHostController, onlogin: (String, String) -> Unit) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val white = colorResource(id = R.color.white)
    val green1 = colorResource(id = R.color.green1)
    val green2 = colorResource(id = R.color.green2)
    val green11 = colorResource(id = R.color.green11)

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Image(
                painter = painterResource(id = R.drawable.harvesthqlogohrs),
                contentDescription = "logo",
                modifier = Modifier
                    .size(250.dp)
                    .clip(shape = MaterialTheme.shapes.medium)
                    .padding(bottom = 16.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Sign In",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp),
                color = colorResource(id = R.color.green1)
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
                    unfocusedLabelColor = colorResource(id = R.color.green11)
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
                    unfocusedLabelColor = colorResource(id = R.color.green11)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )
            ClickableText(
                text = AnnotatedString("Forgot your password?"),
                onClick = {
                    // Navigate to your reset password page
                    navController.navigate("resetpassword")
                },
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .align(Alignment.End),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.green1),
                )
            )

            // Button for sign-in
            ElevatedButton(
                onClick = {
                    onlogin(email, password)
                    navController.navigate("BottomNavBar")
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.elevatedButtonColors(
                    contentColor = colorResource(id = R.color.green1)
                )
            ) {
                Text(
                    "Sign In",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp),
                    color = colorResource(id = R.color.green11)
                )
            }
            Text(
                text = "Or Sign In using",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(top = 16.dp),
                color = colorResource(id = R.color.green1)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                val imageSize = 30.dp

                // Google
                Box(
                    modifier = Modifier
                        .size(imageSize)
                        .background(color = colorResource(id = R.color.green1))
                        .clip(CircleShape)
                        .clickable {
                            // Handle Google click
                        }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "Google",
                        modifier = Modifier.size(imageSize)
                    )
                }

                // Facebook
                Box(
                    modifier = Modifier
                        .size(imageSize)
                        .background(color = colorResource(id = R.color.green1))
                        .clip(CircleShape)
                        .clickable {
                            // Handle Facebook click
                        }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.facebook),
                        contentDescription = "Facebook",
                        modifier = Modifier.size(imageSize)
                    )
                }

                // Twitter
                Box(
                    modifier = Modifier
                        .size(imageSize)
                        .background(color = colorResource(id = R.color.green1))
                        .clip(CircleShape)
                        .clickable {
                            // Handle Twitter click
                        }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.twitter),
                        contentDescription = "Twitter",
                        modifier = Modifier.size(imageSize)
                    )
                }
            }

            ClickableText(
                text = AnnotatedString("Don't Have Account? Sign Up"),
                onClick = {
                    // Navigate to your login page
                    navController.navigate("signup")
                },
                modifier = Modifier.padding(bottom = 16.dp),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = colorResource(id = R.color.green1)
                )
            )
        }
    }
}

@Preview
@Composable
fun LogintrialPreview() {
    val navController = rememberNavController()
    Logintrial(navController = navController, onlogin = { _, _ -> })
}
