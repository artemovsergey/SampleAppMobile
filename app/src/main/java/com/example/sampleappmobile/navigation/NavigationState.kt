package com.example.sampleappmobile.navigation

import com.example.sampleappmobile.main.SampleAppState

fun SampleAppState.popUp(): () -> Unit = {
    navController.popBackStack()
}

fun SampleAppState.navigate(route: String) {
    navController.navigate(route) {
        launchSingleTop = true
    }
}

fun SampleAppState.navigateAndPopUp(route: String, popUp: String) {
    navController.navigate(route) {
        launchSingleTop = true
        popUpTo(popUp) { inclusive = true }
    }
}

fun SampleAppState.navigateSaved(route: String, popUp: String) {
    navController.navigate(route) {
        launchSingleTop = true
        restoreState = true
        popUpTo(popUp) { saveState = true }
    }
}

fun SampleAppState.clearAndNavigate(route: String) {
    navController.navigate(route) {
        launchSingleTop = true
        popUpTo(0) { inclusive = true }
    }
}