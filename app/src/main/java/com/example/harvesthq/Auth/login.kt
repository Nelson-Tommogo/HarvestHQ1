
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.harvesthq.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(navController: NavHostController, onlogin: (String, String) -> Unit) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val white = colorResource(id = R.color.white)
    val green1 = colorResource(id = R.color.green1)
    val green2 = colorResource(id = R.color.green2)
    val green11 = colorResource(id = R.color.green11)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
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
                .padding(bottom = 0.dp),
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
                navController.navigate("resetpassword")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.elevatedButtonColors(
                contentColor = colorResource(id = R.color.green1)
            )
        ) {
            Text("Sign In",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp),
                color = colorResource(id = R.color.green11)
            )
        }
        Text(
            text = "Don't have an account?",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 16.dp),
            color = colorResource(id = R.color.green1)
        )
        ClickableText(
            text = AnnotatedString("Sign Up"),
            onClick = {
                // Navigate to your login page
                navController.navigate("signup")
            },
            modifier = Modifier.padding(bottom = 16.dp),
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.ExtraBold,
                color =colorResource(id = R.color.green1)
            )
        )
    }
    fun login(){

    }
}

