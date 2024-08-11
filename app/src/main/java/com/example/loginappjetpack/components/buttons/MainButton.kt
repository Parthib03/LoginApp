package com.example.loginappjetpack.components.buttons

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
fun MainButton(
    text: String,
    backgroundColor: Color,
    contentColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = TextStyle(
        fontSize = 20.sp, // Default font size
        fontWeight = FontWeight.Bold
    )
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = contentColor
        ),
        modifier = modifier
    ) {
        Text(text = text, style = textStyle)
    }
}

@Preview(showBackground = true)
@Composable
fun MainButtonPreview() {
    MainButton(
        text = "Click Me",
        backgroundColor = Color(0xFF4C3BCF), // Green background
        contentColor = Color.White, // White text
        onClick = { /* Handle button click */ },
        modifier = Modifier.padding(16.dp)
            .fillMaxWidth()
            .height(48.dp)// Adding padding around the button
    )
}