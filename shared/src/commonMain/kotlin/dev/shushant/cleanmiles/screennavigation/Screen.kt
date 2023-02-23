package dev.shushant.cleanmiles.screennavigation

import dev.shushant.cleanmiles.listing.TouristPlace

sealed interface Screen {
    object MainScreen : Screen
    data class DetailScreen(val touristPlace: TouristPlace) : Screen
}

data class ScreensState(val screen: Screen = Screen.MainScreen)