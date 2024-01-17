package com.example.harvesthq.app

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.harvesthq.R
import com.example.harvesthq.navigation.Topbar

@Composable
fun Education() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.green1)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            content = {
                Topbar()
                EducationContent()
            }
        )
    }
}

@Composable
fun EducationContent() {
    var isDropdownVisible by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Other content

            DropdownText(
                text = "Crop Rotation",
                description = "The practice of growing different crops in the same area in sequential seasons to improve soil health and prevent pests and diseases.",
                isDropdownVisible = isDropdownVisible,
                onToggleDropdown = { isDropdownVisible = !isDropdownVisible }
            )

            DropdownText(
                text = "Agroforestry:",
                description = " Integrating trees and shrubs into agricultural landscapes to enhance environmental sustainability, biodiversity, and overall productivity.\n" +
                        "Hydroponics:",
                isDropdownVisible = isDropdownVisible,
                onToggleDropdown = { isDropdownVisible = !isDropdownVisible }
            )
            DropdownText(
                text = "Cover Crops",
                description = "  Plants grown to protect and enrich the soil during periods when the main crop is not growing, preventing erosion and improving soil fertility.",
                isDropdownVisible = isDropdownVisible,
                onToggleDropdown = { isDropdownVisible = !isDropdownVisible }
            )
            DropdownText(
                text = "Integrated Pest Management (IPM):",
                description = " A holistic approach to managing pests that combines biological, cultural, physical, and chemical methods to minimize damage to crops.",
                isDropdownVisible = isDropdownVisible,
                onToggleDropdown = { isDropdownVisible = !isDropdownVisible }
            )
            DropdownText(
                text = "Precision Agriculture:",
                description = "Utilizing technology, such as GPS and sensors, to optimize field-level management with regard to crop farming.",
                isDropdownVisible = isDropdownVisible,
                onToggleDropdown = { isDropdownVisible = !isDropdownVisible }
            )
            DropdownText(
                text = "Drip Irrigation:",
                description = "A water-efficient irrigation method that delivers water directly to the base of plants, minimizing water wastage.",
                isDropdownVisible = isDropdownVisible,
                onToggleDropdown = { isDropdownVisible = !isDropdownVisible }
            )
        }
    }
}

@Composable
fun DropdownText(
    text: String,
    description: String,
    isDropdownVisible: Boolean,
    onToggleDropdown: () -> Unit
) {
    Row {
        Text(text = text, style = MaterialTheme.typography.bodySmall)
        DropdownIcon(isDropdownVisible, onToggleDropdown)
    }

    DropdownMenu(
        expanded = isDropdownVisible,
        onDismissRequest = { onToggleDropdown() },
    ) {
        DropdownMenuItem(
            onClick = {

            }
        ) {
        }
    }

}

fun DropdownMenuItem(onClick: () -> Unit, interactionSource: () -> Unit) {
    TODO("Not yet implemented")
}

@Composable
fun DropdownIcon(isDropdownVisible: Boolean, onToggleDropdown: () -> Unit) {
    val icon = if (isDropdownVisible) Icons.Default.KeyboardArrowUp else Icons.Default.ArrowDropDown
    Icon(
        imageVector = icon,
        contentDescription = null,
        modifier = Modifier
            .clickable { onToggleDropdown() }
            .padding(start = 4.dp)
    )
}

@Preview
@Composable
fun EducationContentPreview() {
    Education()
}