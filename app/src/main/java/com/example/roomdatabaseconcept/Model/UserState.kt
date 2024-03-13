package com.example.roomdatabaseconcept.Model

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class UserState(
    val users: List<User> = emptyList(),
    val id: MutableState<String> = mutableStateOf(""),
    val firstName: MutableState<String> = mutableStateOf(""),
    val lastName: MutableState<String> = mutableStateOf(""),
    val age: MutableState<String> = mutableStateOf(""),
)