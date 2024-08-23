package com.example.loginappjetpack.components.bars

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginappjetpack.R

@Composable
fun TimeBar(
    width: Int,
    opencloseText: String,
    timeText: String,
    ampmText: String,
    imageResId: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .width(width.dp)
            .border(1.dp, Color(0xFFEDF1F3), RoundedCornerShape(10.dp))
            .background(
                color = Color.White,
                shape = RoundedCornerShape(10.dp)
            )
            .height(46.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Start Text
            Text(
                text = opencloseText,
                fontSize = 10.sp,
                modifier = Modifier.padding(end = 8.dp),
                color = Color(0xFFA5A4A4)
            )

            // Center Box
            Box(
                modifier = Modifier
                    .background(color = Color(0xFFEDF1F3))
                    .fillMaxHeight()
                    .width(1.dp)
            )

            // Time Text
            Text(
                text = timeText,
                fontSize = 10.sp,
                modifier = Modifier.padding(start = 8.dp, end = 2.dp),
                color = Color(0xFFA5A4A4)
            )

            // End Text
            Text(
                text = ampmText,
                fontSize = 10.sp,
                color = Color(0xFFA5A4A4),
                modifier = Modifier.padding(end = 10.dp)
            )

            // Image
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(17.dp)

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TimeBarPreview() {
    MaterialTheme {
        TimeBar(
            width = 129,
            opencloseText = "Open",
            timeText = "6:00",
            ampmText = "AM",
            imageResId = R.drawable.dropdown
        )
    }
}
