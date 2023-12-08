package com.example.harvesthq.Auth


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.harvesthq.R
import com.example.harvesthq.ui.UI.HarvestHQTheme

@Composable
fun reset(onSignup: (String, String, String, String) -> Unit) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

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
            text = "Reset Password",
            fontSize = 24.sp, // Adjust the size as needed
            fontWeight = FontWeight.Bold, // Adjust the weight as needed
            modifier = Modifier.padding(bottom = 16.dp)
        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        // Button for signup
        Button(
            onClick = { onreRet(email, password) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Password Reset Link")
        }

    }
}

fun onreRet(email: String, password: String) {
    TODO("Not yet implemented")
}

@Preview(showBackground = true)
@Composable
fun reset() {
    HarvestHQTheme {
        reset() { s, s2, s3, s4 ->  }
    }
}

