
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.harvesthq.R

@Composable
fun AnimatedLogo() {
    var expanded by remember { mutableStateOf(false) }
    val green1 = colorResource(id = R.color.green1)

    // Use animated values
    val scale by animateFloatAsState(if (expanded) 1.5f else 1f)
    val alpha by animateFloatAsState(if (expanded) 0.5f else 1f)

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = green1 // Set your desired background color
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clickable { expanded = !expanded },
            contentAlignment = Alignment.Center
        ) {
            // Add your logo image here
            Image(
                painter = painterResource(id = R.drawable.harvesthqlogo),
                contentDescription = "logo",
                modifier = Modifier
                    .width(100.dp) // Set your desired width
                    .height(100.dp) // Set your desired height
                    .graphicsLayer(
                        scaleX = scale,
                        scaleY = scale,
                        alpha = alpha
                    )
            )
        }
    }
}

@Preview
@Composable
fun splashpreview(){
    AnimatedLogo()
}
