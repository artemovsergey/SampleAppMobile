package com.example.sampleappmobile.main

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sampleappmobile.navigation.BottomBar
import com.example.sampleappmobile.navigation.NavigationHost

@Composable
fun SampleAppScreen() {

    val appState = rememberAppState()

    Scaffold(
        bottomBar = { BottomBar(navController = appState.navController) }
    ) { contentPadding ->
        NavigationHost(appState = appState, contentPadding)
    }

}

@Preview(showSystemUi = true)
@Composable
fun OrderNowScreenPreview1(){
    SampleAppScreen()
}