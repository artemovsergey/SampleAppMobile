package com.example.sampleappmobile.ui.features.sign

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import com.example.sampleappmobile.main.rememberAppState
import com.example.sampleappmobile.navigation.NavigationHost

@Composable
fun SignScreen(
    modifier: Modifier = Modifier,
    goToHome: () -> Unit
) {

    Button(onClick = { goToHome() }) {
        Text(text = "Home")
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewHomeScreen() {
    SignScreen( goToHome = {})
}