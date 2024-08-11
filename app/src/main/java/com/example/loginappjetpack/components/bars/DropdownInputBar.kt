package com.example.loginappjetpack.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.example.loginappjetpack.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropdownInputBar(
    labelText: String,
    placeholderText: String,
    image: Painter
) {
    Column(
        modifier = Modifier
            .padding(bottom = 16.dp)
    ) {
        Text(
            text = labelText,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 2.dp),
            color = Color(0xFF6C7278)
        )
        Box(
            modifier = Modifier
                //.width(279.dp)
                .fillMaxWidth()
                .height(46.dp)
                .border(1.dp, Color(0xFFEDF1F3), RoundedCornerShape(10.dp)),
        ) {
            TextField(
                value = TextFieldValue(""),
                onValueChange = {},
                placeholder = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.Center // Centers the row's content horizontally
                    ) {
                        Text(
                            text = placeholderText,
                            color = Color(0xFFC3C3C3),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            lineHeight = 17.sp,
                            modifier = Modifier
                                .weight(1f) // Ensures the text takes up the available space
                        )
                        Image(
                            painter = image,
                            contentDescription = "Dropdown",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White, // White background
                    focusedIndicatorColor = Color.Transparent, // No underline
                    unfocusedIndicatorColor = Color.Transparent // No underline
                ),
                shape = RoundedCornerShape(10.dp), // 10.dp border radius
                modifier = Modifier
                    .fillMaxSize()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DropdownInputBarPreview() {
    DropdownInputBar(
        labelText = "Country",
        placeholderText = "India",
        image = painterResource(id = R.drawable.dropdown) // Replace with your drawable resource
    )
}
