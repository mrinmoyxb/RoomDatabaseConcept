package com.example.roomdatabaseconcept.Model

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class UserEvents{
    data class AddUser(val firstName: String, val lastName: String, val age: String): UserEvents()
}

