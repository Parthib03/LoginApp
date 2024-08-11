package com.example.loginappjetpack.components.divider

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.loginappjetpack.R
import com.example.loginappjetpack.components.cards.CompanyCard

@Composable
fun TxtDivider(
    text: String,
    textColor: Color = Color.Black,
    dividerColor: Color = Color.Gray,
    textSize: Int = 16
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp), // Adjust vertical padding as needed
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        // Left Box
        Box(
            modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .border(2.dp, dividerColor)
        )

        // Text
        Text(
            text = text,
            color = textColor,
            fontSize = textSize.sp,
            modifier = Modifier
                .padding(horizontal = 8.dp) // Space between boxes and text
        )

        // Right Box
        Box(
            modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .border(2.dp, dividerColor)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TxtDividerPreview() {
    TxtDivider(
        text = "Or",
        textColor = Color(0xFF6C7278),
        dividerColor = Color(0xFFEDF1F3),
        textSize = 12

    )
}
