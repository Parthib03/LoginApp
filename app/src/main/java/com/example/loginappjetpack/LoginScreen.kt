package com.example.loginappjetpack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.loginappjetpack.components.buttons.MainButton
import com.example.loginappjetpack.utils.validateInputs

@Composable
fun LoginScreen(navController: NavController) {
    val emailState = remember { mutableStateOf("") }
    val passwordState = remember { mutableStateOf("") }
    val context = LocalContext.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Login Image",
                modifier = Modifier.size(300.dp)
            )

            Text(
                text = "Sign In",
                color = Color.Yellow,
                fontSize = 40.sp,
                modifier = Modifier.padding(bottom = 20.dp)
            )

            Text(
                text = "Email",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
                    .align(Alignment.Start)
            )

            TextField(
                value = emailState.value,
                onValueChange = { newText -> emailState.value = newText },
                placeholder = { Text("Enter your email") },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
            )

            Text(
                text = "Password",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 8.dp)
                    .align(Alignment.Start)
            )

            TextField(
                value = passwordState.value,
                onValueChange = { newText -> passwordState.value = newText },
                placeholder = { Text("Enter your password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
            )

            MainButton(
                text = "Login",
                backgroundColor = Color.Yellow,
                contentColor = Color.Black,
                onClick = {
                    val isValid = validateInputs(
                        email = emailState.value,
                        password = passwordState.value,
                        context = context
                    )
                    if (isValid) {
                        navController.navigate("signedin")
                    }
                },
                modifier = Modifier
                    .padding(top = 40.dp)
                    .fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}