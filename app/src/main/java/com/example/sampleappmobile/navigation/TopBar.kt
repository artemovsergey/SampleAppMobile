package com.example.sampleappmobile.navigation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.sampleappmobile.main.SampleAppState
import com.example.sampleappmobile.R.string as AppText

@Composable
fun TopBar(appState: SampleAppState) {
    if (appState.shouldShowArrowBack) {
        TopAppBarWithArrow(
            title = stringResource(id = AppText.app_name),
            goBack = appState.popUp()
        )
    } else {
        TopAppBarWithoutArrow(
            title = stringResource(id = AppText.app_name)
        )
    }
}

@Composable
fun TopAppBarWithoutArrow(
    title: String,
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        },
        backgroundColor = MaterialTheme.colors.background,
        contentColor = contentColorFor(MaterialTheme.colors.background)
    )
}

@Composable
fun TopAppBarWithArrow(
    title: String,
    goBack: () -> Unit,
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth()
            )
        },
        backgroundColor = MaterialTheme.colors.background,
        contentColor = contentColorFor(MaterialTheme.colors.background),
        navigationIcon = {
            IconButton(onClick = goBack) {
                Icon(Icons.Filled.ArrowBack, "BackIcon")
            }
        })
}

@Preview
@Composable
fun PreviewTopAppBarWithoutArrow() {
    TopAppBarWithoutArrow(
        title = "Home"
    )
}

@Preview
@Composable
fun PreviewTopAppBarWithArrow() {
    TopAppBarWithArrow(
        title = "Users",
        goBack = {}
    )
}