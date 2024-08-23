package com.example.loginappjetpack.components.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginappjetpack.components.buttons.SubButton

@Composable
fun ProductCard(
    imageRes: Int,
    mainText: String,
    subText: String,
    buttonText: String,
    onButtonClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .height(146.dp)
            .width(143.dp)
            .padding(bottom = 8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 7.dp)
            ) {
                Text(
                    text = mainText,
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 16.sp,
                        lineHeight = 15.sp

                    ),
                    //modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = subText,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray,
                        fontSize = 8.sp,
                        lineHeight = 10.sp
                    )
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 9.dp, bottom = 9.dp),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Bottom
            ) {
                SubButton(
                    text = buttonText,
                    backgroundColor = Color(0xFF0E64D2),
                    contentColor = Color.White,
                    onClick = onButtonClick
                )
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun ProductCardPreview() {
//    ProductCard(
//        imageRes = R.drawable.lapwork, // Replace with a valid drawable resource
//        mainText = "Main Text",
//        subText = "Sub Text",
//        buttonText = "Button",
//        onButtonClick = { /* Handle button click */ }
//    )
//}
