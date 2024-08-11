package com.example.loginappjetpack.components.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun RadioButtonWithLabel(label: String,
                         isSelected: Boolean,
                         onClick: () -> Unit,
                         radiotxtsize : Int,
                         radiobtnwidth: Int = 0,
                         radiotxtcolor: Color = Color.White,
                         radioselectedcolor: Color = Color.White,
                         radiounselectedcolor: Color = Color.White)
{
    Row(
        modifier = Modifier
//            .fillMaxWidth()
            .height(56.dp)
            .selectable(
                selected = isSelected,
                onClick = onClick,
                role = Role.RadioButton
            )
            ,        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge.copy(
                color = radiotxtcolor,
                fontSize = radiotxtsize.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier.padding(start = 2.dp)
        )
        Spacer(modifier = Modifier.width(radiobtnwidth.dp))
        RadioButton(
            selected = isSelected,
            onClick = null, // null recommended for accessibility with screen readers
            colors = RadioButtonDefaults.colors(
                selectedColor = radioselectedcolor,
                unselectedColor = radiounselectedcolor,
                disabledSelectedColor = Color.White,
                disabledUnselectedColor = Color.LightGray
            )
        )
    }
}

@Preview
@Composable
fun RadioButtonWithLabelPreview() {
    val radioOptions = listOf("Calls", "Missed", "Friends")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[0]) }
    Column(Modifier.selectableGroup()) {
        radioOptions.forEach { text ->
            RadioButtonWithLabel(
                label = text,
                radiotxtsize = 10,
                isSelected = (text == selectedOption),
                onClick = { onOptionSelected(text) }
            )
        }
    }
}
