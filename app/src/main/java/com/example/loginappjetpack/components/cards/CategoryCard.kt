package com.example.loginappjetpack.components.cards

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CategoryCard(
    vector: ImageVector,
    text: String,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        modifier = Modifier.padding(bottom = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .size(65.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0xFFA8FF51), Color(0xFFC1F3A9)),
                        start = androidx.compose.ui.geometry.Offset(20f, 20f),
                        end = androidx.compose.ui.geometry.Offset(300f, 300f)
                    ),
                    shape = CircleShape
                )
                .clickable(onClick = onClick),
            contentAlignment = androidx.compose.ui.Alignment.Center
        ) {
            androidx.compose.foundation.Image(
                imageVector = vector,
                contentDescription = null,
                modifier = Modifier.size(35.dp)
            )
        }
        Text(
            text = text,
            fontSize = 8.sp,
            fontWeight = FontWeight(400),
            style = TextStyle(color = Color(0xFF393938), fontSize = 16.sp),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 4.dp)
                .widthIn(max = 50.dp)
        )
    }
}

@Preview
@Composable
fun CategoryCardPreview() {
    CategoryCard(
        vector = ImageVector.vectorResource(id = com.example.loginappjetpack.R.drawable.searchglass),
        text = "Sample Text",
        onClick = { /* Do something */ }
    )
}
