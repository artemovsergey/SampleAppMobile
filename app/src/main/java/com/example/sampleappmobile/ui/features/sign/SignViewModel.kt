package com.example.sampleappmobile.ui.features.sign


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sampleappmobile.domain.interfaces.IUserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class SignViewModel @Inject constructor(
    private val userRepository: IUserRepository
) : ViewModel() {

    val usersListState = userRepository.getUsers()
        .stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())
}