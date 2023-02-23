package dev.shushant.cleanmiles

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import dev.shushant.cleanmiles.style.AppTypography
import dev.shushant.cleanmiles.style.DarkColorScheme
import dev.shushant.cleanmiles.style.LightColorScheme

@Composable
internal fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme, content = content, typography = AppTypography
    )
}
