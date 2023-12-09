import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
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
import kotlinx.coroutines.delay

@Composable
fun AnimatedLogo(onAnimationEnd: () -> Unit = {}) {
    var expanded by remember { mutableStateOf(false) }
    val white = colorResource(id = R.color.white)

    LaunchedEffect(true) {
        // Zoom in
        expanded = true
        delay(3000)

        // Zoom out
        expanded = false
        delay(700)

        // Navigate to signup screen
        onAnimationEnd()
    }

    val transition = updateTransition(targetState = if (expanded) 1f else 0f, label = "scaleAndAlphaTransition")

    val scale by transition.animateFloat(
        transitionSpec = {
            tween(durationMillis = 1000, easing = FastOutLinearInEasing)
        }
    ) { it }

    val alpha by transition.animateFloat(
        transitionSpec = {
            tween(durationMillis = 300, easing = LinearOutSlowInEasing)
        }
    ) { it }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = white
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logonobackground),
                contentDescription = "logo",
                modifier = Modifier
                    .width(700.dp)
                    .height(700.dp)
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
fun splashpreview() {

}
