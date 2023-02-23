package dev.shushant.cleanmiles

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import dev.shushant.cleanmiles.style.SunAndStormAppColor

@Composable
internal fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = MaterialTheme.colors.copy(
            primary = SunAndStormAppColor.Foreground,
            secondary = SunAndStormAppColor.LightGray,
            background = SunAndStormAppColor.DarkGray,
            surface = SunAndStormAppColor.Gray,
            onPrimary = SunAndStormAppColor.Foreground,
            onSecondary = Color.Black,
            onBackground = SunAndStormAppColor.Foreground,
            onSurface = SunAndStormAppColor.Foreground
        )
    ) {
        content()
    }
}
