package com.example.loginappjetpack.components.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.example.loginappjetpack.R // Import R to access drawable resources

@Composable
fun CompanyCard(
    bgColor: Color = Color.White,
    height: Int,
    width: Modifier = Modifier.fillMaxWidth(),
    text1: String,
    imageResId: Int, // Changed parameter name for clarity
    textColor: Color = Color.Black
) {
    Card(
        modifier = width
            .height(height.dp)
            .background(bgColor, shape = RoundedCornerShape(10.dp)), // Adjust shape as needed
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
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
                    .size(24.dp)
            )

            // Text
            Text(
                text = "Continue with $text1",
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 10.dp),
                fontWeight = FontWeight.Bold,
                color = textColor
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CompanyCardPreview() {
    CompanyCard(
        bgColor = Color(0xFFF1F1F1),
        height = 45,
        width = Modifier.width(247.dp),
        text1 = "Google",
        imageResId = R.drawable.quickfix, // Ensure this drawable exists
        textColor = Color.Black
    )
}
