package com.example.sampleappmobile.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sampleappmobile.main.SampleAppState
import com.example.sampleappmobile.ui.features.home.HomeScreen
import com.example.sampleappmobile.ui.features.sign.SignScreen

@Composable
fun NavigationHost(
    appState: SampleAppState,
    contentPadding: PaddingValues
) {

    NavHost(
        navController = appState.navController,
        startDestination = NavigationBarSection.Sign.route,
        modifier = Modifier.padding(contentPadding)
    ) {

        val homeRoute = ScreenRoute.Home.route
        val signRoute = ScreenRoute.Sign.route


        val goToHome: () -> Unit = {
            appState.navigate(homeRoute)
        }


        // Home Screen Graph
        composable(NavigationBarSection.Home.route) {
            HomeScreen()
        }

        // Sign Screen Graph
        composable(ScreenRoute.Sign.route) {
            SignScreen(goToHome = goToHome)
        }


    }
}