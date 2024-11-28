package com.example.sampleappmobile.main

import com.example.sampleappmobile.navigation.ScreenRoute

import android.content.res.Resources
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.CoroutineScope

@Composable
fun rememberAppState(
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    navController: NavHostController = rememberNavController(),
    resources: Resources = resources(),
    coroutineScope: CoroutineScope = rememberCoroutineScope()
) = remember(
    scaffoldState,
    navController,
    resources,
    coroutineScope
) {
    SampleAppState(scaffoldState, navController, resources, coroutineScope)
}

class SampleAppState(
    val scaffoldState: ScaffoldState,
    val navController: NavHostController,
    private val resources: Resources,
    coroutineScope: CoroutineScope
){
    private val screensWithArrowBack = ScreenRoute.withArrowBack.map { it.route }

    val shouldShowArrowBack: Boolean
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination?.route in screensWithArrowBack

}


@Composable
@ReadOnlyComposable
fun resources(): Resources {
    LocalConfiguration.current
    return LocalContext.current.resources
}