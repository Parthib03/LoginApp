package com.example.loginappjetpack.components.bars

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginappjetpack.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LocationBar(placeholder: String) {
    var text by remember { mutableStateOf("") }

    Spacer(modifier = Modifier.height(20.dp))
    TextField(
        value = text,
        onValueChange = { text = it },
        placeholder = {
            Text(
                text = placeholder,
                color = Color(0xFF393938),
                fontSize = 10.sp
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(color = Color.White, shape = RoundedCornerShape(6.dp)),
        singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

