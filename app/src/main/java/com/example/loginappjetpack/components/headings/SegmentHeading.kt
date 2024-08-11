package com.example.loginappjetpack.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SegmentHeader(
    leftText: String,
    leftTextWidth: Int = 200,
    lineHeight: Int = 36
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 17.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.width(leftTextWidth.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = leftText,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1E1E1E),
                    lineHeight = lineHeight.sp
                ),
                maxLines = Int.MAX_VALUE,
                overflow = TextOverflow.Clip
            )
        }
        Box(
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "See All",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 10.sp,
                    color = Color(0xFF393938)
                )
            )
        }
    }
}
