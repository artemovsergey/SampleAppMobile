package com.example.sampleappmobile.domain.interfaces

import com.example.sampleappmobile.domain.models.User
import kotlinx.coroutines.flow.Flow

interface IUserRepository {
    fun getUsers(): Flow<List<User>>
}