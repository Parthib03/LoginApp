package com.example.loginappjetpack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginappjetpack.components.ProductCard
import com.example.loginappjetpack.components.ProfileCard

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        ProductCard(
            imageRes = R.drawable.lapwork,
            mainText = "Lorem Ipsum",
            subText = "Sub Text",
            buttonText = "Explore",
            onButtonClick = { /* Handle button click */ }
        )

        ProfileCard(
            imageRes = R.drawable.brgrkn,
            profileImageRes = R.drawable.userm2,
            mainText = "Anonymous",
            subText = "Good place with good burgers and fries. Hate the Mayo.",
            extraSubText = "4.20 Km"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
