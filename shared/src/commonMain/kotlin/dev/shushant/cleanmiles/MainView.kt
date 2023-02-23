package dev.shushant.cleanmiles

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import dev.shushant.cleanmiles.details.DetailScreen
import dev.shushant.cleanmiles.listing.ListScreenViewModel
import dev.shushant.cleanmiles.listing.MainScreen
import dev.shushant.cleanmiles.screennavigation.Screen
import dev.shushant.cleanmiles.screennavigation.ScreensState


@Composable
internal fun CommonView() {
    val viewMode = ListScreenViewModel()
    val screenNavigationState = remember { mutableStateOf(ScreensState()) }
    AppTheme {
        when (val state = screenNavigationState.value.screen) {
            is Screen.DetailScreen -> DetailScreen(
                navigationState = screenNavigationState, touristPlace = state.touristPlace
            )
            Screen.MainScreen -> MainScreen(screenNavigationState, viewMode)
        }
    }
}
