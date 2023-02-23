package dev.shushant.cleanmiles

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import dev.shushant.cleanmiles.style.SunAndStormAppColor

@Composable
internal fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = MaterialTheme.colorScheme.copy(
            primary = SunAndStormAppColor.Primary,
            secondary = SunAndStormAppColor.Secondary,
            background = SunAndStormAppColor.DarkGray,
            surface = SunAndStormAppColor.Gray,
            onPrimary = SunAndStormAppColor.Primary,
            onSecondary = Color.Black,
            onBackground = SunAndStormAppColor.Primary,
            onSurface = SunAndStormAppColor.Primary
        )
    ) {
        content()
    }
}
