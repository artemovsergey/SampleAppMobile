package com.example.sampleappmobile.common.di

import com.example.sampleappmobile.application.repositories.UsersRepository
import com.example.sampleappmobile.domain.interfaces.IUserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideProductRepository(): IUserRepository {
        return UsersRepository()
    }

}