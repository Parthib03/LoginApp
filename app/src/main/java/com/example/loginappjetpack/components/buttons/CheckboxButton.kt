package com.example.loginappjetpack.components.buttons

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CheckboxButton(
    text: String,
    isChecked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    checkedColor: Color = Color(0xFF4D81E7),
    uncheckedColor: Color = Color(0xFF4D81E7),
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable { onCheckedChange(!isChecked) }
    ) {
        Text(
            text = text,
            fontSize = 14.sp,
            fontWeight = FontWeight.W500,
            color = Color(0xFF6C7278),
            modifier = Modifier.padding(bottom = 2.dp) // Space between text and checkbox
        )
        Checkbox(
            checked = isChecked,
            onCheckedChange = onCheckedChange,
            colors = CheckboxDefaults.colors(
                checkedColor = checkedColor,
                uncheckedColor = uncheckedColor
            ),
            modifier = Modifier.size(16.dp), // Scale the checkbox size
            //shape = RoundedCornerShape(4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CheckboxButtonPreview() {
    var isChecked by remember { mutableStateOf(false) }
    CheckboxButton(
        text = "M",
        isChecked = isChecked,
        onCheckedChange = { isChecked = it }
    )
}
