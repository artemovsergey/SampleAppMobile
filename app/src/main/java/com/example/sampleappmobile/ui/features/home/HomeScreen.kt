package com.example.sampleappmobile.ui.features.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.sampleappmobile.ui.features.home.components.UserList

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,

) {
    //val users by viewModel.usersListState.collectAsState()
    //UserList(users = users)
}


@Preview(showSystemUi = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}