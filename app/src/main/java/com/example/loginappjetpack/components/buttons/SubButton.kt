package com.example.loginappjetpack.components.buttons

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.MaterialTheme

@Composable
fun SubButton(
    text: String,
    backgroundColor: Color,
    contentColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = TextStyle(
        fontSize = 10.sp,
        fontWeight = FontWeight.Normal
    )
) {
    Box(
        modifier = modifier
            .height(14.dp)
            .width(46.dp),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(
                containerColor = backgroundColor,
                contentColor = contentColor
            ),
            shape = RoundedCornerShape(2.dp), // Lower rounded corner value
            modifier = Modifier.fillMaxSize()
        ) {
            // No content in Button
        }
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge.copy(
                textAlign = TextAlign.Center,
                lineHeight = 15.sp,
                fontSize = 10.sp,
                fontWeight = FontWeight.Normal
            ),
            color = contentColor, // Ensures the text color matches the content color
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SubButtonPreview() {
    SubButton(
        text = "Click",
        backgroundColor = Color.Blue,
        contentColor = Color.White,
        onClick = {}
    )
}
