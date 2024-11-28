package com.example.sampleappmobile.navigation

sealed class ScreenRoute (val route: String) {

    companion object {
        val withArrowBack = listOf(
            Home,
            Sign
        )
    }

    object Home : ScreenRoute("home")
    object Sign : ScreenRoute("sign")

}