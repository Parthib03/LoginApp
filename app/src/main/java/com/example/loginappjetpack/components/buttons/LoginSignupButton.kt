package com.example.loginappjetpack.components.buttons

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginSignupButton(
    height: Int,
    buttonText: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = { /* Handle button click */ },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF2667E8), // Button background color
            contentColor = Color.White // Text color
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = modifier
            .fillMaxWidth()
            .height(height.dp) // Set the height of the button
    ) {
        Text(
            text = buttonText,
            lineHeight = 28.sp,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight(600)
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginSignupButtonPreview() {
    MaterialTheme {
        LoginSignupButton(
            height = 48, // Height of the button
            buttonText = "Sign Up" // Button text
        )
    }
}
