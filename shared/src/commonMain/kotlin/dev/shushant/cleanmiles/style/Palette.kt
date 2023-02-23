package dev.shushant.cleanmiles.style

import androidx.compose.ui.graphics.Color

object SunAndStormAppColor {
    val Gray = Color.DarkGray
    val Secondary = Color(235, 235, 245,60)
    val DarkGray = Color(32, 32, 32)
    val DarkGraySemi = Color(32, 32, 32,150)
    val PreviewImageAreaHoverColor = Color(45, 45, 45)
    val ToastBackground = Color(23, 23, 23)
    val MiniatureColor = Color(50, 50, 50)
    val MiniatureHoverColor = Color(55, 55, 55)
    val Primary = Color(255, 255, 255)
    val TranslucentBlack = Color(0, 0, 0, 60)
    val TranslucentWhite = Color(255, 255, 255, 20)
    val SemiWhite = Color(255, 255, 255, 30)
    fun buttonBackground(isHover: Boolean) = if (isHover) TranslucentBlack else Color.Transparent
}