
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
                .size(250.dp)
                .clip(shape = MaterialTheme.shapes.medium)
                .padding(bottom = 0.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "Hi!",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
            color = colorResource(id = R.color.green1)
        )
        Text(
            text = "Welcome ",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
            color = colorResource(id = R.color.green1)
        )
        Text(
            text = "Let's create an Account",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
            color = colorResource(id = R.color.green1)
        )
        OutlinedTextField(
            value = firstName,
            onValueChange = { firstName = it },
            label = { Text("Full Name") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            textStyle = LocalTextStyle.current.copy(color = green1),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                cursorColor = green2,
                unfocusedLabelColor = colorResource(id = R.color.green1)

                ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .clip(MaterialTheme.shapes.extraSmall)
        )

//        OutlinedTextField(
//            value = lastName,
//            onValueChange = { lastName = it },
//            label = { Text("Last Name") },
//            keyboardOptions = KeyboardOptions.Default.copy(
//                keyboardType = KeyboardType.Text,
//                imeAction = ImeAction.Done
//            ),
//            textStyle = LocalTextStyle.current.copy(color = green1),
//            colors = TextFieldDefaults.outlinedTextFieldColors(
//                cursorColor = green2,
//                unfocusedLabelColor =colorResource(id = R.color.green1)
//
//                ),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(bottom = 16.dp)
//                .clip(MaterialTheme.shapes.extraSmall)
//        )

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
                unfocusedLabelColor = colorResource(id = R.color.green1)

                ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .clip(MaterialTheme.shapes.extraSmall)
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
                unfocusedLabelColor = colorResource(id = R.color.green1)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .clip(MaterialTheme.shapes.extraSmall)
        )


        // Button for signup
        ElevatedButton(
            {
                onSignup(firstName, lastName, email, password)
                navController.navigate("login") // "login" is the route to your login screen
            },
            Modifier.fillMaxWidth()
                .background(color = colorResource(id = R.color.green11)),
            colors = ButtonDefaults.elevatedButtonColors(
                contentColor = colorResource(id = R.color.green1)
            )
        ) {
            Text("Sign Up",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp),
                color = colorResource(id = R.color.green1)
            )
        }
        Text(
            text = "Or Sign up With",
            fontSize = 12.sp,
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
            text = AnnotatedString("Have an Account?Sign In"),
            onClick = {
                // Navigate to your login page
                navController.navigate("login")
            },
            modifier = Modifier.padding(bottom = 16.dp),
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.ExtraBold,
                color =colorResource(id = R.color.green1)
            )
        )
    }
}

@Preview
@Composable
fun signUpPreview() {
    val navController = rememberNavController()
    SignupScreen(navController = navController, onSignup = {s, s2, s3, s4 ->  } )
}
