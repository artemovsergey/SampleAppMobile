package com.example.sampleappmobile.ui.features.home.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sampleappmobile.application.repositories.UsersRepository
import com.example.sampleappmobile.domain.models.User


@Composable
fun UserList(
    users: List<User>,
    modifier: Modifier = Modifier,
) {
    LazyColumn(modifier = modifier) {
        items(users, key = { it.id }) { user ->
            UserItem(user)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewUserList() {
    // val users by hiltViewModel<HomeViewModel>().usersListState.collectAsState()
    UserList(
        users = listOf(UsersRepository.SeedData.user1, UsersRepository.SeedData.user2)
    )
}