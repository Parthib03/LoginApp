package com.example.loginappjetpack.components.buttons

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginappjetpack.R

@Composable
fun LocationButton(
    height: Int = 46,
    text: String,
    textColor: Color = Color.Black,
    imageResId: Int,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = { /* Handle button click */ },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFFFFFFF),
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = modifier
            .fillMaxWidth()
            .height(height.dp) // Set the height of the button
            .border(1.dp, Color(0xFF006FEE), RoundedCornerShape(10.dp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            // Image
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(25.dp)
            )

            // Text
            Text(
                text = text,
                fontSize = 16.sp,
                //modifier = Modifier.padding(start = 10.dp),
                fontWeight = FontWeight(700),
                color = textColor
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LocationButtonPreview() {
    MaterialTheme {
        LocationButton(
            height = 48, // Height of the button
            text = "Enter Your Location", // Button text
            imageResId = R.drawable.locationpin // Replace with your drawable resource
        )
    }
}
