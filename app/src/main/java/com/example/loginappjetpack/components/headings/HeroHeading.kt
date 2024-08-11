package com.example.loginappjetpack.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeroHeading(
    leftText: String
) {
    Row(modifier = Modifier.fillMaxWidth()
        .padding(top = 33.dp)) {
        Text(
            text = leftText,
            style = MaterialTheme.typography.bodyLarge.copy(fontSize = 26.sp, fontWeight = FontWeight.Bold, color = Color(0xFF393938)),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = " Friend",
            style = MaterialTheme.typography.bodyLarge.copy(fontSize = 26.sp, fontWeight = FontWeight.Bold, color = Color(0xFF4B3BCF)),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}
