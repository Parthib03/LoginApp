package com.example.loginappjetpack.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SmallButton(
    text: String,
    color: Color = Color.Blue,
    fontSize: Int = 14,
    textColor: Color = Color.White,
    borderWidth: Int = 2,
    borderColor: Color = Color.Black,
    borderRoundness: Int = 8,
    buttonWidth: Int = 100,
    buttonHeight: Int = 40,
    textWeight: Int = 400,
    textWidth: Int = buttonWidth, // Default to button width
    textHeight: Int = buttonHeight, // Default to button height
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = color),
        modifier = Modifier
            .size(buttonWidth.dp, buttonHeight.dp)
            .background(color = color, shape = RoundedCornerShape(borderRoundness.dp))
            .border(width = borderWidth.dp, color = borderColor, shape = RoundedCornerShape(borderRoundness.dp))
            .padding(0.dp)
    ) {
        Box(
            modifier = Modifier
                .size(textWidth.dp, textHeight.dp) // Set custom size for text area
                .fillMaxSize()
                .padding(0.dp), // Add padding around the text area

            contentAlignment = Alignment.Center // Center align the text

        ) {
            Text(
                text = text,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight(textWeight),
                style = TextStyle(color = textColor, fontSize = fontSize.sp),
                modifier = Modifier
                    //.fillMaxWidth() // Ensure text takes up the full width of the Box
                    .padding(horizontal = 0.dp, vertical = 0.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SmallButtonPreview() {
    SmallButton(
        text = "Click Me",
        color = Color.Blue,
        fontSize = 10,
        textColor = Color.White,
        borderColor = Color.Black,
        borderRoundness = 8,
        buttonWidth = 100,
        buttonHeight = 40,
        textWidth = 200, // Custom text width
        textHeight = 30, // Custom text height
        onClick = { /* Handle click */ }
    )
}
