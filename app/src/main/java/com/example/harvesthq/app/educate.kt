package com.example.harvesthq.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
                imageResId = R.drawable.crops,
                isDropdownVisible = isDropdownVisible,
                onToggleDropdown = { isDropdownVisible = !isDropdownVisible }
            )

            DropdownText(
                text = "Agroforestry:",
                description = "Integrating trees and shrubs into agricultural landscapes to enhance environmental sustainability, biodiversity, and overall productivity.",
                imageResId = R.drawable.croprotation,
                isDropdownVisible = isDropdownVisible,
                onToggleDropdown = { isDropdownVisible = !isDropdownVisible }
            )
            DropdownText(
                text = "Cover Crops/Mulching",
                description = "Plants grown to protect and enrich the soil during periods when the main crop is not growing, preventing erosion and improving soil fertility.",
                imageResId = R.drawable.mulching,
                isDropdownVisible = isDropdownVisible,
                onToggleDropdown = { isDropdownVisible = !isDropdownVisible }
            )

            DropdownText(
                text = "Drip Irrigation",
                description = " is a type of micro-irrigation system that has the potential to save water and nutrients by allowing water to drip slowly to the roots of plants, either from above the soil surface or buried below the surface. The goal is to place water directly into the root zone and minimize evaporation.",
                imageResId = R.drawable.drip,
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
    imageResId: Int,
    isDropdownVisible: Boolean,
    onToggleDropdown: () -> Unit
) {
    Column(
        modifier = Modifier.clickable { onToggleDropdown() }
    ) {
        // Display image using Image composable
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = null, // Set a meaningful description if needed
            modifier = Modifier.size(24.dp) // Adjust the size as needed
        )

        // Display text and description
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface
        )

        Text(
            text = if (isDropdownVisible) description else "",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurface
        )
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