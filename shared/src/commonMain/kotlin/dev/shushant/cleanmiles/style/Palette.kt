package dev.shushant.cleanmiles.style

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

object SunAndStormAppColor {
    val Gray = Color.DarkGray
    val Secondary = Color(235, 235, 245, 60)
    val SecondaryLight = Color(60, 60, 67, 60)
    val DarkGray = Color(32, 32, 32)
    val DarkGraySemi = Color(32, 32, 32, 150)
    val PrimaryContainer = Color(235, 235, 245, 30)
    val ToastBackground = Color(23, 23, 23)
    val InversePrimary = Color(235, 235, 245, 18)
    val MiniatureHoverColor = Color(55, 55, 55)
    val Primary = Color(255, 255, 255)
    val TertiaryLight = Color(60, 60, 67, 30)
    val PrimaryLight = Color(0, 0, 0, 1)
    val TranslucentBlack = Color(0, 0, 0, 60)
    val TranslucentWhite = Color(255, 255, 255, 20)
    val SemiWhite = Color(255, 255, 255, 30)
    fun buttonBackground(isHover: Boolean) = if (isHover) TranslucentBlack else Color.Transparent
}

val DarkColorScheme = darkColorScheme(
    primary = SunAndStormAppColor.Primary,
    secondary = SunAndStormAppColor.Secondary,
    background = SunAndStormAppColor.DarkGray,
    primaryContainer = SunAndStormAppColor.PrimaryContainer,
    surface = SunAndStormAppColor.Gray,
    onPrimary = SunAndStormAppColor.Primary,
    onSecondary = Color.Black,
    inversePrimary = SunAndStormAppColor.InversePrimary,
    onBackground = SunAndStormAppColor.Primary,
    onSurface = SunAndStormAppColor.Primary
)
val LightColorScheme = lightColorScheme(
    primary = SunAndStormAppColor.PrimaryLight,
    secondary = SunAndStormAppColor.SecondaryLight,
    background = SunAndStormAppColor.DarkGray,
    primaryContainer = SunAndStormAppColor.PrimaryContainer,
    surface = SunAndStormAppColor.Gray,
    onPrimary = SunAndStormAppColor.Primary,
    tertiary= SunAndStormAppColor.TertiaryLight,
    onSecondary = Color.Black,
    inversePrimary = SunAndStormAppColor.InversePrimary,
    onBackground = SunAndStormAppColor.Primary,
    onSurface = SunAndStormAppColor.Primary
)