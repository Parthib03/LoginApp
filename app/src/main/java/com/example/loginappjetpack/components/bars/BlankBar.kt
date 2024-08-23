package com.example.loginappjetpack.components.bars

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.font.FontWeight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BlankBar(
    placeholderText: String,
    width: Modifier = Modifier.fillMaxWidth()
) {
    Box(
        modifier = width // Apply the width modifier here
            .height(46.dp)
            .border(1.dp, Color(0xFFEDF1F3), RoundedCornerShape(10.dp)) // Border and shape
    ) {
        TextField(
            value = TextFieldValue(""), // Use TextFieldValue for the value parameter
            onValueChange = {},
            placeholder = {
                Text(
                    text = placeholderText,
                    color = Color(0xFFC3C3C3),
                    fontSize = 12.sp,
                    lineHeight = 17.sp
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White, // White background
                focusedIndicatorColor = Color.Transparent, // No underline
                unfocusedIndicatorColor = Color.Transparent // No underline
            ),
            shape = RoundedCornerShape(10.dp), // 10.dp border radius
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BlankBarPreview() {
    BlankBar(
        placeholderText = "",
        width = Modifier.width(200.dp), // You can change the width here for the preview
    )
}
