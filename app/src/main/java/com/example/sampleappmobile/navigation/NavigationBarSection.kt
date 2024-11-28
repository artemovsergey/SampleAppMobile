package com.example.sampleappmobile.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.sampleappmobile.R.string as AppText

sealed class NavigationBarSection(
    @StringRes val title: Int,
    val icon: ImageVector,
    val route: String
) {
    companion object {
        val sections = listOf(
            Home,
            Sign
        )
    }

    object Home : NavigationBarSection(
        title = AppText.home,
        icon = Icons.Filled.Home,
        route = "home"
    )

    object Sign : NavigationBarSection(
        title = AppText.users,
        icon = Icons.Filled.Person,
        route = "sign"
    )
}