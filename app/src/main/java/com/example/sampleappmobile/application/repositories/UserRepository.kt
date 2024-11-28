package com.example.sampleappmobile.application.repositories

import com.example.sampleappmobile.domain.interfaces.IUserRepository
import com.example.sampleappmobile.domain.models.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class UsersRepository : IUserRepository {

    companion object SeedData {

        val user1 = User(
            1,
            "user1",
            ""
        )

        val user2 = User(
            2,
            "user2",
            ""
        )
    }

    val users: List<User> =
        listOf(
            user1, user2
        )

    override fun getUsers(): Flow<List<User>> {
        return flowOf(users)
    }
}