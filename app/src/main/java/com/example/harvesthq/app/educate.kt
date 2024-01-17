package com.example.harvesthq.app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.harvesthq.navigation.Topbar

@Composable
fun Education() {
    Column(
        modifier = Modifier.fillMaxSize(),
        content = {
            Topbar()
            EducationContent()
        }
    )
}

@Composable
fun EducationContent() {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Types of Farming in Africa",
                style = MaterialTheme.typography.displayMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )

            Text(
                text = "There are 10 types in Africa.",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface
            )

            Text(
                text = "Learn more about irrigation on YouTube:",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurface
            )

//            VideoPlayer(url = "https://youtu.be/Z9HAy9EYKKs?si=-jR0er2nNalh8OKL")
        }
    }
}

//@Composable
//fun VideoPlayer(url: String) {
//    AndroidView(
//        factory = { context ->
//            WebView(context).apply {
//                settings.javaScriptEnabled = true
//                webViewClient = WebViewClient()
//                webChromeClient = WebChromeClient()
//                loadUrl(url)
//            }
//        },
//        modifier = Modifier
//            .fillMaxSize()
//            .clickable { /* Handle clicks if needed */ }
//    ) { webView ->
//        // Handle WebView callbacks if needed
//    }
//}

@Preview(device = Devices.PIXEL_4)
@Composable
fun EducationPreview() {
    Education()
}

